import java.io.*;

//  инфо здесь: https://youtu.be/pV0v_3YRQoM
public class Draft9_Task2_3_9 {
//        System.out.println("Задание: \n9.\tВыведите в файл list.html список :\n" +
//                "<ul>\n" +
//                "<\tli> 1 element </li>\n" +
//                "<\tli> 2 element </li>\n" +
//                "<\tli> 100 element </li>\n" +
//                "</ul>\n\nРешение: ");

    //        Пример 2 ППППППППППППППППППППППППППППППППППП из интернет https://youtu.be/pV0v_3YRQoM
    public static void main(String[] args) throws IOException {
//            File file = new File("src\\" + "list" + ".html");
            /*String html = "<div><h1>This is test HTML</h1><p>This is a test paragraf for " +
                    "our html page</p></div";*/
            /*String html = "<div><h1>This is test HTML</h1><p>This is a test paragraf for " +
                    "our html page</p></div";*/
            /*String html = "This is test HTML<br>This is a test paragraph for " +
                    "our html page";*/
        /*String html = "Test row 1<br>Test row 2<br>";*/
        /*String html = "Test row 1" + "<br>" + "Test row 2";*/
            /*String html = "<ul>" + "<br>" +
                    "<li> 1 element </li>" + "<br>" +
                    "<li> 2 element </li>" + "<br>" +
                    "<li> 100 element </li>" + "<br>" +
                    "</ul>";*/
        File file = new File("src\\list.html");
        file.createNewFile();
        String xStr = null;
        for (int x = 1; x <= 100; x++) {
            xStr = String.valueOf(x);
            String html = "<ul><li>" + xStr + " element</li></ul>";

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                bw.write(html);
                bw.flush();

                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Шаг 1: файл создан по адресу: src\\list.html");
        System.out.println("Шаг 1: заданный список записан в файл lis.html");
    }

//        PrintWriter pw = new PrintWriter(file);
//        pw.println("Test row 1");
//
//        pw.println("Test row 2");
//        pw.close();


//        Конец Примера 2 КККККККККККККККК


//    //        Пример 1 ППППППППППППППППППППППППППППППППППП из Whole_Video из урока 2
//    public static void main(String[] args) {
//        System.out.println("Задание: \n2.\tСохраните миллион файлов. Получилось?\n\nРешение: ");
//
//            System.out.println("Сохранить миллион файлов нет возможности, т.к. не хватает объёма памяти IDE Intellij IDEA \n(во всяком случае в папках проекта). В дополнительных настройках IDE можно увеличить объем памяти, но нет уверенности, \nчто у проверяющего задание, аналогично будет настроено IDE. Как вариант, можно сохранить миллион файлов, \nсоздав директорию за пределами папок проекта. По умолчанию, код для решения этого задания такой: \n" +
//                    "```\n" +
//                    "int x = 1;\n" +
//                    "while (x =< 1000000) {\n" +
//                    "\tFile file = new File(\"files\\\\\" + \"File\" + x);\n" +
//                    "\tfile.createNewFile();\n" +
//                    "\tx = x + 1;\n" +
//                    "}\n" +
//                    "```");
//        }
//    //        Конец Примера 1 КККККККККККККККК
}
