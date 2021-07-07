package homework.day4.odev3.game;

import homework.day4.odev3.gamer.Gamer;

public class GameManager {

    public void sell(Game game, Gamer gamer){

        if(game.hasCampain()){
            Double discountedPrice = game.getPrice()* ((100-game.getCampain().getDiscountPercentage()) /100.0);
            System.out.println(String.format("Discounted price of this game is  %.2f TL",discountedPrice));
        }
        else{
            System.out.println(String.format("Price of this game is  %.2f TL",game.getPrice()));
        }
        gamer.addGame(game);
    }




}
