public class LoanTransaction {
    private Book buku;
    private Member peminjam;

    public LoanTransaction(Book buku, Member peminjam) {
        this.buku = buku;
        this.peminjam = peminjam;
    }

    public void prosesPeminjaman() {
        if (buku.isTersedia()) {
            buku.setTersedia(false);
            System.out.println(peminjam.getNama() + " meminjam buku: " + buku.getJudul());
        } else {
            System.out.println("Buku tidak tersedia untuk dipinjam.");
        }
    }
}
