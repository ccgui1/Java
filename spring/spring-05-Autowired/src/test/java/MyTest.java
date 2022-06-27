import com.ccgui.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public  void people() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People pepole =  context.getBean("people", People.class);
        pepole.getCat().shout();
        pepole.getDog().shout();

    }
}
