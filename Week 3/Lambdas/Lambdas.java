import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class Lambdas {
    static int n;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Consumer<Integer> consume = (Integer value) -> {
            n = value;
        };
        Supplier<Integer> supply = () -> {
            return n;
        };
        Runnable positiveIntegerUntil = () -> {
            consume.accept(Integer.valueOf(scan.nextInt()));
            int count = 0;
            while(supply.get() > count)
            {
                count++;
                System.out.println(count);
            }
        };
        positiveIntegerUntil.run();
        scan.close();
    }
}
