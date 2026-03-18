package Stream_question_Using_map;

import java.util.*;
import java.util.stream.*;

public class Capitalizing_String {
    public static void main(String[] args) {
        ArrayList<String> container = new ArrayList<>(
                Arrays.asList("sujal", "sunny kumar", "tarun kumar poonia"));

        List<String> result = container.stream()
                .map(sentence -> Arrays.stream(sentence.split(" "))
                        .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                        .collect(Collectors.joining(" "))
                )
                .collect(Collectors.toList());

        System.out.println(result);
    }
}