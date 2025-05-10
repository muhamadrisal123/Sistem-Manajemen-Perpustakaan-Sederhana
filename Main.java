import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah buku
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        Book[] daftarBuku = new Book[jumlahBuku];
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Kode Buku: ");
            String kode = scanner.nextLine();
            daftarBuku[i] = new Book(judul, penulis, kode);
        }

        // Input jenis anggota
        System.out.print("\nMasukkan jenis anggota (1: Siswa, 2: Guru): ");
        int jenis = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        Member anggota = null;
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();

        if (jenis == 1) {
            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();
            anggota = new StudentMember(nama, id, kelas);
        } else if (jenis == 2) {
            System.out.print("Mata Pelajaran: ");
            String mapel = scanner.nextLine();
            anggota = new TeacherMember(nama, id, mapel);
        }

        // Tampilkan daftar buku
        Librarian petugas = new Librarian("Bu Rina", "L001");
        petugas.tampilkanDataBuku(daftarBuku);

        // Peminjaman
        System.out.print("\nMasukkan indeks buku yang ingin dipinjam (mulai dari 0): ");
        int indeks = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        if (indeks >= 0 && indeks < daftarBuku.length) {
            LoanTransaction transaksi = new LoanTransaction(daftarBuku[indeks], anggota);
            transaksi.prosesPeminjaman();
        } else {
            System.out.println("Indeks buku tidak valid.");
        }

        // Tampilkan daftar buku setelah transaksi
        System.out.println();
        petugas.tampilkanDataBuku(daftarBuku);
        scanner.close();
    }
}
