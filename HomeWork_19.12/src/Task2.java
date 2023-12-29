import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arrayRandom =new int[5];
        boolean isIncrease = true;

        for (int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = 10 + rand.nextInt(99);
        }

        System.out.print("Array: ");
        for (int num : arrayRandom) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] >= arrayRandom[i + 1]) {
                isIncrease = false;
                break;
            }
        }
        if (isIncrease) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

//    Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на консоль в строку.
//        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
//
//
//        