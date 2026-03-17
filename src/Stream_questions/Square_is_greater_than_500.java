package Stream_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Square_is_greater_than_500 {
    static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(10,2,3,50,9,80));
        numbers.stream().filter(n->n*n>500).forEach(System.out::println);
    }
}
