package b_Dzien_2.mains;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@SuppressWarnings("unused")
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Welcome to task 5");
    }

    public static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        List<T> output = new ArrayList<>();
        for (T t : collection) {
            if (predicate.test(t)) {
                output.add(t);
            }
        }
        return output;
    }

    public static <T, S> List<S> changeCollection(Collection<T> collection, Function<T, S> function) {
        List<S> output = new ArrayList<>();
        collection.stream().map(function).forEach(output::add);
        return output;
    }

    public static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {
        collection.forEach(consumer);
    }
}
