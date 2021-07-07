package homework.day5.odev1.business.abstracts;

import homework.day5.odev1.entities.concretes.User;

public interface LoginService {
    boolean login(User user,String email,String password);
}
