import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10,51,4,7,21,20);
        List<Integer>evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers
        );
    }
}
