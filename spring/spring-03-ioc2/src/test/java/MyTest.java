import com.ccgui.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext name = new ClassPathXmlApplicationContext("beans.xml");
        // 相当于之前的new一个对象，在完成引用时，就相当于完成了对类的初始化。
        User userName =  (User)name.getBean("test1");
        System.out.println("===============");
        userName.show();
    }
}
