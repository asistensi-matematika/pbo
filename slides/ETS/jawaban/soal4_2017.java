public class soal4_2017{
    public static void main(String[] args) {
        Rasional K = new Rasional();
        Rasional K1 = new Rasional(2.0,4.0);
        Rasional K2 = new Rasional(7.0,3.0);
        K1.info();
        K1.kali(K2);

    }
}

class Rasional{
    private int pembilang;
    private int penyebut;
    public Rasional(){
        System.out.println("konstruktor default");
    }
    public Rasional(double p, double q){
        pembilang  = (int)p;
        penyebut = (int)q;
    }
    public int getPemb(){
        return pembilang;
    }
    public int getPeny(){
        return penyebut;
    }
    public void info(){
        System.out.println(pembilang+"/"+penyebut);
    }

    public void kali(Rasional Bil){
        int a = Bil.getPemb() * this.getPemb();
        int b = Bil.getPeny() * this.getPeny();
        System.out.println(a+"/"+b);
    }
}

