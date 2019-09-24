public class azis {
    public static void main(String[] args) {
        new faculty();
    }
}

class faculty extends employee {
    public faculty() {
        System.out.println("ini adalah dari fakultasnya");
        super.setNama("jancok");
        System.out.println(super.getNama());
    }
}

class employee extends person {
    public employee() {
        this("ini print dari constructor yang ada di employee");
        System.out.println("ini dari employee extend person");
    }

    public employee(String s){
        System.out.println(s);
    }
}

class person {
    private String nama = "Berak kuda";
    public person() {
        System.out.println("ini adalah dari person "+  nama);
    }
    public person(String nama){
        this.nama=nama;
        System.out.println("halo nama saya adalah:" + nama);
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
}