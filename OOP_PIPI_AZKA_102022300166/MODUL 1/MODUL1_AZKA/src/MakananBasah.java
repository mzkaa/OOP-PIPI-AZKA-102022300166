// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama;
    private int jumlah;
    private double harga;
    private String bahan;
    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }
    // Todo : Create Getter and Setter
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }

    public String getBahan(){
        return bahan;
    }
    public void setBrand(String bahan){
        this.bahan = bahan;
    }
    // Todo : Create Method ShowData
public void ShowData(){
    System.out.println("Masukan Nama Makanan: " + nama);
    System.out.println("Masukan Jumalah Makanan: " + jumlah);
    System.out.println("Masukan Harga Makanan: " + harga);
    System.out.println("Masukan Bahan Makanan: " + bahan);
}
}