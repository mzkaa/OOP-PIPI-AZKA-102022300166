import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ802", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        Scanner scanner = new Scanner(System.in);
        Penumpang penumpang = null;
        Penerbangan penerbanganDipilih = null;

        while (true) {
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                int i = 1;
                for (Penerbangan penerbangan : daftarPenerbangan) {
                    System.out.print(i + ". ");
                    penerbangan.tampilDaftarPenerbangan();
                    System.out.println();
                    i++;
                }
            } else if (menu == 2) {
                System.out.print("Masukan NIK: ");
                String NIK = scanner.next();
                System.out.print("Masukan Nama Depan: ");
                String namaDepan = scanner.next();
                System.out.print("Masukan Nama Belakang: ");
                String namaBelakang = scanner.next();

                penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

                int i = 1;
                for (Penerbangan penerbangan : daftarPenerbangan) {
                    System.out.print(i + ". ");
                    penerbangan.tampilDaftarPenerbangan();
                    System.out.println();
                    i++;
                }

                System.out.print("Pilih nomor penerbangan (ex: 1): ");
                int nomorPenerbanganDipilih = scanner.nextInt();
                penerbanganDipilih = daftarPenerbangan.get(nomorPenerbanganDipilih - 1);

                System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
            } else if (menu == 3) {
                if (penumpang == null || penerbanganDipilih == null) {
                    System.out.println("Pembelian Tiket Tidak Ada");
                } else {
                    System.out.println("====== Detail Tiket Penerbangan ======");
                    penumpang.tampilDaftarPenumpang();
                    penerbanganDipilih.tampilDaftarPenerbangan();
                }
            } else if (menu == 4) {
                System.out.println("Terima kasih!");
                break;
            }
        }
        scanner.close();
    }
}