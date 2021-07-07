package homework.day5.odev1;

import homework.day5.odev1.business.abstracts.IUserService;
import homework.day5.odev1.business.concretes.EmailManager;
import homework.day5.odev1.business.concretes.UserManager;
import homework.day5.odev1.business.concretes.UserValidateManager;
import homework.day5.odev1.dataAccess.concretes.UserDao;
import homework.day5.odev1.entities.concretes.User;

public class Test {

    public static void main(String[] args) {


        IUserService userService = new UserManager(new UserDao(),new UserValidateManager(),new EmailManager());
        User user = new User(12321, "bedirhan", "bayrak", "bed@b.com", "123456");

        userService.add(user);


    }
}
