public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        double fanrenheit = convertCelsiusToFanrenheit(38.8);
        int iFanherenheit = (int) fanrenheit;
        System.out.println("""
                    O resultado da conversão é: %.2f
                    Somente inteiros é: %d""".formatted(fanrenheit, iFanherenheit));
    }

    public static double convertCelsiusToFanrenheit(double temperature) {
        return ((temperature * 1.8) + 32);
    }
}
