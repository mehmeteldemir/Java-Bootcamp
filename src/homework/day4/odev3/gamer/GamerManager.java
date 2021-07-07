package homework.day4.odev3.gamer;


import homework.day4.odev3.adapters.MernisServiceAdapter;

public class GamerManager {



    public boolean checkIfRealPerson (Gamer gamer){
        return MernisServiceAdapter
                .CheckIfRealPerson(Long.valueOf(gamer.getNationalityId()),gamer.getFirstName(),
                gamer.getLastName(),gamer.getBirthDate().getYear()
                );
    }

    public void save (Gamer gamer){
        if (checkIfRealPerson(gamer)){
            System.out.println("Gamer succesfully saved");
        }else{
            System.out.println("Identify error");
        }
    }

    public void delete(Gamer gamer){
        System.out.println(String.format("%s %s has been deleted",gamer.getFirstName(),gamer.getLastName() ));
    }

}
