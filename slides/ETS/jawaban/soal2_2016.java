public class soal2_2016 {
    public static void main(String[] args) {
        Gagak BG = new Gagak();
        cetak(BG);
        cetak(new Burung());
        cetak(new Hewan());
    }

    public static void cetak(Hewan x){
        System.out.println(x.getket() +"----"+x.warna);
    }
}

class Gagak extends Burung{
    public Gagak(){
        System.out.println("dan jadilah gagak");
        warna = "Coklat";
    }
}

class Burung extends Hewan{
    public Burung(){
       System.out.println("default constructor burung");
    }
    public String getket(){
        return "Burung";
    }
}

class Hewan{
protected String warna;
    public Hewan(){
        System.out.println("Hendaklah bumi mengeluarkan segala jenis makhluk yang hidup, ternak dan binatang melata");
        warna = "hitam";
    }
    public String getket(){
        return "hewan";
    }
}