package homework.day5.odev1.dataAccess.abstracts;

import homework.day5.odev1.entities.concretes.User;
import java.util.List;

public interface IUserDao {
    void add(User user);
    void delete(User user);
    User get(int id);
    List<User> getAll();

}
