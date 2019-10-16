

public class kalab extends dosen{
    protected String namalab;

    kalab(String namaX,String nikX,String jurusanX, String namalabX){
        super(namaX,nikX,jurusanX);
        namalab = namalabX;
    }

    public void viewKalab(){
        System.out.println("Ketua lab : "+namalab);
    }

    

}