package ua.dp.levelUp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by java on 13.06.2017.
 */
public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Greeting greetingBean = context.getBean(Greeting.class);
        greetingBean.sayHello();

        PC bean = context.getBean(PC.class);
        System.out.println(bean);

        UserService userService = (UserService) context.getBean("userService");
        userService.doMagic();

        context.close();

    }
}