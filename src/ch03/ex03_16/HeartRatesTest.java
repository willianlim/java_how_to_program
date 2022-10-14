package ch03.ex03_16;

public class HeartRatesTest {

    public static void main(String[] args) {
        HeartRates heartRates = new HeartRates("Willian", "Lima", 9, 9, 1998);

        System.out.printf("Maximum heart rate: %s bpm%n", heartRates.getTargetHeartRate());
        System.out.printf("Targe heart rate: %s bpm%n", heartRates.getMaximumHeartRate());
    }
}
