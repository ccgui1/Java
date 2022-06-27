import com.ccgui.config.UserConfig;
import com.ccgui.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void userTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User username = context.getBean("getUser",User.class);
        System.out.println(username.toString());
    }
}
