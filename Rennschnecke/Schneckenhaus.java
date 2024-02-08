package Rennschnecke;

public class Schneckenhaus extends Rennschnecke{
    public Schneckenhaus(String name, String rasse, int vMax){
        super(name, rasse, vMax);
    }

    public void PflanzenEssen(){
        vMax += 1;
        System.out.println("Deine Schnecke hat gut gefressen und ist jetzt schneller geworden.");
        System.out.println("Die Maximalgeschwindigkeit der Schnecke ist jetzt: " + vMax + "km/h");
    }


    public void kriechen()
    {
        double randomNumber = Math.random();
        if(Math.round(randomNumber) == 0)
        {
            double zeit = Math.random();
            double printstrecke = zeit * vMax;
            strecke += zeit * vMax;
            System.out.println(name + " ist " + Math.round(printstrecke) + " cm gekrochen.");
            System.out.println("Insgesamt zurückgelegte Strecke: " + Math.round(strecke) + "cm");
        }
        else
        {
            System.out.println("Hoppla! " + name + " ist mit ihrem Schneckenhaus gegen ein Hindernis gestoßen.");
            System.out.println("Sie ist also nicht weitergekommen. Gesamtstrecke: " + Math.round(strecke) + "cm");
        }
    }
}
