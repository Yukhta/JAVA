package lab_4;

import java.util.stream.Collectors; //импорт библиотек
import java.util.stream.Stream;

public class TaskThree {

    private static final char START_RANGE = 'h'; //constant
    private static final char END_RANGE = 't';   //constant

    public static void main(String[] args) { //создаем публичный метод
        String str = "sjdhgfsjkavchjwagehf"; // инициализируем переменную

        String resultStr  = Stream.of(str.split("")).map(item -> { //с помощью map указываем ключ значения "item", 
            if (item.charAt(0) >= START_RANGE && item.charAt(0) <= END_RANGE) {   //проходим по буквам 
                return item.toUpperCase();  //возвращаем некоторые в верхнем регистре
            }
            return item;
        }).collect(Collectors.joining()); //создаем коллекцию

        System.out.println(str);
        System.out.println(resultStr);
    }

}