package lab_4;

import java.util.Arrays;
import java.util.List;                            // импорт библиотек
import java.util.stream.Collectors;
import java.util.stream.Stream; 

public class TaskOne {

    public static void main(String[] args) {  //создание публичного метода
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1"); // создаём список указаных элементов

        Stream<String> myStream = myList.stream() //преобразовываем список в поток
                .map((item) -> { // с помощью map указываем ключ значения "item"
                    return item.toUpperCase(); // преобразовываем все данные в item в верхний регистр
                })
                .sorted((a, b) -> { // сортировка потока
                    return a.charAt(0) == b.charAt(0) && a.charAt(1) > b.charAt(1) ? 1 : -1;
                });

        myList = myStream.collect(Collectors.toList());// преобразуем в коллекцию
        printListStrings(myList);
    }

    private static void printListStrings(List<String> list) {//создание приватного метода
        for (String item : list) {
            System.out.print(item + ", ");//вывод
        }
        System.out.println();
    }

}