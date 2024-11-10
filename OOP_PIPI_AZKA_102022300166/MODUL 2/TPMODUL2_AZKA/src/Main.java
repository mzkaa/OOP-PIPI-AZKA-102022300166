public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Momo", 2, "Persia");
        Burung burung = new Burung("Rio", 1, "Hijau");

        // Menampilkan detail untuk kucing
        System.out.println("Detail Hewan");
        System.out.println();
        
        kucing.infoHewan();
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");

        System.out.println();

        // Menampilkan detail burung
        burung.infoHewan();
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");

        System.out.println();

        // Menampilkan detail tambahan dalam format tersebut
        System.out.println("Nama: " + kucing.nama + ", Umur: " + kucing.umur + " tahun.");
        System.out.println("Ras: " + kucing.getRas());
        
        System.out.println("Nama: " + burung.nama + ", Umur: " + burung.umur + " tahun.");
        System.out.println("Warna bulu: " + burung.getWarnaBulu());
    }
}
