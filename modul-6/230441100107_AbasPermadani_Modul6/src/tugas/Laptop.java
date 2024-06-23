
package tugas;


public class Laptop extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    public void hidupkan_os(){
        System.out.println("silahkan hidupkan Laptop anda dengan tombol power");
    }
    @Override
    public void matikan_os(){
        System.out.println("silahkan matikan Laptop anda dengan tombol power");
    }
    @Override
    public void klik_kanan(){
        System.out.println("klik kanan untuk sesuatu pada Laptop anda");
    }
    @Override
     public void klik_kiri(){
        System.out.println("klik kiri untuk sesuatu pada Laptop anda");
    }
    @Override
    public void tekan_enter(){
        System.out.println("tekan enter pada Laptop anda untuk memberikan space pada deskripsi");
    }
    @Override
    public void cetak_data(){
        System.out.println("silahkan cetak data anda dengan icon print yang ada di laptop anda");
        System.out.println();
    }
    
}
