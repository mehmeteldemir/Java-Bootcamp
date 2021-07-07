package homework.day5.odev1.business.concretes;

import homework.day5.odev1.business.abstracts.LoginService;
import homework.day5.odev1.entities.concretes.User;

public class DefaultLoginManager implements LoginService {
    @Override
    public boolean login(User user, String email, String password) {

        if(!user.isConfirmed()){
            System.out.println("Please confirm your email");
            return false;
        }
        if(user.getEmail().equals(email)  && user.getPassword().equals(password)){
            System.out.println("Logged in succesfully : " + user.getEmail());
            return true;
        }
        return false;
    }
}
