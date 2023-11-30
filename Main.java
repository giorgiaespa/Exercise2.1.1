import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(0, 50);
        try {
            isThere(num);
            System.out.println(num + " è compreso nel range? " + true);
        } catch (Exception e) {
            System.out.println(num + " non è compreso nel range. Errore! " + e);
        }

    }

    public static void isThere(int num) throws ArithmeticException {
        if (num > 20 && num < 50) {
        } else throw new ArithmeticException();
    }
}