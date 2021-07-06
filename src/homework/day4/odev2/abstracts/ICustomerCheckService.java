package homework.day4.odev2.abstracts;

import homework.day4.odev2.entities.Customer;

public interface ICustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}
