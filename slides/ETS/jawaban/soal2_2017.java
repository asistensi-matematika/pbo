public class soal2_2017{
    public static void main(String[] args) {
        Hewan hewan1 = new kucing();
        System.out.println("Nilai x = "+ hewan1.x);
        hewan1.suara(); //gak bisa pake info, karena yang bisa akses info cuman class kucing aja, polymorphism kaya gini hanya bisa akses method yang di override aja
        anjing dog = new anjing();
        System.out.println("Nilai x = "+ dog.x);
        dog.suara(dog);
        Hewan hewan2 = new anjing();
        System.out.println("Nilai x = "+ hewan2.x);
        hewan2.suara();
    }
}

class Hewan{
    int x;
    public void suara(){
        System.out.println("DIAAM");
    }
}
class kucing extends Hewan{
    int x = 10;
    public void info(){
        System.out.println("Meeoow..");
    }
}
class anjing extends Hewan{
    int x = 7;
    public void suara(){
        System.out.println("woof...");
    }
    public void suara (anjing dog){
        System.out.println("woof woof..");
    }
}