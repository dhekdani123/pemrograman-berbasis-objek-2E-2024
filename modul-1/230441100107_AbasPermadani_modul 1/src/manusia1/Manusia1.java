
package manusia1;

public class Manusia1 {
     String nama ;
     int umur;
     String alamat;
     
     public void berlari(){
        System.out.println(nama+" sedamg berlari");
     }        
     public void berjalan (){
         System.out.println(nama +" sedang berjalan");
     }
    public static void main(String[] args) {
    Manusia1 aku = new Manusia1();
    Manusia1 teman = new Manusia1();
    
    
    aku.nama = "dani";
    aku.umur = 19;
    aku.alamat = "Desa Bakung Kecamatan Kanor Kabupaten Bojonegoro";
    
    System.out.println("namaku " +aku.nama);
    System.out.println("umurku adalah " +aku.umur);
    System.out.println("alamatku adalah " +aku.alamat);
    aku.berjalan();
    aku.berlari();
    
    
    teman.nama = "robi";
    teman.umur = 20;
    teman.alamat = "Desa Bakung Kecamatan Kanor Kabupaten Bojonegoro";
    
    System.out.println("namaku " +teman.nama);
    System.out.println("umurku adalah " +teman.umur);
    System.out.println("alamatku adalah " +teman.alamat);
    teman.berjalan();
    teman.berlari();
    
    
    
    
    
        
        
    
    }
    
}
