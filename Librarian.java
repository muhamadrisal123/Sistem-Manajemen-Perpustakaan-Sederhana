public class Librarian extends User {
    public Librarian(String nama, String id) {
        super(nama, id);
    }

    public void tampilkanDataBuku(Book[] daftarBuku) {
        System.out.println("\nDaftar Buku:");
        for (Book buku : daftarBuku) {
            System.out.println("- " + buku.getJudul() + " oleh " + buku.getPenulis() +
                " | Kode: " + buku.getKodeBuku() + " | Tersedia: " + buku.isTersedia());
        }
    }
}
