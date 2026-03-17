package Stream_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class contains_e {
    static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>(Arrays.asList("bee","suney","sujal"));
        name.stream().filter(n->n.contains("e")).forEach(System.out::println);
    }
}
