package tugasmodul4.pkg5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        karyawan[] daftarKaryawan = new karyawan[2];
        
        
        System.out.println("Masukkan data karyawan tetap:");
        System.out.print("Nama: ");
        String nama1 = input.nextLine();
        System.out.print("Usia: ");
        int usia1 = input.nextInt();
        input.nextLine(); 
        System.out.print("Posisi: ");
        String posisi1 = input.nextLine();
        System.out.print("Gaji Bulanan: ");
        int gajiBulanan1 = input.nextInt();
        input.nextLine(); 
        
        
        karyawantetap orang1 = new karyawantetap(nama1, usia1, posisi1, gajiBulanan1);
        System.out.println("\nData karyawan tetap berhasil dimasukkan:");
        orang1.tampilkanData();
        
        
        System.out.println("\nMasukkan data karyawan kontrak:");
        System.out.print("Nama: ");
        String nama2 = input.nextLine();
        System.out.print("Usia: ");
        int usia2 = input.nextInt();
        input.nextLine(); 
        System.out.print("Posisi: ");
        String posisi2 = input.nextLine();
        System.out.print("Gaji Bulanan: ");
        int gajiBulanan2 = input.nextInt();
        System.out.print("Komisi: ");
        int komisi2 = input.nextInt();
       
        int gajiKeseluruhan2 = gajiBulanan2 + komisi2;
        
        
        karyawankontrak orang2 = new karyawankontrak(nama2, usia2, posisi2, gajiBulanan2, komisi2, gajiKeseluruhan2);
        System.out.println("\nData karyawan kontrak berhasil dimasukkan:");
        orang2.tampilkanData();
        
        
        daftarKaryawan[0] = orang1;
        daftarKaryawan[1] = orang2;
        
       
        System.out.println("\nData karyawan dalam array:");
        for (karyawan k : daftarKaryawan) {
            k.tampilkanData();
            System.out.println(); 
        }
        
        input.close(); 
    }
}
