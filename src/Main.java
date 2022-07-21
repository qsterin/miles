import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int m = 20;
        Scanner ticket = new Scanner(System.in);
        long var_num;
        System.out.print("Введите стоимость билета: ");
        var_num = ticket.nextInt();
        System.out.print("Вы заработали: " + var_num/m + " миль");
    }
}