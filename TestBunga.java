/**
 * Created by Rizky on 10/06/2015.
 */
public class TestBunga {
    public static void main(String[] args) {

        bunga mawar = new bunga("mawar","harum",'Y');
        bunga melati = new bunga("melati","wangi",'T');
        bunga raflesia = new bunga("Bangkai","Busuk",'Y');

        tumbuhan berbunga = new tumbuhan("Tumbuhan Mawar","Batang Kecil",mawar);
        System.out.println("Jenis Tumbuhan : " +berbunga.toString());
        tumbuhan wangi = new tumbuhan("Tumbuhan Melati","Batang Kecil",melati);
        System.out.println("Jenis Tumbuhan : " + wangi.toString());
        tumbuhan bangkai = new tumbuhan("Tumbuhan Raflesia","Batang Kecil",raflesia);
        System.out.println("Jenis Tumbuhan : " + bangkai.toString());

        melati.setNama("kamboja");
        melati.setBau("menyengat");
        melati.setDuri('Y');
        berbunga.setNama("Tumbuhan Kamboja");
        berbunga.setJenis(melati);
        System.out.println("Jenis Tumbuhan Baru : " +berbunga.toString());
    }
}
