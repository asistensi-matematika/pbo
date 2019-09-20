import java.util.Scanner;


public class week1 {
    public static void main(String[] args) {
        MultiplicationTable pmt = new MultiplicationTable();
        pmt.print();
        pmt.print(8);
        MultiplicationTableCakep pmt_c = new MultiplicationTableCakep(); 
        pmt_c.print(5);

        Scanner s =  new Scanner(System.in);
        System.out.println("check if prime or not");
        System.out.println("enter a number: ");
        int angka = s.nextInt();
        boolean hasil = check_prime(angka);
        if (hasil){
            System.out.println("eh bilangan prima");
        }
        else{
            System.out.println("bukan bilangan prima");
        }


    }

    public static void print_pmt(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void print_pmt(int n, int dari, int ke) {
        for (int i = 1; i <= n; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
    public static boolean check_prime(int n) {
        boolean hasil = true;
        if (n < 1) {
            hasil = false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                hasil = false;
            }
        }
        return hasil;
    }
}

class MultiplicationTable {
    public static void print() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void print(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d", n, i, n * i).println();
        }
    }
    public static void print(int n, int from, int to){
        for (int i = from; i < to; i++) {
            System.out.printf("%d x %d  = %d", n, i, n*i).println();
        }

    }
}
class MultiplicationTableCakep{
    public static void print(){
        /* secara default kalo gak dikasih argumen ya ngeprint perkalian lima */
        print(5,1,10);
    }

    public static void print(int n){
        /* ngeprint perkalian int n, dari 1-10 */
        print(n, 1,10);
    }
    public static void print(int n, int from, int to){
        for (int i = from; i <= to; i++) {
            System.out.printf("%d x %d  = %d", n, i, n*i).println();
        }
    }
}
