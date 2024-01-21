
class Calculator {
    // method overloading
    // same function name, but different function signatures
    // signature can differ by # of input parameters, and their types
    // which can consequently change the return type too

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double d1, double d2) {
        return d1 + d2;
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}