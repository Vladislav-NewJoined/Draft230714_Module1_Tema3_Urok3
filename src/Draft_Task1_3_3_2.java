import java.util.stream.IntStream;

public class Draft_Task1_3_3_2 {
    public static void main(String[] args) {
        System.out.println("Задание: \n2.  Напишите программу из одной строчки, в которой переменная x " +
                "объявляется 10 раз\n\nРешение: ");

        IntStream.range(0, 10).mapToObj(i -> "int x = " + i).forEach(System.out::println); }}