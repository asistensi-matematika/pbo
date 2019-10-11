package Enkapsulasi;

/**
 *
 * @author Rifky
 */
public class Pelajar {
    private int nilaiUjian1,nilaiUjian2,nilaiTugas;
    private String nrp,nama;

    public Pelajar() {
        this.nrp = "kosong";
        this.nama = "kosong";
        this.nilaiTugas = 0;
        this.nilaiUjian1 = 0;
        this.nilaiUjian2 = 0;
    }

    public Pelajar(int nilaiUjian1, int nilaiUjian2, int nilaiTugas, String nrp, String nama) {
        this.nilaiUjian1 = nilaiUjian1;
        this.nilaiUjian2 = nilaiUjian2;
        this.nilaiTugas = nilaiTugas;
        this.nrp = nrp;
        this.nama = nama;
    }
    

    public int getNilaiUjian1() {
        return nilaiUjian1;
    }

    public void setNilaiUjian1(int nilaiUjian1) {
        this.nilaiUjian1 = nilaiUjian1;
    }

    public int getNilaiUjian2() {
        return nilaiUjian2;
    }

    public void setNilaiUjian2(int nilaiUjian2) {
        this.nilaiUjian2 = nilaiUjian2;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double nilaiAkhir(){
        return (0.4*getNilaiUjian1())+(0.4*getNilaiUjian2())+(0.2*getNilaiTugas());
    }
    
    public boolean isLulus(){
        return nilaiAkhir()>=60;
    }
    
    public String status(){
        if(isLulus())
            return "Lulus";
        else
            return "Tidak Lulus";
    }
    
}
