import java.util.*;

class ThiSinh {
    String ten, ns;
    Float d1, d2, d3;
    Float sum;
    int ma;
    private static int dem = 0;

    public ThiSinh() {
        ma = ++dem;

    }

    public void nhap(Scanner sc) {
        ten = sc.nextLine();
        ns = sc.nextLine();
        d1 = Float.parseFloat(sc.nextLine());
        d2 = Float.parseFloat(sc.nextLine());
        d3 = Float.parseFloat(sc.nextLine());
        sum = d1 + d2 + d3;
    }

    public void in() {
        System.out.printf("%d %s %s %.1f%n", ma, ten, ns, sum);
    }

}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] a = new ThiSinh[n];
        float max = -1;
        for (int i = 0; i < n; i++) {
            a[i] = new ThiSinh();
            a[i].nhap(sc);
            if (a[i].sum > max)
                max = a[i].sum;
        }
        for (ThiSinh x : a) {
            if (x.sum == max) {
                x.in();
            }
        }

        sc.close();
    }
}
