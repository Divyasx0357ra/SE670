public class SimpleInterestCalculatorTest {
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        
        // Test case 1
        double principal1 = 1000;
        double rate1 = 5;
        double time1 = 2;
        double expectedInterest1 = 100;
        double actualInterest1 = calculator.calculateSimpleInterest(principal, rate1, time1);
        if (expectedInterest1 == actualInterest1) {
            System.out.println("Test case 1 passed");
        } else {
            System.out.println("Test cases 1 failed");
        }
        
        // Test case 2
        double principal2 = 2000;
        double rate2 = 8;
        double time2 = 3;
        double expectedInterest2 = 480;
        double actualInterest2 = calculator.calculateSimpleInterest(principal2, rate2, time2);
        if (expectedInterest2 == actualInterest2) {
            System.out.println("Test case 2 passed");
        } else {
            System.out.println("Test case 2 failed");
        }
        
    }
}
