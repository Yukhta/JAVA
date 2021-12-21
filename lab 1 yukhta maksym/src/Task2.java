import java.util.Scanner; // скан класс для получения входных данных 

public class Task2 { // класс

    public static void main(String[] args) {   //создание публичного метода
        Scanner scanner = new Scanner(System.in); //объявляем сканер
        int begin, end, step; //иницилизируем переменные
        System.out.print("Array begin --> "); 
        begin = scanner.nextInt(); //метод сканера считания числа из консиоли и присваивиня его бегин
        System.out.print("Array end --> ");
        end = scanner.nextInt(); //метод сканера считания числа из консиоли и присваивиня его енд
        System.out.print("Step --> ");
        step = scanner.nextInt(); //метод сканера считания числа из консиоли и присваивиня его степ

        for (int i : fillArray(begin, end, step)) {
            System.out.print(i + " "); //заполнение массива
        }
    }

    private static int[] fillArray(int begin, int end, int step){
        int size = Math.abs((end - begin) / step + 1); //уравнение для шага
        int[] array = new int[size];

        int currentNum = begin;
        for (int i = 0; i < size; i++) {
            array[i] = currentNum; //просчет шага
            currentNum += step;
        }
        return array; // возвращение массива
    }
}

