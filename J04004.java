
import java.util.*;

class PhanSo {
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public void kq() {
        long g = gcd(this.tu, this.mau);
        System.out.println((this.tu / g) + "/" + (this.mau / g));
    }

    public PhanSo tong(PhanSo p2) {
        long m = lcm(this.mau, p2.mau);
        long t = this.tu * (m / this.mau) + p2.tu * (m / p2.mau);

        return new PhanSo(t, m);
    }
}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t1 = sc.nextLong();
        long m1 = sc.nextLong();

        long t2 = sc.nextLong();
        long m2 = sc.nextLong();

        PhanSo p1 = new PhanSo(t1, m1);
        PhanSo p2 = new PhanSo(t2, m2);

        PhanSo s = p1.tong(p2);
        s.kq();

        sc.close();
    }
}
