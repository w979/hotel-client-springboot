package com.sevenhome.controller;


import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.sevenhome.config.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author wry
 * @date 2022/1/23 23:32
 */
@Controller
@RequestMapping(value="/Alipay")
public class AlipayController {

    /**
     * 结算界面
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/PayPage")
    public String  payController (@RequestParam("orderno") String orderno,
                                  @RequestParam("money")String money,
                                  @RequestParam("name")String name, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.APP_ID, AlipayConfig.APP_PRIVATE_KEY, "json", AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填

        String out_trade_no = orderno;
        //付款金额，必填  ShopName
        String total_amount = money;
        //订单名称，必填
        String subject = name;
        //商品描述，可空
        String body =request.getParameter("wry-test");
        // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
        String timeout_express = "1c";
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"timeout_express\":\""+ timeout_express +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求
        String url = "";
        try {
            url = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        System.out.println(url);
        return url;
    }

    /**
     * 同步跳转：
     * 同步返回响应参数报文时会自动进行验签，
     * 无需自己再单独对同步响应数据作验签处理
     *
     * @param request
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/returnUrl")
    @CrossOrigin
    public ModelAndView returnUrl(HttpServletRequest request) throws Exception {
        ModelAndView mav = new ModelAndView();
        Map<String, String[]> requestParams = request.getParameterMap();
        System.out.println("同步返回："+ JSON.toJSONString(requestParams));
        // 返回界面
        mav.setViewName("/");
        return mav;
    }

    /**
     * 支付宝服务器异步通知
     *
     * @param request
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/notifyUrl")
    public void notifyUrl(HttpServletRequest request) throws Exception {
        // 获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.CHARSET, AlipayConfig.sign_type); // 调用SDK验证签名

        if (signVerified) { // 验证成功 更新订单信息
            System.out.println("异步通知成功");
            // 商户订单号
            String out_trade_no = request.getParameter("out_trade_no");
            System.out.println("商户订单号: "+out_trade_no);
            // 交易状态
            String trade_status = request.getParameter("trade_status");
            System.out.println("交易状态: "+trade_status);
            // 修改数据库
        } else {
            System.out.println("异步通知失败");
        }
    }
}
