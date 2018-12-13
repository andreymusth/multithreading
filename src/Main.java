import example.PeopleQueue;

public class Main {

    public static void main(String[] args) {

        PeopleQueue queue1 = new PeopleQueue("Maria", "Nasta", "Daria");
        PeopleQueue queue2 = new PeopleQueue("Sergei", "Vasya", "Ilya", "Petr");

        queue1.start();
        queue2.start();

    }
}
