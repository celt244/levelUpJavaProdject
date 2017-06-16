package ua.dp.levelUp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * Created by java on 16.06.2017.
 */
public class UserService implements InitializingBean, DisposableBean{

    public UserService() {
        System.out.println("UserService constructor called");
        doMagic();
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("UserService afterPropertiesSet method called");
        doMagic();
    }

    public void destroy() throws Exception {
        System.out.println("UserService destroy method called");
    }

    @Profiling
    public void doMagic() {
        System.out.println("UserService does magic");
    }
}
