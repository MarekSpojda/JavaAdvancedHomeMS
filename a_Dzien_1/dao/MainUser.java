package a_Dzien_1.dao;

import java.util.List;

public class MainUser {
    public static void main(String[] args) {
        // create user
        UserDao userDao = new UserDao();
        User user = new User("Marek Kanarek", 3L);
        //save user to database
        userDao.save(user);

        //get all users
        List<Model> users = userDao.loadAll();
        for (Model model : users) {
            User myUser = (User) model;
            System.out.println(myUser);
        }
    }
}
