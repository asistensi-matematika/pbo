public class __live {
    public static void main(String[] args) {
        Dog d = new Dog();
        Puppy e = new Puppy();
        Animal f = new Puppy();
        Animal g = new Dog();//upcasting
        double a1 = 2.0;

        System.out.println((int)a1);
    }
}

class Animal {
    protected String Name;
    Animal() {
        Name = "Chairil Anwar";
        System.out.println("AKU BINATANG JALAAAAAANG!");
    }
    Animal(String name){
        Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void info(){
        System.out.println("aku binatang jalang");
        System.out.println("animal name is "+ Name);
    }
}

class Dog extends Animal {
    Dog() {
        super("Anying");
    }
    Dog(String name){
        super(name);
    }
    public void info(){
        System.out.println("dog is created");
        System.out.println("dog name is "+ Name);
    }
}


class Puppy extends Dog{
    Puppy(){
        super("Popi");
    }
    public void info(){
        System.out.println("anak anying is created");
        System.out.println("anak anying name is "+ Name);
    }

}