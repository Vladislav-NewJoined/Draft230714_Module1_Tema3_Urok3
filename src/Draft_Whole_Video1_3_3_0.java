import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Draft_Whole_Video1_3_3_0 {
    public static void main(String[] args) throws IOException {
        //  закончил видео мин 38 04

        //  видео мин 05 50 - Переменная temp внутри цикла исчезает 20 раз
        //  видео мин 12 18 - Попробуем попереключаться между двумя потоками
        //  видео мин 12 31 - Про вложенные методы и в них объявление переменных
        //  видео мин 25 23 - Напишем медиабраузер
        //  видео мин 33 49 - Утилита по скачиванию веб страницы
        //  видео мин 34 51 - Нам интересно поле kind

        String url = "https://itunes.apple.com/search?term=war+of+worlds&limit=1";
        String page = downLoadWebPage(url);
//        System.out.println(page);
        int start = page.indexOf("kind");
        int end = page.indexOf("collectionId");
        System.out.println(page.substring(start + 7, end - 4));
    }

    static String downLoadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}