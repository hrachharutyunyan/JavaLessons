import java.util.Scanner;

public class StringElementsSum {
    public static void main(String[] args) {
        System.out.println("введите текст:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("сумма цифр: " + findSumOfText(text));
        System.out.println("максимальная цифра: " + findMaxNumberOfText(text));
    }

    static int findSumOfText(String text) {
        String temp = "";
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char textElement = text.charAt(i);
            if (Character.isDigit(textElement) && (textElement > 47 && textElement < 58)) {
                sum += Character.getNumericValue(textElement);
            } else {
                temp = "0";
            }
        }
        return sum;
    }

    static int findMaxNumberOfText(String text) {
        String temp = "";
        int max = 0;
        int tempNum = 0;
        for (int i = 0; i < text.length(); i++) {
            char textElement = text.charAt(i);
            if (Character.isDigit(textElement) && (textElement > 47 && textElement < 58)) {
                tempNum = Character.getNumericValue(textElement);
            } else {
                temp = "0";
            }
            if (tempNum > max) {
                max = tempNum;
            }
        }
        return max;
    }
}

