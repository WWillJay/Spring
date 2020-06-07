import com.jay.pojo.House;
import com.jay.pojo.People;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getDog().bark();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
        House house = context.getBean("house", House.class);
        house.getDog().bark();
        house.getPeople().getDog().bark();
        house.getCat().eat();
    }


}
