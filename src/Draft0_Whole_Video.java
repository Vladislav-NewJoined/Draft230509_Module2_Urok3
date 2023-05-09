import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// Задание здесь: https://lms.synergy.ru/learning/view/68555/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видео здесь: https://lms.synergy.ru/learning/view/68493/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

public class Draft0_Whole_Video {
//    //        Пример 4 ППППППППППППППППППППППППППППППППППП  Фото NASA за месяц, видео мин 37.07
//    public static void main(String[] args) {
//
//    } //        Конец Примера 4 КККККККККККККККК






//    //        Пример 3 ППППППППППППППППППППППППППППППППППП Вложенный цикл, в видео мин 26.33
//    public static void main(String[] args) {
//
//    } //        Конец Примера 3 КККККККККККККККК







//    //        Пример 2 ППППППППППППППППППППППППППППППППППП Курс за месяц
//    // Просто за месяц: видео мин 11.55
//    // Вывести курсы за все числа месяца, когда вводят месяц и год, видео мин 23.22
//    public static void main(String[] args) throws IOException {
//        //        Курс за месяц: В видео мин 5.10
//        //        Если if (startIndex1 != - 1) { (если стартИндекс1 не равно -1), то тогда уже пойдёмте дальше: В видео мин 21.12
//        for (int day = 1; day <= 31; day = day + 1) {
//            String dayStr = day < 10 ? "0" + day : String.valueOf(day);
//            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/12/2014&date_req2=" + dayStr + "/12/2014&VAL_NM_RQ=R01235";
//            String page1 = downloadWebPage(url);
//            int startIndex1 = page1.lastIndexOf("<Value>");
//            if (startIndex1 != -1) {
//                int endIndex1 = page1.lastIndexOf("</Value>");
//                String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
//                System.out.println(dayStr + "/12/2014: " + courseStr1);
//            }
//        }
//    }
//
//    private static String downloadWebPage(String url) throws IOException {
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
//    } //        Конец Примера 2 КККККККККККККККК







//    //        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        for(int x=0; x<100; x = x + 1) {
//            System.out.println(x);
//        }
//    } //        Конец Примера 1 КККККККККККККККК


}
