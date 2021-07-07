package homework.day4.odev3.game;

import homework.day4.odev3.campain.BaseCampain;

public class Game {
    private int id;
    private String name;
    private BaseCampain campain;
    private double price;


    {
        id= (int) (Math.random()*100000);
    }


    public Game(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseCampain getCampain() {
        return campain;
    }

    public void setCampain(BaseCampain campain) {
        this.campain = campain;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean hasCampain(){
        return  (campain!=null);
    }

}
