package Enkapsulasi;
public class TesPelajar {

    public static void main(String[] args) {
        Pelajar siswa1 = new Pelajar();
        siswa1.setNama("Daffa");
        siswa1.setNilaiTugas(100);
        siswa1.setNilaiUjian1(80);
        siswa1.setNilaiUjian2(70);
        siswa1.setNrp("077");
        System.out.println("status siswa 1 = "+siswa1.status()+" dengan nilai "+siswa1.nilaiAkhir());
        
        Pelajar siswa2 = new Pelajar(60,60,50,"066","Nanda");
        System.out.println("status siswa 2 = "+siswa2.status()+ " dengan nilai "+siswa2.nilaiAkhir());
    }
    
}
