package Stream_questions;

import java.util.*;
import java.util.stream.Stream;

public class filter_func {
    static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(10);
        values.add(30);
        values.add(50);
        values.add(990);
        values.add(11);
        values.stream().filter(n->n>15).forEach(System.out::println);
    }
}
