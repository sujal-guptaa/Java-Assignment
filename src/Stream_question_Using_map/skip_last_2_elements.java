package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class skip_last_2_elements {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        List<Integer> result=list.stream().limit(list.size()-2).toList();
        System.out.println(result);
    }
}
