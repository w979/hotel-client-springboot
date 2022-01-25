package com.sevenhome.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 支付demo
 * @author wry
 * @date 2022/1/23 22:10
 */
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2021000118696547"; //测试

    // 商户私钥，您的PKCS8格式RSA2私钥
   public static String APP_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCf23bkb2z3X5Z6kiZ4tT6DCOq0fHqThaTwnPOJrF0ARZtAcEtDKks3FaBdmRYjG9SK9z+E6mqLxrNZrcf87LlJvxuuOipu8kYmc43ryT7cO2/14I2Wo8oAA0xCt23QauXMkgRqfy8yze2KjLMWAB2qcKuP/+BJ5wdYs5WIscRLKJkhI9msBBJxJNR2PYBhC0EmoO2iDjSisu1zQxU736g1RjOvOuIy43Eo+GYlR3o/NF3zGzP+YkFaHO7zhMMBim+YHifgVDNOkDqhgwqMSSNatzNN2J9EvNW6aAKEIHeLRwI06zsekYeGLESi7pNduhxo8mdyoM6VT3FlwtSVnQb3AgMBAAECggEAZUU1ZrYoQ/asb+4SrTm05nJJrhmF1ds+iKgFqNwm9rsiBYqeQ2iRyc3LkEAhRBCnb3n/JYcUBITWriNnpJWbNFr7gD6dDzgwtL9T02HkjsSgwxWE3T/aAnQUZdeqm/R8rEJ8xbLZBchrifBkq7VbFdTW+xzQzECt6MWsH7LudeW7yCWvmTJcVIU2CrHZcBOAAvLG753d7XGl5SXGGJod0VBAi5kSQU9BhWjhqUKtXFkO29wxk074AhlNI8yz2/L8GjxgwtRVQ3j5MijZaf/4LMDeJw0VI21RMA67uThRvgeU9Jw+6kESGAC+YCGFobr0olvJNvba/9JmLJhf0yTWIQKBgQDShk/I427Oc3cR9r/PkVRJGH80BNa3NJSHBwpuseUOhfPY2OMGU5vXx9aKcIAyq+UhYr9FWaNaB5tW3TTUz2/81x+3f9FpQy0nBmEQS+V+ATXdiyknptKAp6zLzJKD+14Ysw2QgjwWPoM7AJVW1vLN99w3CLZXdF3UtfWQvo/1SQKBgQDCY1NIt05iWM1/tV7C3as0JXJaNhqceVsXBkABTNkOAPiwkf1Brs48G7/8IElnLQ/0IeUXmecMaQ2qZ91eRvnnXr3sk9R2qBzqbCXEHwKkLHMyat+7yPasQH7vr1p76jih6BDr0bgVgsl+PXxcA8J+o7HSVAnZuy8P/Bvd2FRaPwKBgC1CFJriUeruJbXl7vxniNAiBQ6gz6wZEKkqmVKMyepiX7bJgZzVkpZD7tpaLyU1kQ+pU+dLyvNK2VlGOtpZMgEQGlBvmQxhFa7jDzDasB5zkinrhdBxa6We5mX1t7XJ70OuEodziAlcLQgdKv29PfuLgnsOU2zfpmBZMc6JOReJAoGAeApMSRBhyFvcc2v2W9H1wpsJVeopXs2WUc6bQfJJ69rvuGI/Cgu/8eCVG0Z47c0nF/TCe2OgCcrqFHxVeL3N33JjSLA1uRyx1pX4cHdR8z472TukdFty8QZXHP6lmvYWCO29XVNCIY6FjX68yDnOJtRBoIgjGSD9vBpMvx+zX5MCgYBLUhJS16E/6bMoU9Lx4fT0Mm9x6TvaR2TzMDJnV0bDPrO4o76IYDgMoBrkLdnNuCAlylBemBskrnTdBuXbATgU0XNHVbLj8D0wAR/fU/WojPct6ZOmVbwp93HQjhgwql3PtJDSg2SEUd4JwXR1RljTkkuIzpDoj8DdEYq4smyUAw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqIg+LGq2qJS3Ru9EVRjIfOCdhRFRtET0o9Urk3ink9BDm1DkRq/A7W+idXcU1nc5AMDZU7gwjbdXn0Qqi2Mj1gQvq2kEsnCY4qUYBJTrl5o7D/bGVcg8GR6hcO/37l5TGd7DqZgEO8OdsFcGzB+hob7oSqtfe274cz0q+u33J9V10y3fHwr4UMeAaMOX7mN3y/avS2QPs7mttkIWryNrjWNySNjckVXW9Bx5T3L8Bp3MegerLMf78XBxd5TtRLBmhK34ZGS37y6r7sJF9zAgTwVwvQ0uQyuE1nsuPmbb9n5FNDDM8aFFIoLDSU2WGc/4HT7bREY+V0ihgGZ2GjfwIwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://4701l48541.eicp.vip/Alipay/notifyUrl";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://4701l48541.eicp.vip/Alipay/returnUrl";
    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "UTF-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do"; //测试

    // 支付宝网关
    public static String log_path = "E:\\";

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
