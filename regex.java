package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(", \\s");
        String[] fields = pattern.split("11 + 532");
        String amount = "";
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }


    }
}


