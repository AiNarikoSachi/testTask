import java.util.Scanner;

public class Reader {

    String [] infoMassiv = new String[5];
    String fIO;
    String numberBook;
    String faculty;
    String dateBorn;
    String numberPhone;

    void   prisvaivanie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite FIO:");
        fIO = sc.nextLine();
        infoMassiv[0] = fIO;

        System.out.println("Vvedite nomer chitatelskogo bileta:");
        numberBook = sc.nextLine();
        infoMassiv[1] = numberBook;

        System.out.println("Vvedite nazvanie faculty:");
        faculty = sc.nextLine();
        infoMassiv[2] = faculty;

        System.out.println("Vvedite daty rozdenia:");
        dateBorn = sc.nextLine();
        infoMassiv[3] = dateBorn;

        System.out.println("Vvdeite nomer phone:");
        numberPhone = sc.nextLine();
        infoMassiv[4] = numberPhone;

    }
    void takeBook(int chisloKnig) {
        System.out.println(infoMassiv[0] + " Vzyal " + chisloKnig + " kNIGGI");
    }

    void takeBook(String[] knigi) {
        System.out.println(infoMassiv[0] + " Vzyal kNIGGI: " + knigi[0] + ", " + knigi[1] + ", " + knigi[2]);
    }
}
