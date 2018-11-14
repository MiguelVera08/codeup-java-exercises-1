import java.util.Arrays;

public class ArraysExercises {

    private static Person[] addPerson(Person[] people, Person man) {
        people = Arrays.copyOf(people, people.length+1);
        people[people.length - 1] = man;
        return people;
    }

    public static void main(String[] args) {
        Person[] peoples = new Person[3];

        peoples[0] = new Person("Jim");
        peoples[1] = new Person("Jimmy");
        peoples[2] = new Person("Jimbo");

        Person jimmbles = new Person("Jimmbles");

        for (Person person : peoples) {
            System.out.println(person.getName());
        }

        System.out.println("+---+---+---+");

        peoples = addPerson(peoples, jimmbles);

        for (Person person : peoples) {
            System.out.println(person.getName());
        }
    }
}
