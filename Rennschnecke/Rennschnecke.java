package Rennschnecke;

class Rennschnecke{
    String name;
    String rasse;
    int vMax;
    double strecke;

    Rennschnecke(String name, String rasse, int vMax){
        this.name = name;
        this.rasse = rasse;
        this.vMax = vMax;
        strecke = 0;
    }

    void kriechen()
    {
        double zeit = Math.random();
        strecke += zeit * vMax;
        System.out.println(name + " ist " + Math.round(strecke) + " cm gekrochen.");
    }

    void rennen()
    {

    }
}