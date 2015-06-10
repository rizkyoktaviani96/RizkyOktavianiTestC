/**
 * Created by Rizky on 10/06/2015.
 */
public class bunga {
    //variable
    private String nama;
    private String bau;
    private char duri;

    //constructor

    public bunga(String nama, String bau, char duri) {
        this.nama = nama;
        this.bau = bau;
        this.duri = duri;
    }

    public bunga(String nama, String bau) {
        this.nama = nama;
        this.bau = bau;
    }

    //getter setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public char getDuri() {
        return duri;
    }

    public void setDuri(char duri) {
        this.duri = duri;
    }

    //toString
    @Override
    public String toString() {
        return "bunga{" +
                "nama='" + nama + '\'' +
                ", bau='" + bau + '\'' +
                ", Memiliki duri=" + duri +
                '}';
    }
}
