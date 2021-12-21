package lab_4;

import java.util.*;  //импорт библиотек 
 
public class TaskTwo {

    public static void main(String[] args) {    // создаение публичного меттода 
        System.out.print("Enter size of Array: ");
        int size = (new Scanner(System.in)).nextInt(); // size берет данных которые исходят из сканнирование того что написал пользователь  
        int[] arr = new int[size]; //массив
        fillArrayRandomValues(arr, 0, 9); //заполняем массив рандом числами 
        printArray(arr); 

        OptionalDouble result = Arrays.stream(arr) //опшнлдабл - активация тру фолс через дабл  стрим преозбравоние в поток
                .filter(item -> item % 2 == 0) //фильтрация данных
                .average(); // возвращает OptionalDouble, описывающий среднее арифметическое элементов этого потока,

        System.out.println(result.getAsDouble()); //Если значение присутствует в этом OptionalDouble
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + ", ");    //выводит массив через запятую в консоль
        }
        System.out.println();
    }

    private static void fillArrayRandomValues(int[] arr, int begin, int end) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(end - begin + 1) + begin;           //для рандомных чисел
        }
    }
}
