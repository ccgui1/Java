import com.ccgui.dao.UserDao;
import com.ccgui.dao.UserDaoMysqlIml;
import com.ccgui.service.UserService;
import com.ccgui.service.UserServiceIml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mytest {
    public static void main(String[] args) {
//        UserServiceIml userServiceIml = new UserServiceIml();
//        userServiceIml.setUserDao(new UserDaoMysqlIml());
//        userServiceIml.getUser();
        // 实例化一个容器context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceIml userServiceIml = (UserServiceIml) context.getBean("UserServiceIml");
        userServiceIml.getUser();

    }
}
