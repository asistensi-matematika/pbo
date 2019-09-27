public class azis {
    public static void main(String[] args) {
        int val = 2;
        Test t = new Test(val);
        Test b = new Test("berakkuda");
    }
}

class Test {
    int x;
    String nama;

    Test() {
        System.out.println("a test");
    }

    Test(String s) {
        this();
        System.out.println(s);
        System.out.println("this");
    }

    Test(int x) {
        this("is");
    }
}

class faculty extends employee {
    public faculty() {
        System.out.println("ini adalah dari fakultasnya");
        super.setNama("jancok");
        System.out.println(super.getNama());
    }
    public static void ehehe(){
        System.out.println("ehehe");
    }
    public  int ahaha(){
        return "string";
    }
}

class employee extends person {
    public employee() {
        this("ini print dari constructor yang ada di employee");
        System.out.println("ini dari employee extend person");
    }

    public employee(String s) {
        System.out.println(s);
    }
}
