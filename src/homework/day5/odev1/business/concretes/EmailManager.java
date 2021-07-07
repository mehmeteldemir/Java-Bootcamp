package homework.day5.odev1.business.concretes;

import homework.day5.odev1.business.abstracts.EmailService;
import homework.day5.odev1.entities.concretes.User;

import java.util.Scanner;

public class EmailManager implements EmailService {

    @Override
    public void activateEmail(User user) {
        user.setToken(String.valueOf(1000000+ (int)(Math.random()*1000000)));
        System.out.println("Please confirm your email with token -> " +user.getToken());
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your token");
        String token = sc.nextLine();



        if(token.equals(user.getToken())){
            user.setConfirmed(true);
            System.out.println("email confirmed succesfully");
        }else{
            System.out.println("Token is not valid");
        }
    }
}
