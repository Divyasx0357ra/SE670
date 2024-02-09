public class MathUtilsTest {

    public static double sqrt(double x) {
        if (x < 0) {
            // Faulty implementation does not handle negative input
            return -1; // Incorrect behavior for negative input
        } else {
            return Math.sqrt(x);
        }
    }

    public static void main(String[] args) {
        testSqrt();
    }

    public static void testSqrt() {
        // Test case for square root of 4
        double input1 = 4;
        double expected1 = 2;
        double actual1 = sqrt(input1);
        assertEqual(expected1, actual1, "Test case for square root of 4");

        // Test case for square root of -4
        double input2 = -4;
        double expected2 = Double.NaN; // Expected behavior for negative input
        double actual2 = sqrt(input2);
        assertEqual(expected2, actual2, "Test case for square root of -4");
    }

    public static void assertEqual(double expected, double actual, String testCase) {
        if (expected == actual) {
            System.out.println(testCase + " passed");
        } else {
            System.out.println(testCase + " failed: Expected " + expected + ", but got " + actual);
        }
    }
}
