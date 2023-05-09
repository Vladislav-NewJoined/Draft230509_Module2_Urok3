import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Draft11_Task2_3_11 {

    // Курс валют скачивается отсюда, API Центробанка: https://cbr.ru/scripts/XML_dynamic.asp?date_req1=31/03/2023&date_req2=31/03/2023&VAL_NM_RQ=R01235

    //        Пример _ ППППППППППППППППППППППППППППППППППП
    // Что дальше делать, см. видео мин 16.28
    public static void main(String[] args) {
        System.out.println("Задание: \n11.\tВыведите курс валют за 1 февраля каждого года с 1994 до текущего года\n\nРешение: ");
        for (int year = 1994; year <=1999; year++) {
            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/02/1994&date_req2=01/02/" + year + "&VAL_NM_RQ=R01235";

        }

    }

        private static String downloadWebPage (String url) throws IOException {
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

//        Конец Примера _ КККККККККККККККК







}
