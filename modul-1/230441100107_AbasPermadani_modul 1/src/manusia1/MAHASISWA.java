package mahasiswa;
import java.util.Scanner;
class MAHASISWA {
    String nama;
    long nim;
    String jurusan;
    String alamat;
    
    public void tampilkanData(){
       System.out.println("=====>MAHASISWA<=====");
       System.out.println("Nama :"+ nama);
       System.out.println("Nim :"+ nim);
       System.out.println("Jurusan :"+ jurusan);
       System.out.println("Alamat :"+ alamat);
}

/**
 *
 * @author LENOVO
 */

    public static void main(String[] args) {
      
    
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        MAHASISWA mahasiswa = new MAHASISWA();
        
        System.out.println("Masukkan nama :");
        mahasiswa.nama = input.nextLine();
        
        System.out.println("Masukkan nim :");
        mahasiswa.nim = input.nextLong();
        input.nextLine();
        
        System.out.println("Masukkan jurusan :");
        mahasiswa.jurusan = input.nextLine();
        
        System.out.println("Masukkan alamat :");
        mahasiswa.alamat = input.nextLine();
        
        System.out.println("\n  Mahasiswa");
        mahasiswa.tampilkanData();
    
}
