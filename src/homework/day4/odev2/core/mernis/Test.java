package homework.day4.odev2.core.mernis;

public class Test {

    public static void main(String[] args) {
        RABKPSPublicSoap client = new RABKPSPublicSoap();

        try {
            System.out.println(client.TCKimlikNoDogrula(Long.valueOf("1111111111"),"BEDİRHAN","BAYRAK",1996));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}
