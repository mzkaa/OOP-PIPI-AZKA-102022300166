class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahkomputer, String namaWarnet, float hargaPerjam, boolean ruangPrivat) {
        super(jumlahkomputer, namaWarnet, hargaPerjam);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi() {
        super.Informasi();
        if (ruangPrivat) {
            System.out.println("status         :Ruang premium");

            System.out.println("Fasilitas ruang Premium:");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- sofa gaming exlusive");
            System.out.println("- koneksi internet dedicate 100mbps");
        } else {
            System.out.println("status         :Ruang standar");

            System.out.println("Fasilitas ruang standar:");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- komputer spesifikasi rendah");
            System.out.println("- koneksi internet dedicated 1mbps");
        }
    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(String pesan) {
        System.out.println("Pesan: " + pesan);
    }
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void tambahLayanan(String makanan) {
        System.out.println("makanan: " + makanan);
    }
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void tambahLayanan(String makanan, int minuman) {
        System.out.println("Layanan: " + makanan + ", Jumlah: " + minuman);
    }

}

