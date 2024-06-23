
package tugasmodul4.pkg5;


public class karyawantetap extends karyawan {
     int gajibulanan;
     public karyawantetap (String nama, int usia, String posisi, int gajibulanan){
         super (nama, usia, posisi);
         this.gajibulanan = gajibulanan;
     }

    
     
     
     
     
    public void tampilkanData (){
        System.out.println("Nama saya adalah " +nama);
        System.out.println("Usia saya adalah " +usia);
        System.out.println("Posisi saya sebagai " +posisi);
        System.out.println("Gaji bulanan saya " +gajibulanan);
        
    }
}
