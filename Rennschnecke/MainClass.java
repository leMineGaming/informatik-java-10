package Rennschnecke;
public class MainClass {
    public static void main(String[] args){
        Rennschnecke schnecke = new Rennschnecke("Bert", "Nacktschnecke", 10);
        System.out.println("Name = " + schnecke.name);
        System.out.println("Rasse = " + schnecke.rasse);
        System.out.println("vMax = " + schnecke.vMax);
        schnecke.kriechen();
    }
}