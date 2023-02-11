import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Set<Integer> intListNew = new TreeSet<>();
        for (Integer x : intList) {
           if (x>0 && x % 2 == 0){
               intListNew.add(x);
           }
        }
        System.out.println(intListNew);
    }
}
