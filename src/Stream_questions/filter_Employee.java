package Stream_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filter_Employee {
    static void main(String[] args) {
        ArrayList<Integer> salary=new ArrayList<>(Arrays.asList(100000,500000,40000,300000,4000,200000));
        salary.stream().filter(n->n>50000).forEach(System.out::println);

    }
}
