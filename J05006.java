import java.util.*;

class NhanVien {
    String ma, ten, sex, ns, dc, mst, nk;
    private static int dem = 0;

    public NhanVien() {
        dem++;
        ma = String.format("%05d", dem);
    }

    public void Nhap(Scanner sc) {
        ten = sc.nextLine();
        sex = sc.nextLine();
        ns = sc.nextLine();
        dc = sc.nextLine();
        mst = sc.nextLine();
        nk = sc.nextLine();
    }

    public void in() {
        System.out.printf("%s %s %s %s %s %s %s\n", ma, ten, sex, ns, dc, mst, nk);
    }
}

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            NhanVien p = new NhanVien();
            p.Nhap(sc);
            p.in();
        }
        sc.close();
    }
}
