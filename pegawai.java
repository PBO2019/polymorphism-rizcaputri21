public class pegawai {
    protected int tarif = 100000;

    public static void main(String[] args) {
        supervisor r = new supervisor();
        staff f = new staff();
        Gaji g = new Gaji();

        g.hitungGaji(r.tarif);
        g.hitungGaji(f.tarif);

    }
}
