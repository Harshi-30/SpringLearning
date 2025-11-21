package Com.telisko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.age = 23;
        System.out.println(obj.age);
        obj.code();

        Alien obj2 = (Alien) context.getBean("alien");
        System.out.println(obj2.age);
        obj2.code();
    }

}
