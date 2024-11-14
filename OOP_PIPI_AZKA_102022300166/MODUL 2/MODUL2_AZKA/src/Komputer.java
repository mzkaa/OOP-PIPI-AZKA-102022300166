class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahkomputer;
    protected String namaWarnet;
    protected float hargaPerjam;
    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahkomputer, String namaWarnet, float hargaPerjam) {
        this.jumlahkomputer = jumlahkomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerjam = hargaPerjam;
    }
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi(){
        System.out.println("Jumlah Komputer: " + jumlahkomputer);
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Harga Perjam: " + hargaPerjam);
        System.out.println("---------------------------------------------");
    } 
}