public class CompoundInterestCalculator {

    public static void main(String[] args) {
        // Example usage
        double principal = 1000;
        double rate = 0.05;
        int years = 3;
        
        double compoundInterest = calculateCompoundInterest(principal, rate, years);
        System.out.println("Compound Interest: " + compoundInterest);
    }

    public static double calculateCompoundInterest(double principal, double rate, int years) {
        double amount = principal * Math.pow(1 + rate, years);
        return amount - principal;
    }
}
