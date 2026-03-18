package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converting_upper_case {
    static void main(String[] args) {
        ArrayList<String> values=new ArrayList<>(Arrays.asList("sujal","sunny","tarun","shivam"));
        List<String> result=values.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
}
