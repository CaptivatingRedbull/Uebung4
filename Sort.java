/* Sort.java */

public class Sort {
    public static void main (String []args){
        int a = 10, b = 5, c = 1;
        int reihenfolge[] = new int[3];
        int z; 

        reihenfolge[0] = a;
        reihenfolge[1] = b;
        reihenfolge[2] = c;
        for (int j = 0;j < 3; j++ ){
            for(int i = 0; i < 2; i++){
                if(reihenfolge[i]>reihenfolge[i+1]){
                    z = reihenfolge[i];
                    reihenfolge[i] = reihenfolge[i+1];
                    reihenfolge[i+1] = z;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.println(reihenfolge[i]);
        }
    }
}