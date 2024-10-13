public class Main {
    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator(30, 14);
        System.out.println("Sabiranje: " + kalkulator.add());
        System.out.println("Oduzimanje: " + kalkulator.sub());
        System.out.println("Množenje: " + kalkulator.mul());
        System.out.println("Deljenje: " + kalkulator.div());
    }
}