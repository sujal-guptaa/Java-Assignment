package Stream_questions;

import java.util.stream.Stream;

public class using_stream_of {
    static void main(String[] args) {
        Stream<String> s= Stream.of("A","b","c");
        s.forEach(name->{
            System.out.println(name);
        });
    }
}
