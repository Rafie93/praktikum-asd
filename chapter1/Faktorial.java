
package chapter1;

/**
 *
 * @author USER
 */
public class Faktorial {
    public static int hitungFaktorial(int n) {
        if (n == 0) return 1;
        return n * hitungFaktorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Faktorial dari " + n + ": " + hitungFaktorial(n));
    }
}