package homework.day4.odev2.concrete;

import homework.day4.odev2.abstracts.BaseCustomerManager;
import homework.day4.odev2.abstracts.ICustomerCheckService;
import homework.day4.odev2.entities.Customer;

public class StarbucksCustomerManager  extends BaseCustomerManager {

    private ICustomerCheckService iCustomerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
        this.iCustomerCheckService = iCustomerCheckService;
    }


    @Override
    public void save(Customer customer)  throws Exception{
        if (iCustomerCheckService.CheckIfRealPerson(customer)) {
            System.out.println("customer saved : " + customer.getFirstName() + " " + customer.getLastName());
        }else{
            throw new Exception("Customer doesnt real");
        }

    }


}
