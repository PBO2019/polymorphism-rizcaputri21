public class Gaji {
    private int tarif;
    private int hasil;

    public void hitungGaji(int tarif){
        this.hasil= 30 * tarif;
        System.out.println("Total = " + hasil);
    }
}
