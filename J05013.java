import java.util.*;

class NhanVien implements Comparable<NhanVien> {
    String ten, ma, xet;
    Float d1, d2, tb;

    private static int dem = 0;

    public NhanVien() {
        ma = String.format("TS%02d", ++dem);
    }

    // nhap
    public void Nhap(Scanner sc) {
        ten = sc.nextLine();
        d1 = chuanHoaDiem(Float.parseFloat(sc.nextLine()));
        d2 = chuanHoaDiem(Float.parseFloat(sc.nextLine()));
        tb = (d1 + d2) / 2;
        if (tb > 9.5) {
            xet = "XUAT SAC";
        } else if (tb >= 8) {
            xet = "DAT";
        } else if (tb > 5) {
            xet = "CAN NHAC";
        } else {
            xet = "TRUOT";
        }
    }

    // in
    public void in() {
        System.out.printf("%s %s %.2f %s%n", ma, ten, tb, xet);
    }

    // chuan hoa viet luc 1h sang cai deoo ma stringvalue may abuse tao dcmmm
    public float chuanHoaDiem(float a) {
        if (a > 10 && a < 100) {
            String tmp = String.valueOf((int) a);
            return Float.parseFloat(tmp.charAt(0) + "." + tmp.substring(1));
        }
        return a;
    }

    // so sanh
    @Override
    public int compareTo(NhanVien other) {
        return Float.compare(other.tb, this.tb);
    }

}

public class J05013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        // lap
        ArrayList<NhanVien> ls = new ArrayList<>();
        while (t-- > 0) {
            NhanVien a = new NhanVien();
            a.Nhap(sc);
            ls.add(a);
        }
        Collections.sort(ls);
        for (NhanVien x : ls) {
            x.in();
        }
        sc.close();
    }
}
