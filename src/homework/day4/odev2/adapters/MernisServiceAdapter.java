package homework.day4.odev2.adapters;

import homework.day4.odev2.abstracts.ICustomerCheckService;
import homework.day4.odev2.core.mernis.RABKPSPublicSoap;
import homework.day4.odev2.entities.Customer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        RABKPSPublicSoap client = new RABKPSPublicSoap();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        try {
            return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(),customer.getDateOfBirth());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
