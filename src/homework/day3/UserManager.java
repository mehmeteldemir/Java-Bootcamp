package homework.day3;

public class UserManager {

    public void add(User user){
        System.out.println(user.getEmail() + "emailli kullanıcı eklendi");
    }

    public void delete(User user){
        System.out.println(user.getEmail() + "emailli kullanıcı silindi");
    }

    public void update(User user){
        System.out.println(user.getEmail() + "emailli kullanıcı güncellendi");
    }

}
