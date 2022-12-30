package homework2;

public class PensionFond {
    private static final double PENSION_COEFICIENT = 0.02;
    private static final int AVERAGE_SALARY = 1500;

    private String name;
    private boolean isState;

    private final String date;

    public PensionFond(String name, boolean isState, String date) {
        this.name = name;
        this.isState = isState;
        this.date = date;
    }

    public double calculatePension(int age, double minSalary, double maxSalary) {
        double averageSalary;
        if (isState) {
            averageSalary = AverageUtils.averageOfTwoNumber(maxSalary, minSalary);
        } else {
            averageSalary = AverageUtils.averageOfThreeNumber(minSalary, maxSalary, AVERAGE_SALARY);
        }
        return  averageSalary * age * PENSION_COEFICIENT;
    }


}
