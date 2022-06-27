import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext hello = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(hello.getBean("hello"));

    }
}
