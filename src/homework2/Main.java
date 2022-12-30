package homework2;

public class Main {
    public static void main(String[] args) {
        PensionFond statePensionFond = new PensionFond("Goverment", true, "15-02-1990");
        PensionFond notStatePensionFond = new PensionFond("Neu York lions bank", false, "05.11.2005");

        double statePension = statePensionFond.calculatePension(40, 1500.00, 2800.00);
        double notStatePension = notStatePensionFond.calculatePension(40, 1500.00, 2800.00);

        System.out.println(statePension);
        System.out.println(notStatePension);
    }
}
