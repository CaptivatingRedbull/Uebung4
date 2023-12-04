/*
 * Wurzelberechnung.java
 */
public class Wurzelberechnung {
    public static void main (String[]args){
        double a = 2, x = a, xAlt;

        for (int i = 0; i < 10; i++){
            xAlt = x; 
            x = (xAlt + (a/xAlt))/2;
        }
        System.out.println(x);
    }
}
