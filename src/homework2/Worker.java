package homework2;

public class Worker extends Person implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");

    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public double calculatePension() {
        PensionFund pensionFund= new PensionFund("PensionFund Berlin", "16.02.87", TypeOfFund.STATE );
        int age = getAge();
        double result = pensionFund.calculatePension(age, minSalary, maxSalary);
        return result;
    }
}
