package b_Dzien_2.mains;

import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function<String, String> sampleText = input -> {
            if (input.length() < 5) return input;
            StringBuilder output = new StringBuilder();
            char[] chars = input.toCharArray();
            for (int i = 2; i < (chars.length - 2); i++) {
                output.append(chars[i]);
            }

            return output.toString().toLowerCase();
        };

        System.out.println("CODERSLAB -> " + sampleText.apply("CODERSLAB"));
    }
}
