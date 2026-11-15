import java.util.*;
class Point{
    private double x;
    private double y;

    public Point(){
        x = 0;
        y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p){
        double d1 = this.x - p.x;
        double d2 = this.y - p.y;

        return Math.sqrt(d1*d1 + d2*d2);
    }
    public static double distance(Point p1, Point p2){
        double d1 = p1.x - p2.x;
        double d2 = p1.y - p2.y;

        return Math.sqrt(d1*d1 + d2*d2);
    }
    //check 3 diem thang hang
    public static boolean check(Point p1, Point p2, Point p3) {
        double d = (p2.x - p1.x) * (p3.y - p1.y)
             - (p3.x - p1.x) * (p2.y - p1.y);

        return d != 0;
    }
    //chu vi tam giac
    public static double dt(Point p1, Point p2, Point p3) {
        double d = (p2.x - p1.x) * (p3.y - p1.y)
             - (p3.x - p1.x) * (p2.y - p1.y);

        return Math.abs(d) / 2;
    }
    @Override 
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

}
public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
           
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            Point p3 = new Point(x3,y3);
            
            if (!Point.check(p1,p2,p3)){
                System.out.printf("INVALID\n");
            }else {
                double dt = Point.dt(p1, p2, p3);
                System.out.printf("%.2f\n", dt);
            }
            
        }
        sc.close();
    }
}
