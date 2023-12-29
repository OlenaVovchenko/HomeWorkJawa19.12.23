import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] randomNumbers = new int[8];

        for (int i = 0; i < randomNumbers.length;i++) {
            randomNumbers[i] = 1 + rand.nextInt(50);
        }
//        System.out.print("Array random numbers: ");
//        for (int num : randomNumbers) {
//            System.out.print(num+ " ");
//        }
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i % 2 != 0) {
                randomNumbers[i] = 0;
            }
        }
        System.out.print("Замените каждый элемент с нечетным индексом на ноль: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }
}
//    Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на консоль в строку.
//        Замените каждый элемент с нечетным индексом на ноль.
//        Снова выведете массив на консоль в отдельной строке.