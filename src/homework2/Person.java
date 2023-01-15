package homework2;

import java.util.Objects;

public abstract class Person {

    String name;

    private static String Person;

    private int age;

    private int growth;

    private float weight;

    private boolean workable;

    public Person(){

    }

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
    abstract void die();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getPerson() {
        return Person;
    }

    public static void setPerson(String person) {
        Person = person;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isWorkable() {
        return workable;
    }

    public void setWorkable(boolean workable) {
        this.workable = workable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (growth != person.growth) return false;
        if (Float.compare(person.weight, weight) != 0) return false;
        if (workable != person.workable) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + growth;
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (workable ? 1 : 0);
        return result;
    }

    public void work() {

        if (age >= 18 && age <= 70) {
            System.out.println(name + " может идти на работу");
        } else {
            System.out.println(name + " отдыхает дома");
        }

    }

}
