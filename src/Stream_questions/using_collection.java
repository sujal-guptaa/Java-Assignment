package Stream_questions;

import java.util.ArrayList;
import java.util.stream.Stream;

public class using_collection {
    static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add(20);
        a.add(10);
        a.add(30);
        a.add(40);
        a.add(50);
        Stream<Integer> strm=a.stream();
        strm.forEach(integer ->
                System.out.println(integer));

    }
}
