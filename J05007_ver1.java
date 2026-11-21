
import java.util.*;

class NhanVien {
    String ma, ten, sex, ns, dc, ms, nk;

    private static int dem = 0;

    public NhanVien() {
        ma = String.format("%05d", ++dem);
    }

    public void Nhap(Scanner sc) {
        ten = sc.nextLine();
        sex = sc.nextLine();
        ns = sc.nextLine();
        dc = sc.nextLine();
        ms = sc.nextLine();
        nk = sc.nextLine();
    }

    public void in() {
        System.out.printf("%s %s %s %s %s %s %s\n",
                ma, ten, sex, ns, dc, ms, nk);
    }

    public int compareString(NhanVien other) {
        String nam1 = this.ns.substring(6, 10);
        String nam2 = other.ns.substring(6, 10);

        if (!nam1.equals(nam2))
            return nam1.compareTo(nam2);

        String thang1 = this.ns.substring(3, 5);
        String thang2 = other.ns.substring(3, 5);

        if (!thang1.equals(thang2))
            return thang1.compareTo(thang2);

        String ngay1 = this.ns.substring(0, 2);
        String ngay2 = other.ns.substring(0, 2);

        return ngay1.compareTo(ngay2);
    }
}

public class J05007_ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        NhanVien[] ds = new NhanVien[t];

        for (int i = 0; i < t; i++) {
            ds[i] = new NhanVien();
            ds[i].Nhap(sc);
        }

        // Sap xep tang dan theo ngay sinh
        for (int i = 0; i < t - 1; i++) {
            for (int j = i + 1; j < t; j++) {
                if (ds[i].compareString(ds[j]) > 0) {
                    NhanVien temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            ds[i].in();
        }

        sc.close();
    }
}
