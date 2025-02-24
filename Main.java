import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, друг! Посчитаем пошлину?");
        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();
        int duty = CustomsService.calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.): " + duty);
    }
}