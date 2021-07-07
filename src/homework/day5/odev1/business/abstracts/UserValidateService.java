package homework.day5.odev1.business.abstracts;

import homework.day5.odev1.entities.concretes.User;


public interface UserValidateService {
    boolean validate(User user);
}
