package tugas4;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        System.out.print("Masukkan jumlah uang yang ingin dipinjam : ");
        int pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        System.out.print("Masukkan jumlah uang yang ingin dipinjam : ");
        int pinjam1 = sc.nextInt();
        donny.pinjam(pinjam1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");
        System.out.print("Masukkan jumlah uang yang ingin diangsur : ");
        int angsur = sc.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        System.out.print("Masukkan jumlah uang yang ingin diangsur : ");
        int angsur1 = sc.nextInt();
        donny.angsur(angsur1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
