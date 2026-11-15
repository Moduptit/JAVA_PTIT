import java.util.*;
class PhanSo{
    private long tuso;
    private long mauso;

    public PhanSo(long tu, long mau){
        this.tuso = tu;
        this.mauso = mau;
    }

    //dung this vi de main goi class chu khong can truyen tham so vao
    public long gcd(){
        long a = this.mauso;
        long b = this.tuso;
        while(b != 0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    //ham in
    public void kq(){
        long g = gcd();
        System.out.printf(this.tuso/g + "/" + this.mauso/g);
    }

}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();

        PhanSo P = new PhanSo(n1, n2);
        P.kq();
        sc.close();
    }
}
