import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by robotz on 16-12-30.
 */
public class LockerProblem {

    public static void main(String args[]) {

        ArrayList<Long> LockerNum = new ArrayList(100);

        for (Long i = 0L; i < 100L; i++) {
            LockerNum.add(i + 1L);
        }

        Function<Long, Long> getProcessNum = num ->
               LockerNum.stream().filter(item -> (num.intValue() % item.intValue() == 0)).count();

        System.out.print(LockerNum.stream().map(getProcessNum).map(item -> item%2).collect(Collectors.toList()));

    }
}
