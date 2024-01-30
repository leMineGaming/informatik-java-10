package Rennschnecke;

class Rennschnecke{
    String name;
    String rasse;
    int vMax;
    double strecke;
    boolean xy;

    Rennschnecke(String name, String rasse, int vMax){
        this.name = name;
        this.rasse = rasse;
        this.vMax = vMax;
        strecke = 0;
        xy = false;
    }

    void kriechen()
    {
        
        double zeit = Math.random();
        strecke = strecke + zeit * vMax;
        System.out.println(name + " ist " + Math.round(strecke) + " cm gekrochen.");
    }

    void rennen()
    {

    }
}