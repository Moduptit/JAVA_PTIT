import java.util.*;
class NhanVien{
    private String Ma;
    private String Ten;
    private String Sex;
    private String Ns;
    private String Dc;
    private Long Ms;
    private String Nk;

    public NhanVien(){
        Ma = "00001";
    }
    public void Nhap(Scanner sc){
        Ten = sc.nextLine();
        Sex = sc.nextLine();
        Ns = sc.nextLine();
        Dc = sc.nextLine();
        Ms = sc.nextLong();
        sc.nextLine();
        Nk = sc.nextLine();
    }
    public void in(){
        System.out.printf("%s %s %s %s %s %d %s", Ma, Ten, Sex, Ns, Dc, Ms, Nk);
    }
}
public class J04007{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.Nhap(sc);
        nv.in();
        sc.close();
    }
} 