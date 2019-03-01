import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbMain {

    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Service service = (Service) context.getBean("service");
        service.process();
    }
}
