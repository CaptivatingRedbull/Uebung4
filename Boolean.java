/*
 * Boolean.java
 */

 /*
  *     true
        true
        true
        true
  */
public class Boolean {
    public static void main (String[] args)
    {
        int m = 1, n = -1;
        boolean a = true, b = false;
        System.out.println(a && !b);
        System.out.println(!a || b && a || !b);        
        System.out.println(!a || !b || m < n);
        System.out.println(m > n || m == n && m > n );
    }
}
