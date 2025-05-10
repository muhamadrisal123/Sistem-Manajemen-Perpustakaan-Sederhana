public class Book {
    private String judul;
    private String penulis;
    private String kodeBuku;
    private boolean tersedia;

    public Book(String judul, String penulis, String kodeBuku) {
        this.judul = judul;
        this.penulis = penulis;
        this.kodeBuku = kodeBuku;
        this.tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
