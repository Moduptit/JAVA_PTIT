import java.util.*;

class HoaDon implements Comparable<HoaDon> {
    String ma, ten;
    long sl, don, ck, tong;

    public HoaDon() {

    }

    public void Nhap(Scanner sc) {
        ma = sc.nextLine();
        ten = sc.nextLine();
        sl = Long.parseLong(sc.nextLine());
        don = Long.parseLong(sc.nextLine());
        ck = Long.parseLong(sc.nextLine());
        tong = sl * don - ck;
    }

    public void in() {
        System.out.printf("%s %s %d %d %d %d\n", ma, ten, sl, don, ck, tong);
    }

    @Override
    public int compareTo(HoaDon other) {
        return Long.compare(other.tong, this.tong);
    }

}

public class J05012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        // test
        ArrayList<HoaDon> ls = new ArrayList<>();
        while (t-- > 0) {
            HoaDon a = new HoaDon();
            a.Nhap(sc);
            ls.add(a);
        }
        Collections.sort(ls);
        for (HoaDon x : ls) {
            x.in();
        }
        sc.close();
    }
}
