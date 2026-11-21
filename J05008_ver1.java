
import java.util.*;

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

public class J05008_ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Point[] p = new Point[n];

            for (int i = 0; i < n; i++)
                p[i] = new Point(sc.nextDouble(), sc.nextDouble());

            double s = 0;
            for (int i = 0; i < n; i++) {
                Point a = p[i], b = p[(i + 1) % n];
                s += a.getX() * b.getY() - a.getY() * b.getX();
            }

            System.out.printf("%.3f%n", Math.abs(s) / 2);
        }
        sc.close();
    }
}
