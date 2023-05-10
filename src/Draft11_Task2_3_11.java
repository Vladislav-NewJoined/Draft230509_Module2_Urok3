import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// Курс валют скачивается отсюда, API Центробанка: https://cbr.ru/scripts/XML_dynamic.asp?date_req1=31/03/2023&date_req2=31/03/2023&VAL_NM_RQ=R01235
public class Draft11_Task2_3_11 {

    //        Пример 3 ППППППППППППППППППППППППППППППППППП УДАЛСЯ!!!!!!!!!!!!!!!!!! подставляем из видеоурока, с мин 16.28
    public static void main(String[] args) throws IOException {
     System.out.println("Задание: \n11.\tВыведите курс валют за 1 февраля каждого года с 1994 до текущего года\n\nРешение: ");
        for (int year = 1994; year <= 2023; year = year + 1) {
//            String dayStr = year < 10 ? "0" + year : String.valueOf(year);
//            if (day < 10) {
//                String dayStr = "0" + day;
//            } else {
//                String dayStr = String.valueOf(day);
//            }

            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/02/1994&date_req2=01/02/" + year + "&VAL_NM_RQ=R01235";
//            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=02/02/2018&date_req2=02/02/2018&VAL_NM_RQ=R01235";
            String page1 = downloadWebPage(url);
            if (page1.contains("<Value>")) {
                int startIndex1 = page1.lastIndexOf("<Value>");
                int endIndex1 = page1.lastIndexOf("</Value>");
                String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
                System.out.println("01/02/" + year + ": " + courseStr1);
            } else {
                System.out.println("01/02/" + year + ": ");
            }
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
//        Конец Примера 3 КККККККККККККККК








//    //        Пример 2 ППППППППППППППППППППППППППППППППППП
//    // Что дальше делать, см. видео мин 16.28
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.\tВыведите курс валют за 1 февраля каждого года с 1994 до текущего года\n\nРешение: ");
//        for (int year = 1994; year <=1999; year++) {
//            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/02/1994&date_req2=01/02/" + year + "&VAL_NM_RQ=R01235";
//
//        }
//
//    }
//
//        private static String downloadWebPage (String url) throws IOException {
//            StringBuilder result = new StringBuilder();
//            String line;
//            URLConnection urlConnection = new URL(url).openConnection();
//            try (InputStream is = urlConnection.getInputStream();
//                 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//                while ((line = br.readLine()) != null) {
//                    result.append(line);
//                }
//            }
//            return result.toString();
//        }
//
////        Конец Примера 2 КККККККККККККККК







//    //        Пример 1 ППППППППППППППППППППППППППППППППППП из видеоурока, с мин 16.28
//    public static void main(String[] args) throws IOException {
//        for (int day = 1; day <=30; day = day + 1) {
//            String dayStr = day < 10 ? "0" + day : String.valueOf(day);
////            if (day < 10) {
////                String dayStr = "0" + day;
////            } else {
////                String dayStr = String.valueOf(day);
////            }
//
//            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2014&date_req2=" + dayStr + "/11/2014&VAL_NM_RQ=R01235";
//            String page1 = downloadWebPage(url);
//            int startIndex1 = page1.lastIndexOf("<Value>");
//            int endIndex1 = page1.lastIndexOf("</Value>");
//            String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
//            System.out.println(dayStr + "/11/2014: " + courseStr1);
//        }
//    }
//
//    private static String downloadWebPage (String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
////        Конец Примера 1 КККККККККККККККК


}
