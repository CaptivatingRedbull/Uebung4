public class Tabelle {
    public static void main (String[]args){
        for (int i = 10; i <= 20; i++){
            System.out.println(i + ":");
            System.out.println("---");

            for (int j = 1; j <= 10; j++){
                System.out.println(j + " x " + i + " = " + i*j);

            }
            System.out.println("=============");
            System.out.println(" ");
        }
    }
}
