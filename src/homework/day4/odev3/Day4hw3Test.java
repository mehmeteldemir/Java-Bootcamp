package homework.day4.odev3;

import homework.day4.odev3.campain.BaseCampain;
import homework.day4.odev3.campain.CampainManager;
import homework.day4.odev3.game.Game;
import homework.day4.odev3.game.GameManager;
import homework.day4.odev3.gamer.Gamer;
import homework.day4.odev3.gamer.GamerManager;

import java.time.LocalDate;

public class Day4hw3Test {

    public static void main(String[] args) {

        GamerManager gamerManager = new GamerManager();
        GameManager gameManager = new GameManager();
        CampainManager campainManager = new CampainManager();

        // Real MERNIS entegrated
        Gamer gamer = new Gamer("Bedirhan ","bayrak",
                "5644654465",
                LocalDate.of(1996,06,16));

        Game game = new Game("GTA5", 150.0);

        BaseCampain campain = new BaseCampain("X Campain", 20.0);


        campainManager.addCampain(game,campain);
        gamerManager.save(gamer);



        gameManager.sell(game,gamer);
        gamerManager.delete(gamer);

    }

}
