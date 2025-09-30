public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; // error: bagi nol
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan!");
        }
    }
}
