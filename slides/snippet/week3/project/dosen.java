// package project;

public class dosen{
    protected String nama, nik, jurusan;
    
    public dosen(String namaX,String nikX,String jurusanX){
        nama = namaX;
        nik = nikX;
        jurusan = jurusanX;
    }

    public void view() {
        System.out.println("Nama : "+nama);
        System.out.println("Nik : "+nik);
        System.out.println("Jurusan : "+jurusan);
    }
}