import com.jay.way1.service.UserService;
import com.jay.way2.service.AdminServiceImpl;
import com.jay.way2.service.AdminServiceInterface;
import com.jay.way3.service.ManageServiceInterface;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
        userServiceImpl.insert();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        AdminServiceInterface adminServiceImpl = context.getBean("adminServiceImpl", AdminServiceInterface.class);
        adminServiceImpl.excute();
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ManageServiceInterface manageServiceImpl = context.getBean("manageServiceImpl", ManageServiceInterface.class);
        manageServiceImpl.excute();
    }
}
