package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Skip_first_two_number_print_3 {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,30,40,50,60,90));
        list.stream().skip(2).limit(3).forEach(System.out::println);
    }
}
