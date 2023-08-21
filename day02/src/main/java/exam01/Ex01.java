package exam01;

public class Ex01 {
    public static void main(String[] args) {
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10);
        System.out.println("cal1 값 : " + result1);

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10);
        System.out.println("cal2 값 : " + result2);

    }
}
