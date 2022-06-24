public class Main {
    public static void main(String[] args) {
        int cost = 10_612; // стоимость билета;
        int mile = 20; // кол-во рублей в 1 миле;

        int bonus = cost / mile; // Переменная хранящая кол-во бонусных миль

        System.out.println(" Вы получите " + bonus + " бонусных миль");
    }
}
