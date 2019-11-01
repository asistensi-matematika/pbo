import java.util.Random;

public class GarasiMain {
    public static void main(String[] args) {
        Transportasi[] garasi = new Transportasi[50];
        // // garasi: [0], [1], [2], [3], [4]
        // garasi[0] = new Mobil();
        // garasi[1] = new Motor();
        // garasi[2] = new Mobil();
        // garasi[3] = new Segway();
        // garasi[4] = new Mobil();

        for (int i = 0; i < 24; i++) {
            garasi[i] = new Motor();
        }
        for (int i = 24; i < 34 ; i++) {
            garasi[i] = new Mobil();
        }
        for (int i = 34; i < 50; i++) {
            garasi[i] = new Segway();
        }

        System.out.println(garasi[25]);

        //jangan di import java.util.Random; di paling atas file java
        Random rand = new Random()
        for (int i = 0; i < garasi.length; i++) {
            //
            int coinflip = rand.nextInt(3)+1;
            // coinflip == 1 memasukan mobil
            // coinflip == 2 memasukan motor
            // coinflip == 3 memasukan segway
            if (coinflip == 1) {
                garasi[i] = new Mobil();
            }else if(coinflip ==2){
                garasi[i] = new Motor();
            }else{
                garasi[i] = new Segway();
            }

        }



        //ngitung rata-rata
        // int jumlahRoda = garasi[0].getRoda() + garasi[1].getRoda()+ garasi[2].getRoda()+ garasi[3].getRoda()+ garasi[4].getRoda();
        int jumlahRoda = 0;
        for (int i = 0; i < garasi.length; i++) {
            jumlahRoda+=garasi[i].getRoda();
        }

        double rataRata = jumlahRoda / garasi.length;
        System.out.println(rataRata);








        /*
        -- kelas transportasi --
        property:
        - namaTransportasi
        - jumlahRoda
        - Warna
        - tipeMesin

        constructor default:
        namaTransportasi: "DEFAULT"
        jumlahRoda: 0
        warna: hitam
        tipeMesin: bensin

        method:
        - getter setter seluruh property
        - print:
            """
            Jenis Transportasi: " "
            Jumlah Roda: " "
            Warna: " "
            Tipe Mesin: " "
            """

        buatlah 3 subclass transportasi, bebas namanya apa yang penting ada yang
        - di overload
        - di override
        - "namaTransportasi: sesuai dengan nama yang kamu buat"


        main classnya:
        - array transportasi, dengan jumlah 5 elemen di dalamnya.
        - print rata-rata roda --> method static
        */


        // Random rand = new Random();
        // for (int i = 0; i < garasi1.length; i++) {
        //     int a = rand.nextInt(2) + 1;
        //     if (a == 1) {
        //         garasi1[i] = new Mobil();
        //     } else {
        //         garasi1[i] = new Motor();
        //     }
        // }
        // int jumlah_mobil = 0;
        // int jumlah_motor = 0;
        // for (int i = 0; i < garasi1.length; i++) {
        //     System.out.println(garasi1[i]);
        //     if (garasi1[i].getRoda() == 2) {
        //         jumlah_motor+=1;
        //     }
        //     else{
        //         jumlah_mobil+=1;
        //     }
        // }
        // System.out.println(jumlah_mobil);
        // System.out.println(jumlah_motor);

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
    public void setRoda(int rodaganti){
        this.roda = rodaganti;
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

class Segway extends Transportasi{
    private String mesin;

    public Segway(){
        super();
        super.setRoda(20);
        mesin = "tidak ada";
    }
    public void setMesin(String jenisMesin){
        this.mesin = jenisMesin;
    }
    public String getMesin(){
        return this.mesin;
    }
    public void print(){
        System.out.println("sesuai format soal");
    }



}