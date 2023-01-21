package homework2;

public class Main {
    public static void main(String[] args) {
        PensionFund statePensionFond = new PensionFund("Goverment", true, "15-02-1990");
        PensionFund notStatePensionFond = new PensionFund("Neu York lions bank", false, "05.11.2005");

        double statePension = statePensionFond.calculatePension(40, 1500.00, 2800.00);
        double notStatePension = notStatePensionFond.calculatePension(40, 1500.00, 2800.00);

        System.out.println(statePension);
        System.out.println(notStatePension);

        Worker worker1 = new Worker();

        worker1.setMinSalary(1000);
        worker1.setMaxSalary(2000);
        worker1.setAge(50);

        double answer = worker1.calculatePension();
        System.out.println(worker1 + ", твоя пенсия составит $ : ");
        System.out.println(answer);


    }
}
