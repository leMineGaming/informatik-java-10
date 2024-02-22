package Hausaufgabe;

public class Syracuse {
    public static void main(String[] args){
        System.out.println("Gib eine natürliche Zahl ein!");
        String eingegebenezahl = System.console().readLine();
        int Number = Integer.parseInt(eingegebenezahl);
        System.out.println("Gewählt: " + Number);
        if(Number < 1){
            System.out.println("Du hast keine natürliche Zahl eingegeben!");
            Number = 1;
        }
        while (Number != 1){
            if(Number % 2 == 0){
                Number = Number /2;
                System.out.println("Gerade: " + Number);
            }
            else{
                Number = (3 * Number) + 1;
                System.out.println("Ungerade: " + Number);
            }
        }

        System.out.println("Ergebnis: " + Number);
    }}