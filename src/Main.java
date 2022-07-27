import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int oneMile = 20;
        Scanner ticket = new Scanner(System.in);
        long ticketPrice;
        System.out.print("Введите стоимость билета: ");
        ticketPrice = ticket.nextInt();
        System.out.print("Вы заработали: " + ticketPrice/oneMile + " миль");
    }
}