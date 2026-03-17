package Stream_questions;

import java.util.*;
import java.util.stream.*;
public class first {
    static void main(String[] args) {
        List names=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            String name=sc.next();
            names.add(name);
        }
        names.add(5);
        System.out.println(names);
    }
}
