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
        double printstrecke = zeit * vMax;
        strecke += zeit * vMax;
        System.out.println(name + " ist " + Math.round(printstrecke) + " cm gekrochen.");
        System.out.println("Insgesamt zurückgelegte Strecke: " + Math.round(strecke)+ "cm") ;
    }

    void rennen()
    {
        double zeit = Math.random() * 4;
        double printstrecke = zeit * vMax;
        strecke += zeit * vMax;
        System.out.println(name + " ist " + Math.round(printstrecke) + " cm gerannt. Was für eine Ausdauer!");
        System.out.println("Insgesamt zurückgelegte Strecke: " + Math.round(strecke) + "cm");
    }
}