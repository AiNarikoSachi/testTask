public class Person {
    String fullName;
    int age;

    void move(String fullName) {
        System.out.println("Takoy " + fullName + " govorit");
    }
    void talk(String fullName) {
        System.out.println("Talk " + fullName + " govor");
    }

    Person() {}

    Person(String fullName) {}
}
