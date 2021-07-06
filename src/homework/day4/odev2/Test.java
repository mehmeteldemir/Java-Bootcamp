package homework.day4.odev2;

import homework.day4.odev2.abstracts.BaseCustomerManager;
import homework.day4.odev2.adapters.MernisServiceAdapter;
import homework.day4.odev2.concrete.CustomerCheckManager;
import homework.day4.odev2.concrete.NeroCustomerManager;
import homework.day4.odev2.concrete.StarbucksCustomerManager;
import homework.day4.odev2.entities.Customer;


public class Test {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "bedirhan","bayrak",1996,"13465465456");
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());


        try {
        customerManager.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
