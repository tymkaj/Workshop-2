package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainOppDao {

    public static void main (String[] args) {

        UserDao userDao = new UserDao();
        User[] users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

        User read = userDao.read(3);
        read.setEmail("updatedemail@gmail.com");
        userDao.update(read);

        User user = new User();
        user.setUserName("NewUser");
        user.setEmail("NewUserMail@gmail.com");
        user.setPassword("passwordpassword");
        userDao.create(user);

        users = userDao.findAll();
        for (User user1 : users) {
            System.out.println(user1);
        }

    }

}
