import java.util.Random; //класс для генерации чисел дальше

public class Task1 {
    private static final int size = 5; // constant 
    public static void main(String[] args) {  // создаение публичного меттода 
        int[][] matrix = new int[size][size]; // создаем 2 мерный массив 
 
        for (int i = 0; i < size; i++) {          //перебираем массиав 
            for (int j = 0; j < size; j++) {     //перебираем массиав 
                matrix[i][j] = new Random().nextInt(10);  //рандомим массив
            }
        }

        printArray(matrix); // выводим матрицу
        System.out.println("\n"); // отступ в консоли
        printSideDiagonal(matrix); // выводим диагональ по заданию
    }

    private static void printArray(int[][] arr){
        for (int i = 0; i < size; i++) {         // выводим массив чисел
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void printSideDiagonal(int[][] arr){
        for (int i = 0; i < size; i++) {    // выводим числа по диагонали
            for (int j = 0; j < size; j++) {
                if(size == (i + j + 1))
                    System.out.print(arr[i][j] + " ");
            }
        }
    }

}
// работу сделал Юхта Максим ПД-32