package b_Dzien_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Testing {
    public static void main(String[] args) {
        Task1Interface checkMe = param -> (param >= 0 && param <= 100);
        System.out.println("20: " + checkMe.check(20));
        System.out.println("-1: " + checkMe.check(-1));
        System.out.println("101: " + checkMe.check(101));
        System.out.println("100: " + checkMe.check(100));

        System.out.println("* TASK 2 *");

        Predicate<String> moreThan4 = elem -> elem.length() > 4;
        Predicate<String> hasSmallB = elem -> elem.contains("b");
        Predicate<String> lastIsA = elem -> ("" + elem.toCharArray()[elem.length() - 1]).equals("a");

        List<String> sampleList = Arrays.asList("Tama", "Tamaryszek", "Zaporami", "Barbarossa");

        System.out.println("* Length > 4 *");
        List<String> out;
        out = filterList(sampleList, moreThan4);
        out.forEach(System.out::println);

        System.out.println("* Has small b *");

        out = filterList(sampleList, hasSmallB);
        out.forEach(System.out::println);

        System.out.println("* Last is a *");
        out = filterList(sampleList, lastIsA);
        out.forEach(System.out::println);

        System.out.println("* * * * * * * * *");
    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> outputList = new ArrayList<>();
        for (String elem : list) {
            if (predicate.test(elem)) {
                outputList.add(elem);
            }
        }
        return outputList;
    }
}
