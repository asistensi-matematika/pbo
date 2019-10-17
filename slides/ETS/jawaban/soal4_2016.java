public class soal4{
    public static void main(String[] args) {
        Point2D a = new Point2D(2,3);
        Point3D b = new Point3D(3,4,5);
        System.out.println(b.toString());
    }
}
class Point2D{
    private int x,y;
    public Point2D(){}
    public Point2D(int X, int Y){
        this.x = X;
        this.y = Y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public String toString(){
        return x+","+y;
    }
}

class Point3D extends Point2D{
    private int z;
    public Point3D(int x, int y, int z){
        super(x,y);
        this.setZ(z);
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z = z;
    }

    @Override
    public String toString(){
        return getX() + "," + getY() + "," + getZ();
    }
}