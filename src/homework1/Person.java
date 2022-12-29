package homework1;

public class Person {

    String name;

    static String Person;

    int age;

    int growth;

    float weight;

    boolean workable;

    public Person(String name, int age, int growth, float weight, boolean workable) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.workable = workable;
    }

    public void infoAboutPerson() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(growth);
        System.out.println(weight);

    }

    public void work() {

        if (age >= 18 && age <= 70) {
            System.out.println(name + " может идти на работу");
        } else {
            System.out.println(name + " отдыхает дома");
        }



    }
}
