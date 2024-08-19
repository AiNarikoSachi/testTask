//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone iphone1 = new Phone(1,2,3);
        Phone iphone2 = new Phone(3,4);
        Phone iphone3 = new Phone();

        System.out.println("Это вывод:");
        System.out.println(iphone1.number);
        System.out.println(iphone1.model);
        System.out.println(iphone1.weight);
        iphone1.receiveCall("Vasya");
        System.out.println();

        System.out.println(iphone2.number);
        System.out.println(iphone2.model);
        System.out.println(iphone2.weight);
        System.out.println();

        System.out.println(iphone3.number);
        System.out.println(iphone3.model);
        System.out.println(iphone3.weight);

        iphone3.receiveCall("Vasya", 2);

        iphone1.sendMessage(2);
        System.out.println();


        Person person = new Person();
        Person person1 = new Person();

        person1.move("nik");
        person1.talk("nikao");
        person.talk("vade");
        person.move("loax");

    }
}