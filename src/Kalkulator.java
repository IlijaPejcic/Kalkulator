 public class Kalkulator {

    private double operand1;
    private double operand2;

    public Kalkulator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add() {
        return operand1 + operand2;
    }

    public double sub() {
        return operand1 - operand2;
    }

    public double mul() {
        return operand1 * operand2;
    }

    public String div() { // Promenjen tip vraćanja u String
        if (operand2 != 0) {
            return String.valueOf(operand1 / operand2); // Vraćamo rezultat kao String
        } else {
            return "Deljenje sa nulom nije dozvoljeno!"; // Poruka o grešci
        }
    }
}
