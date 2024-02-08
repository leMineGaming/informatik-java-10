package Rennschnecke;
public class MainClass {
    public static void main(String[] args){
        Schneckenhaus schnecke = new Schneckenhaus("Bert", "Nacktschnecke", 10);
        System.out.println("Name = " + schnecke.name);
        System.out.println("Rasse = " + schnecke.rasse);
        System.out.println("vMax = " + schnecke.vMax);
        for(int x = 1; x < 20; x += 1)
        {
            schnecke.kriechen();
            schnecke.PflanzenEssen();
            schnecke.kriechen();
        }
        schnecke.rennen();
    }
}