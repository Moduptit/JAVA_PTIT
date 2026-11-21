import java.util.*;

class Point {
    double x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point b) {
        this.x = b.x;
        this.y = b.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point other) {
        double dx = Math.abs(this.x - other.x);
        double dy = Math.abs(this.y - other.y);

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distance(Point a, Point b) {
        double dx = Math.abs(a.x - b.y);
        double dy = Math.abs(a.y - b.y);

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

public class J05008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<Point> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                ls.add(new Point(x, y));
            }
            // shoselace:
            double sum1 = 0, sum2 = 0;
            for (int i = 0; i < ls.size(); i++) {
                int j = (i + 1) % n;

                sum1 += ls.get(i).getX() * ls.get(j).getY();
                sum2 += ls.get(j).getX() * ls.get(i).getY();

            }
            double s = 0.5 * Math.abs(sum1 - sum2);
            System.out.printf("%.3f%n", s);

        }
        sc.close();
    }
}
