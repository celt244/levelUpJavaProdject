package ua.dp.levelup.dao;

import ua.dp.levelup.User;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;

/**
 * Created by Arthur on 20.06.2017.
 */
public class UserFileDaoImpl implements UserDAO {

    private final String filePath;

    public UserFileDaoImpl(String filePath) {
        this.filePath = filePath;
    }

    public void init() {

    }

    @Override
    public List<User> gerAllUsers() {

        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
