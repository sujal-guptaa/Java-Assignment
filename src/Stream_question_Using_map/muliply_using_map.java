package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class muliply_using_map {
    static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> result=numbers.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(result);
    }
}
