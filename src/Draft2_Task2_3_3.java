// Видеоурок здесь: https://lms.synergy.ru/learning/view/68493
// Задание здесь: https://lms.synergy.ru/lntools/mcresource/view/67098/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Draft2_Task2_3_3 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tВыведите буквы от а до я (подсказка: for (char letter=’a’; letter ’я’; letter++) )\n\nРешение: ");

        /*инфо с примером решения здесь: https://www.cyberforum.ru/java-j2se/thread423856.html*/

        for(char letter = 'а';letter<='ю';letter++) {
            System.out.print(letter + ", ");
        }

        for(char letter = 'я';letter =='я';letter++) {
            System.out.print(letter + " ");
        }

        System.out.println();
    }
//        Конец Примера _ КККККККККККККККК









//    //        Пример _ ППППППППППППППППППППППППППППППППППП УДАЛСЯ!!!!!!!!!!!!!!!!!! только с латинским алфавитом
//    public static void main(String[] args) {
//        System.out.println("Задание: \n3.\tВыведите буквы от а до я (подсказка: for (char letter=’a’; letter ’я’; letter++) )\n\nРешение: ");
//
//        for(char i = 'a';i<='y';i++)
//        {
//            System.out.print(i + ", ");
//        }
//
//        for(char i = 'z';i =='z';i++)
//        {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//    }
////        Конец Примера _ КККККККККККККККК








////        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//
//
//
//        for(char letter='a'; letter<24; ++letter)
//        {
//            cout<<char('a'++);
//        }
//    }
////        Конец Примера 2 КККККККККККККККК









////        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//
//
//
//        for(char a='a'; a < 'a' + 24; ++a)
//        {
//            cout << a;
//        }
//
//    }
////        Конец Примера 2 КККККККККККККККК







////        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
////        char[] alphabet = new char[0];
//        char[] alphabet = new char[0];
//        for (char c = 'a'; c <= 'z'; c++) {
//
//            /*alphabet[c - 'a'] = c;*/
//            alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//
//        }
//        System.out.println(alphabet);
//    }
////        Конец Примера 1 КККККККККККККККК





}