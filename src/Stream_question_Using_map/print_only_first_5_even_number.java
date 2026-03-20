package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class print_only_first_5_even_number {
    static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,39,38,24,19,34,8));
        List<Integer> result=list.stream().filter(n->(n&1)==0).limit(5).collect(Collectors.toList());
        System.out.println(result);
    }
}
