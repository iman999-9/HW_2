import java.util.Random;

public class HW_2 {

    public static void main(String[] args) {
        // Вызов метода permission с различными входными данными
        System.out.println(permission(generateRandomAge(), 15)); // Случайный возраст, температура 15
        System.out.println(permission(generateRandomAge(), -5)); // Случайный возраст, температура -5
        System.out.println(permission(generateRandomAge(), 30)); // Случайный возраст, температура 30
        System.out.println(permission(generateRandomAge(), 10)); // Случайный возраст, температура 10
        System.out.println(permission(generateRandomAge(), 27)); // Случайный возраст, температура 27
    }

    // Метод, который возвращает строку с результатом
    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    // Метод для генерации случайного возраста
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100); // Возраст от 0 до 99
    }
}
