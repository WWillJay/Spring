package old;

import com.jay.old.dao.UserDaoMysqlImpl;
import com.jay.old.service.UserService;
import com.jay.old.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl mysqlUserServiceImpl = (UserServiceImpl) context.getBean("mysqlUserServiceImpl");
        mysqlUserServiceImpl.getUser();
    }
}
