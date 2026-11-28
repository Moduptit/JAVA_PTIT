import java.util.*;

class GiaoVien {
    String ma, ten, xet, type;
    Float d1, d2, tong;
    private static int dem = 0;

    public GiaoVien() {
        ma = String.format("GV%02d", ++dem);
    }

    public void Nhap(Scanner sc) {
        ten = sc.nextLine();
        ma = sc.nextLine();
    }

}

public class J05014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {

        }
        sc.close();
    }
}
