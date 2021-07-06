package homework.day3;

import java.util.ArrayList;
import java.util.List;

public class Test {




    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User user1 = new User("12","user1@email.com");
        User user2 = new User("123","user2@email.com");
        User user3 = new User("213","user3@email.com");
        User user4 = new User("12312","user4@email.com");
        User[] userList =  {user1,user2,user3,user4};

        List<User> userlist1 = new ArrayList<>();

        userlist1.add(user1);
        userlist1.add(user2);
        userlist1.add(user3);
        userlist1.add(user4);

//        userlist1.forEach(user-> System.out.println(user.getEmail()));

        userManager.add(user1);


        for (User user :
                userList) {
            System.out.println(user.getEmail());
        }
    }





}
