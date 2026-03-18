package Stream_question_Using_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_length {
    static void main(String[] args) {
        ArrayList<String> container=new ArrayList<>(Arrays.asList("sujal","sunny kumar","taru kumar poonia"));
        List<Integer> result=container.stream().map(String::length).collect(Collectors.toList());
        System.out.println(result);
    }
}
