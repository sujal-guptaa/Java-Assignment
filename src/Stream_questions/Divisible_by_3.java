package Stream_questions;

import java.util.ArrayList;
import java.util.stream.*;
public class Divisible_by_3 {
    static void main() {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(15);
        values.add(35);
        values.add(5);
        values.add(9);
        values.add(12);
        values.add(18);
        values.stream().filter(n->(n%3==0 && n%5!=0)).forEach(System.out::println);

    }
}
