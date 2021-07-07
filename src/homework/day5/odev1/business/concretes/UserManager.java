package homework.day5.odev1.business.concretes;

import homework.day5.odev1.business.abstracts.EmailService;
import homework.day5.odev1.business.abstracts.IUserService;
import homework.day5.odev1.business.abstracts.UserValidateService;
import homework.day5.odev1.dataAccess.abstracts.IUserDao;
import homework.day5.odev1.entities.concretes.User;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class UserManager implements IUserService {

    private IUserDao userDao;
    private UserValidateService userValidateService;
    private EmailService emailService;

    public UserManager(IUserDao userDao, UserValidateService userValidateService,EmailService emailService) {
        this.userDao = userDao;
        this.userValidateService = userValidateService;
        this.emailService=emailService;
    }


    @Override
    public void add(User user) {
        if (userValidateService.validate(user)) {
            userDao.add(user);
            System.out.println(user.getFirstName() + " added succesfully");
            emailService.activateEmail(user);
        }else{
            System.out.println("Please check your informations");
        }
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
