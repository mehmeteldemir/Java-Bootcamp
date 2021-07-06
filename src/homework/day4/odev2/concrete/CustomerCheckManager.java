package homework.day4.odev2.concrete;

import homework.day4.odev2.abstracts.ICustomerCheckService;
import homework.day4.odev2.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        if (Math.random() < 0.5) {
            return true;
        }
        return false;
    }
}
