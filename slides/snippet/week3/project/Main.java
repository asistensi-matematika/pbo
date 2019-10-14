

public class Main{
    public static void main(String[] args) {
        // System.out.print("test");

        dosen dsn = new dosen("Rama", "121212", "math");
        dsn.view();
        System.out.println("");

        kalab klb = new kalab("Rama", "121212", "math","ilkom");
        klb.view();
        klb.viewKalab();
        System.out.println("");
        
        kalab2 kalab = new kalab2("Rama", "121212", "math","ilkom");
        kalab.view();
        System.out.println("");
        // klb.viewKalab();

        mahasiswa mhs = new mahasiswa();
        mhs.viewMahasiswa("rama", "123", "math", "baru");
        mhs.viewMahasiswa("rama", "123", "math", 12);
    }
}