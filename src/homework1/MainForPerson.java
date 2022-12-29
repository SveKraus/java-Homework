package homework1;

public class MainForPerson {

    public static void main(String[] args) {

        Person person1 = new Person("Pasha", 15, 167, 67.5f, false);
        person1.name = "Андрей";
        person1.age = 25;
        person1.growth = 185;
        person1.weight = 75.8f;
        person1.workable = true;



        System.out.println(person1);
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.growth);
        System.out.println(person1.weight);
        System.out.println(person1.workable);

        Person person2 = new Person("Viktor", 34, 178, 70.9f, true);
        System.out.println(person2);
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.growth);
        System.out.println(person2.weight);

        person1.infoAboutPerson();
        person2.infoAboutPerson();
        person1.work();
        person2.work();

    }
}
