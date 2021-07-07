package homework.day4.odev3.gamer;

import homework.day4.odev3.game.Game;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gamer {


    private int id;
    private String firstName;
    private String lastName;
    private List<Game> games = new ArrayList<>();
    private String nationalityId;
    private LocalDate birthDate;

    {
        id= (int) (Math.random()*100000);
    }


    public Gamer() {

    }

    public Gamer(String firstName, String lastName, String nationalityId, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Game> getGames() {
        return games;
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
