import java.util.stream.IntStream;

public class Draft_Task1_3_3_3 {
    public static void main(String[] args) {
        System.out.println("Задание: \n3.  Что такое область видимости переменной? Что происходит с переменной, " +
                "после того, как начал выполняться код вне ее области видимости?\n\nРешение: ");
        System.out.println("Область видимости переменной — это фрагмент кода, в пределах которого " +
                "\nможно объявить и использовать переменную, данный фрагмент в начале и в конце " +
                "\nограничивается фигурными скобками  (следует оговорить, что в некоторых случаях " +
                "\nобъявить переменную можно и за пределами  данного фрагмента, т.е. выше по тексту " +
                "\nкода , перед открывающей фигурной скобкой , если это происходит в пределах более " +
                "\n\"старшей\", в иерархическом смысле, области видимости, т.е. \"охватывающей\" " +
                "\nданную область видимости, в пределах которой данный фрагмент (класс, метод, " +
                "\nцикл,  ветка) находится.  Переменная исчезает после завершения работы этого " +
                "\nметода, цикла или ветки, т.е. за пределами данной области видимости. Т.е. за " +
                "\nпределами области видимости у переменной отсутствует имя и отсутствует значение.  " +
                "\nЗа пределами области может быть объявлена другая переменная, с таким же именем,  " +
                "\nи с таким же, или другим значением, но функционально, для компиллятора, это будет " +
                "\nдругая переменная.");


    }
}