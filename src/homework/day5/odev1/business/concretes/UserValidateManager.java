package homework.day5.odev1.business.concretes;

import homework.day5.odev1.business.abstracts.UserValidateService;
import homework.day5.odev1.core.EmailCheckRegex;
import homework.day5.odev1.entities.concretes.User;

public class UserValidateManager implements UserValidateService {

    @Override
    public boolean validate(User user) {
        if (!EmailCheckRegex.validate(user.getEmail())
        || user.getPassword().length()<6
        || user.getFirstName().length()<2
        || user.getLastName().length()<2){
            return false;
        }
        return true;
    }
}
