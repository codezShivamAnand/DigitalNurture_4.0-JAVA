public class ForecastUtil {

    public static double futureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) return presentValue; // Base case
        return futureValueRecursive(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static double futureValueIterative(double presentValue, double growthRate, int years) {
        double futureValue = presentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
