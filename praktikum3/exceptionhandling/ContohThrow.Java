public class ContohThrow {
    static void cekUmur(int umur) {
        if (umur < 18) {
            throw new IllegalArgumentException("Umur minimal 18 tahun!");
        }
        System.out.println("Umur valid: " + umur);
    }

    public static void main(String[] args) {
        cekUmur(20); // valid
        cekUmur(15); // error
    }
}
