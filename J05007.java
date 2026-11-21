import java.time.*;
import java.time.format.*;
import java.util.*;
class NhanVien implements Comparable<NhanVien>{
    String ma, ten, sex, ns, dc, ms, nk;

    private static int dem = 0;
    public NhanVien(){
        ma = String.format("%05d", ++dem);
    }
    public void Nhap(Scanner sc){
        ten = sc.nextLine();
        sex = sc.nextLine();
        ns = sc.nextLine();
        dc = sc.nextLine();
        ms = sc.nextLine();
        nk = sc.nextLine();
    }
    public void in(){
        System.out.printf("%s %s %s %s %s %s %s\n", ma, ten, sex, ns, dc, ms, nk);
    }
    @Override
    public int compareTo(NhanVien other){
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d1 = LocalDate.parse(this.ns, ft);
        LocalDate d2 = LocalDate.parse(other.ns, ft);

        return d1.compareTo(d2);
    }
}
public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> ds = new ArrayList<>();
        while(t -- > 0){
            NhanVien a = new NhanVien();
            a.Nhap(sc);
            ds.add(a);
        }
        Collections.sort(ds);

        for (NhanVien u : ds){
            u.in();
        }
        sc.close();
    }
}
