package homework.day5.odev1.business.abstracts;

import homework.day5.odev1.entities.concretes.User;

import java.util.List;

public interface IUserService {
    void add(User user);
    void delete(User user);
    User get(int id);
    List<User> getAll();

}

