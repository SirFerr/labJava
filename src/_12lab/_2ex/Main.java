package _12lab._2ex;

//2. Дан текст, необходимо проверить есть ли в тексте цифры, за которыми не стоит знак «+».
//        – пример правильных выражений: (1 + 8) – 9 / 4.
//        – пример неправильных выражений: 6 / 5 – 2 * 9 .
public class Main {
    public static void main(String[] args) {
        String regex=".*([0-9]+[ ]*[+]).*";
        System.out.println("(1 + 8) - 9 / 4".matches(regex));
        System.out.println("6 / 5 - 2 * 9".matches(regex));
    }
}
