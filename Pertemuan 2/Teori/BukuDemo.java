public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("PBO Dengan Bahasa Pemrograman Java", "Samuel Rio Arif Santoso", "TB Mulia", 3269);
        buku1.cetakBuku();
        Buku buku2 = new Buku("Dasar - Dasar Pemrograman", "Santoso Arif Rio Samuel", "TB Mulia", 6969);
        buku2.cetakBuku();
    }
}


class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private Integer tahun;

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }


    public void cetakBuku() {
        if (this.judul == null && this.pengarang == null && this.penerbit == null && this.tahun == null) {
            System.out.println("Masukkan judul, pengarang, penerbit, dan tahun produksi");
        } else {
            System.out.println(judul + ", " + pengarang + ", " + penerbit + ", " + tahun);
        }
    }
}