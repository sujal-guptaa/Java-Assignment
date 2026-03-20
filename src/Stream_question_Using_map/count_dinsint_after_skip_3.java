package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_dinsint_after_skip_3 {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,30,30,30,40,50,50,60));
        List<Integer> result=list.stream().skip(3).distinct().toList();
        System.out.println(result);
    }
}
