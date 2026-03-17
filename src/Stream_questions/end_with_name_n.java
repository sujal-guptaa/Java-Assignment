package Stream_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class end_with_name_n {
    static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("sujal","tarun","sunnyn"));
        names.stream().filter(name->name.endsWith("n")).forEach(System.out::println);
    }
}
