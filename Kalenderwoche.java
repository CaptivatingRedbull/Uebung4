/*
 * Kalenderwoche.java
 */

public class Kalenderwoche {
    public static void main(String []args){
        String datum = "01.01";
        String [] datumA = new String[2];

        datumA = datum.split("\\.");

        int tag = Integer.parseInt(datumA[0]);
        int monat = Integer.parseInt(datumA[1]);
        
        System.out.println("Der Tag liegt in der " + ((tag + monatTage(monat)) / 7 + 1) + ". Kalenderwoche.");
        //Tag im Jahr ganzzahlig dividiert durch 7 + 1 -> weil Kalenderwochen bei 1 anfangen
    }
    
    public static int monatTage(int monat){
        switch(monat){
            case 1:
                return 0;
            case 2: 
                return 31;
            case 3:
                return 31+28;
            case 4: 
                return 31+28+31;
            case 5:
                return 31+28+31+30;
            case 6:
                return 31+28+31+30+31;
            case 7:
                return 31+28+31+30+31+30;
            case 8:
                return 31+28+31+30+31+30+31;
            case 9:
                return 31+28+31+30+31+30+31+31;
            case 10:
                return 31+28+31+30+31+30+31+31+30;
            case 11:
                return 31+28+31+30+31+30+31+31+30+31;
            case 12:
                return 31+28+31+30+31+30+31+31+30+31+30;
            default:
                return 0; 
        }
    }
}
