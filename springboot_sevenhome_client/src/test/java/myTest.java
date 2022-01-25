import com.sevenhome.ApplicationApp;
import com.sevenhome.bean.po.Vip;
import com.sevenhome.dao.VipDao;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = {ApplicationApp.class})
public class myTest {

    @Resource
    private VipDao vipDao;

    @Test
    public void show(){
        Vip vip = vipDao.getVipByUserId(1);
        System.out.println(vip);
    }

}
