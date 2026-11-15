import java.util.*;
class SinhVien{
    private String Ma; 
    private String Ten;
    private String Lop;
    private String Ns;
    private Float GPA;

    public SinhVien(){
        Ma = "B20DCCN001";
    }
    public void Nhap(Scanner sc){
        Ten = sc.nextLine();
        Lop = sc.nextLine();
        Ns = sc.nextLine();
        GPA = sc.nextFloat();
    }
    public void chuanhoa(){
        if (Ns.charAt(1) == '/'){
            Ns = "0" + Ns;
        }
        if (Ns.charAt(4) == '/'){
            Ns = Ns.substring(0,3) + "0" + Ns.substring(3);
        }
    }
    public void in(){
        System.out.printf("%s %s %s %s %.2f", Ma, Ten, Lop, Ns, GPA);
    }
}
public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        sv.Nhap(sc);
        sv.chuanhoa();
        sv.in();
        sc.close();
    }
}
