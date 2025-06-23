public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int years = 10;

        double futureRecursive = ForecastUtil.futureValueRecursive(presentValue, growthRate, years);
        double futureIterative = ForecastUtil.futureValueIterative(presentValue, growthRate, years);

        System.out.printf("Future Value (Recursive): %.2f\n", futureRecursive);
        System.out.printf("Future Value (Iterative): %.2f\n", futureIterative);
    }
}
