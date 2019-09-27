public class week1_live_demo{
    public static void main(String[] args) {
        mahasiswa rama = new mahasiswa();
        System.out.println();
        System.out.println(rama.getB() );
        // int a = 0;
        // System.out.println(perkalian(3,5));
        // System.out.println(("terserah namanya siapa"));
        // mahasiswa m1 = new mahasiswa();
        // System.out.println(m1.nama);
        // System.out.println(m1.b);
    }

    public static int perkalian(int a, int b) {
        // public dan static adalah sebuah modifier
        return a*b;
    }
    public static String hai(String nama){
        return "Halo"+nama;
    }
}

//  class mahasiswa{
//     int a;
//     private String nama = "rama";
//     mahasiswa(){
//         System.out.println(nama);
//     }
// }