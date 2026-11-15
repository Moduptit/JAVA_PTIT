
import java.util.*;

class complex {
    private int thuc;
    private int ao;

    public complex() {
    }

    public complex(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public complex mul(complex other) {
        int x = this.thuc + other.thuc;
        int y = this.ao + other.ao;

        int a = x * this.thuc - y * this.ao;
        int b = x * this.ao + y * this.thuc;

        return new complex(a, b);
    }

    public complex pow(complex other) {
        int x = this.thuc + other.thuc;
        int y = this.ao + other.ao;

        int a = x * x - y * y;
        int b = 2 * x * y;

        return new complex(a, b);
    }

    @Override
    public String toString() {
        if (ao < 0)
            return thuc + " - " + (-ao) + "i";
        else if (ao == 0)
            return thuc + "";
        return thuc + " + " + ao + "i";
    }
}

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            int c = sc.nextInt(), d = sc.nextInt();

            complex A = new complex(a, b);
            complex B = new complex(c, d);

            complex C = A.mul(B);
            complex D = A.pow(B);

            System.out.println(C + ", " + D);
        }

        sc.close();
    }
}
