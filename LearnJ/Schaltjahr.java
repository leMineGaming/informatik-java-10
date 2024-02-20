package LearnJ;

public class Schaltjahr {
    public static void main(String[] args){
        System.out.println("Gib ein gültiges Jahr ein:");
        String jahr = System.console().readLine().toString();
        boolean ergebnis = KriteriumÜberprüfen(Integer.parseInt(jahr));
        if(ergebnis){
            System.out.println("Das Jahr " + jahr +  ANSI_GREEN+ " ist ein Schaltjahr!" + ANSI_RESET);
        }
        else{
            System.out.println("Das Jahr " + jahr +  ANSI_RED+ " ist kein Schaltjahr!" + ANSI_RESET);
        }
    }

    public static boolean KriteriumÜberprüfen(int eingegebenes_jahr){
        boolean ist_schaltjahr = false;
        if(eingegebenes_jahr % 400 == 0){
            ist_schaltjahr = true;
        }
        else{
            if(eingegebenes_jahr % 100 == 0){
                ist_schaltjahr = false;
            }
            else{
                if(eingegebenes_jahr % 4 == 0){
                    ist_schaltjahr = true;
                }
                else{
                    ist_schaltjahr = false;
                }
            }
        }
        return ist_schaltjahr;
    }

    public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
}
