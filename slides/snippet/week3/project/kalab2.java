

public class kalab2 extends dosen{
    protected String namalab;

    kalab2(String namaX,String nikX,String jurusanX, String namalabX){
        super(namaX,nikX,jurusanX);
        namalab = namalabX;
    }

    public void view(){
        super.view();
        System.out.println("Ketua lab : "+namalab);
    }

    

    

}