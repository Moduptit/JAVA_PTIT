import java.util.*;

class SinhVien implements Comparable<SinhVien> {
    String ma, ten, lop, ns;
    Float GPA;
    public static int dem = 0;

    public SinhVien() {
        dem++;
        ma = String.format("B20DCCN%03d", dem);
    }

    public void nhap(Scanner sc) {
        ten = chuanHoaTen(sc.nextLine());
        lop = sc.nextLine();
        ns = sc.nextLine();
        GPA = Float.parseFloat(sc.nextLine());

        ns = chuanHoaNs(ns);
    }

    public void in() {
        System.out.printf("%s %s %s %s %.2f\n", ma, ten, lop, ns, GPA);
    }

    public String chuanHoaTen(String s) {
        s = s.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] a = s.split(" ");

        String res = "";
        for (String x : a) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String chuanHoaNs(String s) {
        String[] a = s.split("/");
        return String.format("%02d/%02d/%s", Integer.parseInt(a[0]), Integer.parseInt(a[1]), a[2]);
    }

    @Override
    public int compareTo(SinhVien other) {
        return Float.compare(other.GPA, this.GPA);
    }
}

public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        List<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            SinhVien p = new SinhVien();
            p.nhap(sc);
            list.add(p);
        }

        Collections.sort(list);
        for (SinhVien x : list) {
            x.in();
        }
        sc.close();
    }
}
