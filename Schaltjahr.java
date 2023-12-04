/*
 * Schaltjahr
 */

public class Schaltjahr {
    public static void main(String []args){
        int jahr = 1904;

        if(jahr % 400 == 0){
            System.out.println(jahr + " ist ein Schaltjahr");
        }else if(jahr % 4 == 0 && jahr % 100 != 0){
            System.out.println(jahr + " ist ein Schaltjahr");
        }else{
            System.out.println(jahr + " ist kein Schaltjahr");
        }
    }
}
