import java.util.Arrays;
import java.util.Random;

public class test{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tabungan = new int[100];
        for (int i = 0; i < tabungan.length; i++) {
            int a = rand.nextInt(1000000)+500000;
            tabungan[i] = a;
        }
        System.out.println(Arrays.toString(tabungan));
        System.out.println(hitungRataRata(tabungan));
    }
    public static double hitungRataRata(int[] x){
        int total = 0;
        for (int i = 0; i < x.length; i++) {
           total+=x[i];
        }
        return total / x.length;
    }
}
