import java.util.*;
class Point{
    private double x;
    private double y;

    //constructor mac dinh
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    //constructor co tham so
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //constructor sao chep
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    //getx
    public double getX(){
        return x;
    }

    //gety
    public double getY(){
        return y;
    }
    // khoang cach giua 2 diem
    public double distance(Point p2){
        double dx = Math.abs(this.x - p2.x);
        double dy = Math.abs(this.y - p2.y);

        return Math.sqrt(dx * dx + dy * dy);
    }
    public static double distance(Point p1, Point p2){
        double dx = Math.abs(p1.x - p2.x);
        double dy = Math.abs(p1.y - p2.y);
        
        return Math.sqrt(dx * dx + dy * dy);
    }
    //to string
    @Override
    public String toString(){
        return "( " + x + ", " + y + " ) ";
    }
}

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);

            double d = p1.distance(p2);

            System.out.printf("%.4f%n", d);
        }
        sc.close();
    }
}
