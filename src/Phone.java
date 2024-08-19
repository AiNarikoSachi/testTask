public class Phone {
    int number;
    int model;
    int weight;

    void receiveCall(String  name) {
        System.out.println("Zvonit " + name);
    }

    void receiveCall(String name, int number) {
        System.out.println("Zvonit " + name);
        System.out.println("Nomer " + number);
    }

    int getNumber() {
        return number;
    }

    Phone (int number, int model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone (int number, int model) {
        this.number = number;
        this.model = model;
    }
    Phone () {}

    void sendMessage(int number) {
        System.out.println("Nomer " + number);
    }
}
