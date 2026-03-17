package Stream_questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class usin_Array {
    static void main(String[] args) {
        int[] arr={12,10,23,45};
        IntStream strm= Arrays.stream(arr);
        strm.forEach(name->{
            System.out.println(name);
        });
    }
}
