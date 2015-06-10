/**
 * Created by Rizky on 10/06/2015.
 */
public class tumbuhan {
    private String nama;
    private String batang;
    private bunga jenis;

    //construktor

    public tumbuhan(String nama, String batang, bunga jenis) {
        this.nama = nama;
        this.batang = batang;
        this.jenis = jenis;
    }

    public tumbuhan(String nama, bunga jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    //getter setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBatang() {
        return batang;
    }

    public void setBatang(String batang) {
        this.batang = batang;
    }

    public bunga getJenis() {
        return jenis;
    }

    public void setJenis(bunga jenis) {
        this.jenis = jenis;
    }

    //toString
    @Override
    public String toString() {
        return "tumbuhan{" +
                "nama='" + nama + '\'' +
                ", batang='" + batang + '\'' +
                ", jenis=" + jenis +
                '}';
    }
}
