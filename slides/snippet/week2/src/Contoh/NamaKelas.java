package Contoh;
public class NamaKelas {
    String Nama;
    int NRP;
    
    //Konstruktor tidak berparameter
    NamaKelas(){
        Nama = "kosong";
        NRP = 0;
    }
    //Konstruktor berparameter
    NamaKelas(String nama, int nrp){
        Nama = nama;
        NRP = nrp;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getNRP() {
        return NRP;
    }

    public void setNRP(int NRP) {
        this.NRP = NRP;
    }
    
}
