import java.util.*;
class ThiSinh{
    private String Ten;
    private String Ns;
    private float Diem1, Diem2, Diem3;

    public void Nhap(Scanner sc){
        Ten = sc.nextLine();
        Ns = sc.nextLine();
        Diem1 = sc.nextFloat();
        Diem2 = sc.nextFloat();
        Diem3 = sc.nextFloat();
    }
    public float Tong(){
        return Diem1 + Diem2 + Diem3;
    }
    public void in(){
        System.out.printf("%s %s %.1f", Ten, Ns, Tong());
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh();
        ts.Nhap(sc);
        ts.in();
        sc.close();
    }
}
