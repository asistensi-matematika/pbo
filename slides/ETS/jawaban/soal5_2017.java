public class soal5_2017{
    public static void main(String[] args) {
        Titik2D p2a = new Titik2D();
        p2a.setX(3);
        p2a.setY(4);
        p2a.info();

        Titik2D p2b = new Titik2D(1,2);
        p2b.info();

        Titik3D p3b = new Titik3D(11,12,13);
        p3b.info();
    }
}
class Titik2D{
    private int x, y;
    public Titik2D(){}
    public Titik2D(int X, int Y){
        this.x = X;
        this.y = Y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int X){
        this.x = X;
    }
    public void setY(int Y){
        this.y = Y;
    }
    public void info(){
        System.out.println(x+","+y);
    }
}
class Titik3D extends Titik2D{
    private int z;
    public Titik3D(){}
    public Titik3D(int x, int y, int z){
        this.setX(x);
        this.setY(y);
        this.setZ(x);
    }
    public int getZ(){
        return this.z;
    }
    public void setZ(int z){
        this.z = z;
    }
    public void info(){
        System.out.println(this.getX()+","+this.getY()+","+z);
    }
}