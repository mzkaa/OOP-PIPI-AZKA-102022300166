class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahkomputer, String namaWarnet, float hargaPerjam, boolean vipCard) {
        super(jumlahkomputer, namaWarnet, hargaPerjam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi() {
        super.Informasi();
        if (vipCard) {
            System.out.println("status:         member VIP");
        } else {
            System.out.println("BENEFIT MEMBER VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputr gaming");
        }
    }
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void login(String username) {
        System.out.println("username: " + username);
    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void bermain(int jam) {
        System.out.println("jam: " + jam);
    }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void bermain(int jam, int menitTambah) {
        System.out.println("jam: " + jam + ", menit: " + menitTambah);
    }
}