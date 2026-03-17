package Stream_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Valid_emails {
    static void main(String[] args) {
        ArrayList<String> mails=new ArrayList<>(Arrays.asList("Sujal@8255","Sunny@.225","tarun@.220"));
        mails.stream().filter(name->name.contains("@")&&name.contains(".")).forEach(System.out::println);
    }
}
