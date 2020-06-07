import com.jay.School;
import com.jay.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        Student student1 = context.getBean("student2", Student.class);
        System.out.println(student1.toString());
    }
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        School school = context.getBean("school", School.class);
        System.out.println(school.getStudent().toString());
    }
}
