package homework.day4.odev3.campain;

import homework.day4.odev3.game.Game;

public class CampainManager {


    public void addCampain(Game game,BaseCampain campain){

        if(!game.hasCampain()){
            game.setCampain(campain);
            System.out.println(String.format("%s kodlu kampanya %s adlı oyuna eklendi"
                    , campain.getCampainCode(),game.getName()));
        }else{
            System.out.println(String.format("Bu oyun zaten bir kampanyaya sahip : " ,campain.getCampainName()));
        }
    }

    public void deleteCampain(Game game){
        if (game.hasCampain()){
            game.setCampain(null);
        }else{
            System.out.println("This game hasn't any campain");
        }
    }

    public void updateCampain(BaseCampain campain,Double discountPercentage){
        campain.setDiscountPercentage(discountPercentage);
    }

}
