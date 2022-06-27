import com.ccgui.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext studentContext = new ClassPathXmlApplicationContext("application.xml");
        Student student = (Student) studentContext.getBean("name");
        System.out.println(student.toString());
    }


}

