package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class print_element_greater_then_50 {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(70,90,80,50,43,30));
        List<Integer> result=list.stream().filter(n->n>50).toList();
        System.out.println(result);
    }
}
