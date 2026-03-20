package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_distinct_element {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,10,20,30,30,40,90,30));
        List<Integer> result=list.stream().distinct().toList();
        System.out.println(result);
    }
}
