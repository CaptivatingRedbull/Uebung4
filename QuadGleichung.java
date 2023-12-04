/*
 * QuadGleichung.java 
 * Berechnung der Nullstellen von Quadratischen Gleichungen in Normalform
 */

public class QuadGleichung {
    public static void main(String []args){
        int a, b, c;
        a = 1;
        b = -8; 
        c = 15; 
        
        System.out.print("Die Gleichung " + a + "*x^2" + b + "*x" + c + " hat ");
        if(a == 0 && b == 0 && c == 0)      //Graph liegt auf der X achse
            System.out.print("unendlich viele Lösungen");
        else if(a == 0 && b == 0)       //kein x -> wenn c ≠ 0 keine Lösung
            System.out.print("hat keine Lösungen");
        else if(a == 0)     //lineare Gleicung
            System.out.print("hat die Lösung " + (float)-c / b);
        else if((Math.pow(b,2)-4*a*c) < 0)
            System.out.print("keine reellen Lösungen");     //Diskriminante negativ -> Keine reele Lösung für Wurzel von neg. Zahlen
        else if((Math.pow(b,2)-4*a*c) == 0)
            System.out.print("die Lösung " + ((float)(-b) / (2 * a)));      //Diskriminante = 0 -> eine Lösung
        else if((Math.pow(b,2)-4*a*c) > 0)
            System.out.print("die Lösungen " + ((-b + Math.sqrt(b * b - 4 * a * c)) / (float)(2 * a)) +         //Diskriminante > 0 -> 2 Lösungen
                " und " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        System.out.println(".");
    }
}