
import java.util.*;

class SinhVien {
    String ma, ten, ns, lop;
    Float GPA;
    private static int dem = 0;

    public SinhVien() {
        dem++;
        ma = String.format("B20DCCN%03d", dem);
    }

    public void Nhap(Scanner sc) {
        ten = chuanHoaTen(sc.nextLine());
        lop = sc.nextLine();
        ns = sc.nextLine();
        GPA = Float.parseFloat(sc.nextLine());

        ns = chuanHoaNgaySinh(ns);
    }

    public void in() {
        System.out.printf("%s %s %s %s %.2f%n",
                ma, ten, lop, ns, GPA);
    }

    public String chuanHoaTen(String s) {
        s = s.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] a = s.split(" ");

        String res = "";
        for (String x : a) {
            res += Character.toUpperCase(x.charAt(0))
                    + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String chuanHoaNgaySinh(String s) {
        String[] a = s.split("/");
        return String.format("%02d/%02d/%s",
                Integer.parseInt(a[0]),
                Integer.parseInt(a[1]),
                a[2]);
    }
}

public class J05004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            SinhVien p = new SinhVien();
            p.Nhap(sc);
            p.in();
        }
        sc.close();
    }
}
