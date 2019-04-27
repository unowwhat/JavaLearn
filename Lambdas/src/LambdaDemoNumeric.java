public class LambdaDemoNumeric {
    public static void main(String[] args) {
        NumericTest isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10,2)) System.out.println("2 является делителем 10");
        if (isFactor.test(10,3)) System.out.println("3 является делителем 10");

        NumericTest lessThan = (n, m) -> (n < m);
        if (lessThan.test(5,10)) System.out.println("5 < 10");

        NumericTest absEqual =(n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if (absEqual.test(-3,3)) System.out.println(" -3 по модулю равен 3");
    }
}
