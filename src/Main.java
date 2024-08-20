import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* Phone iphone1 = new Phone(1,2,3);
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
        person.move("loax"); */

        /*String [] infoMassiv = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedite FIO:");
        String fIO = sc.nextLine();
        infoMassiv[0] = fIO;

        System.out.println("Vvedite nomer chitatelskogo bileta:");
        String numberBook = sc.nextLine();
        infoMassiv[1] = numberBook;

        System.out.println("Vvedite nazvanie faculty:");
        String faculty = sc.nextLine();
        infoMassiv[2] = faculty;

        System.out.println("Vvedite daty rozdenia:");
        String dateBorn = sc.nextLine();
        infoMassiv[3] = dateBorn;

        System.out.println("Vvdeite nomer phone:");
        String numberPhone = sc.nextLine();
        infoMassiv[4] = numberPhone;

        for (int i = 0; i < infoMassiv.length; i++) {
            System.out.print(infoMassiv[i] + " ");
        }*/
        Matrix matrix = new Matrix();
        //Matrix.scannMatrix();
        //matrix.sumMatrix();
        matrix.printMatrix();
    }
}