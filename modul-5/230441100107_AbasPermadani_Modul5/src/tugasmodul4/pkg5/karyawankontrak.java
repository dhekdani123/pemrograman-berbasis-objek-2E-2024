

package tugasmodul4.pkg5;
public class karyawankontrak extends karyawan {
    int gajibulanan = 2000;
    int komisi = 1000;
    int gajikeseluruhan;
    
    public karyawankontrak(String nama, int usia, String posisi, int gajibulanan, int komisi, int gajikeseluruhan){
         super(nama, usia, posisi);
         this.gajibulanan = gajibulanan;
         this.komisi = komisi;
         this.gajikeseluruhan = gajikeseluruhan;
    }
    
    @Override
    public void tampilkanData(){
        gajikeseluruhan = gajibulanan + komisi;
        System.out.println("Nama saya adalah " + nama);
        System.out.println("Usia saya adalah " + usia);
        System.out.println("Posisi saya sebagai " + posisi);
        System.out.println("Gaji Bulanan saya adalah " + gajibulanan);
        System.out.println("Komisi saya adalah " + komisi);
        System.out.println("Gaji Keseluruhan saya adalah " + gajikeseluruhan);
        
    }
}