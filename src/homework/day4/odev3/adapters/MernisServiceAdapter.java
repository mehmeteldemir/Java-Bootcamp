package homework.day4.odev3.adapters;

import core.mernis.RABKPSPublicSoap;

import java.text.SimpleDateFormat;

public class MernisServiceAdapter  {

    public static boolean CheckIfRealPerson(Long nationalityId,String firstName,String lastName,int yearOfBirt) {
        RABKPSPublicSoap client = new RABKPSPublicSoap();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        try {
            return client.TCKimlikNoDogrula(
                     nationalityId, firstName, lastName, yearOfBirt
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
