import java.util.Random;

public class GarasiMain {
    public static void main(String[] args) {
        Transportasi[] garasi1 = new Transportasi[100];
        Random rand = new Random();
        for (int i = 0; i < garasi1.length; i++) {
            int a = rand.nextInt(2) + 1;
            if (a == 1) {
                garasi1[i] = new Mobil();
            } else {
                garasi1[i] = new Motor();
            }
        }
        int jumlah_mobil = 0;
        int jumlah_motor = 0;
        for (int i = 0; i < garasi1.length; i++) {
            System.out.println(garasi1[i]);
            if (garasi1[i].getRoda() == 2) {
                jumlah_motor+=1;
            }
            else{
                jumlah_mobil+=1;
            }
        }
        System.out.println(jumlah_mobil);
        System.out.println(jumlah_motor);

    }
}

class Transportasi {
    private String nama;
    private int id;
    private int roda = 0;

    public Transportasi() {
        nama = "DEFAULT";
        id = 0;
    }

    public Transportasi(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }
    public int getRoda(){
        return roda;
    }
}

class Mobil extends Transportasi {
    private int cc;
    private String warna;
    private int roda = 4;

    public Mobil() {
        super();
        cc = 300;
        warna = "hitam";
    }

    public Mobil(int cc, String warna) {
        this.cc = cc;
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String toString() {
        return "Mobil warna: " + warna;
    }
    public int getRoda(){
        return roda;
    }
}

class Motor extends Mobil {
    private int roda = 2;

    public Motor() {
        super();
        super.setWarna("kuning");
    }

    public String getWarna() {
        return super.getWarna();
    }

    public String toString() {
        return "Motor warna: " + getWarna();
    }
    public int getRoda(){
        return roda;
    }

}