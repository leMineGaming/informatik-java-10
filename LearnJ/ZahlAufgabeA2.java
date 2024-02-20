package LearnJ;
public class ZahlAufgabeA2
{
public static void main(String[] args){
for (int i = 1; i <= 300; i++) {
    if(i % 10 == 0){System.out.print(ANSI_RED + i + " " + ANSI_RESET);}
    else{
    if(i % 5 == 0) {
       System.out.print(ANSI_GREEN + i + " " + ANSI_RESET);
    } else {
       System.out.print(i + " ");
    }}
 }
}
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
}