package ders.day4.interfaces;

public class InterfacesTest {

    public static void main(String[] args) {

        Logger[] loggers = {new EmailLogger(),new DatabaseLogger(), new FileLogger(), new SmsLogger()};

        CustomerManager customerManager= new CustomerManager( loggers);

        Customer customer = new Customer(1,"bedirhan","bayrak");

        customerManager.add(customer);
        System.out.println();
        customerManager.delete(customer);

    }






}
