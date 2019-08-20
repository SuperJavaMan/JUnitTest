public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(a, b));
        System.out.println(calculator.minus(a, b));
        System.out.println(calculator.divide(a, b));
        System.out.println(calculator.multi(a, b));

    }
}
