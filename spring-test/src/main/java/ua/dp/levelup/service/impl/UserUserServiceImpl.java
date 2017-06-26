package ua.dp.levelup.service.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import ua.dp.levelup.Profiling;
import ua.dp.levelup.User;
import ua.dp.levelup.dao.UserDAO;
import ua.dp.levelup.service.UserService;

import java.util.List;

/**
 * Created by java on 16.06.2017.
 */
public class UserUserServiceImpl implements UserService, InitializingBean, DisposableBean {

    private UserDAO userDao;

    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }

    public UserUserServiceImpl() {
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

    @Override
    public List<User> gerAllUsers() {
        return userDao.gerAllUsers();
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById();
    }

    @Override
    public void createUser(User user) {
        userDao.createUser(user);

    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);

    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    @Profiling
    public void doMagic() {
        System.out.println("UserService does magic");
    }
}
