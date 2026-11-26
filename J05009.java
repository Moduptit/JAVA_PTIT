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
        System.out.printf("%d %s %s %f%n", ma, ten, ns, sum);
    }
    // public float compareTo(ThiSinh other){

    // }
}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> ls = new ArrayList<>();
        while (t-- > 0) {
            ThiSinh a = new ThiSinh();
            a.nhap(sc);
            ls.add(a);
        }
        sc.close();
    }
}
