public class CompoundInterestCalculatorTest {

    public static void main(String[] args) {
        // Test cases
        testCalculateCompoundInterest();
    }

    public static void testCalculateCompoundInterest() {
        // Test case 1
        double principal1 = 1000;
        double rate1 = 0.05;
        int years1 = 3;
        double expectedInterest1 = 157.63; // Calculated manually
        double actualInterest1 = CompoundInterestCalculator.calculateCompoundInterest(principal1, rate1, years1);
        assertDoubleEquals(expectedInterest1, actualInterest1);

        // Test case 2
        double principal2 = 2000;
        double rate2 = 0.08;
        int years2 = 2;
        double expectedInterest2 = 336; // Calculated manually
        double actualInterest2 = CompoundInterestCalculator.calculateCompoundInterest(principal2, rate2, years2);
        assertDoubleEquals(expectedInterest2, actualInterest2);
    }

    private static void assertDoubleEquals(double expected, double actual) {
        // Allow a small epsilon difference due to floating-point precision
        double epsilon = 0.001;
        if (Math.abs(expected - actual) > epsilon) {
            System.out.println("Test failed: Expected " + expected + ", but got " + actual);
        } else {
            System.out.println("Test passed");
        }
    }
}
