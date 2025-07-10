package Question_1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_2_CaseInsensitive {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>(Arrays.asList("Hello","World","Java","I","Love","Java"));
        long distinctCount = str.stream()
            .map(String::toLowerCase)
            .distinct()
            .count();

        System.out.println("Distinct words (case-insensitive): " + distinctCount);
    }
}
