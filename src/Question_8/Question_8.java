package Question_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question_8 {
	 public static void main(String[] args) {
	        List<List<String>> nested = new ArrayList<>();
	        nested.add(List.of("apple", "", "Banana"));
	        nested.add(List.of("zebra", "cat", "Apple"));
	        nested.add(List.of("", "dog"));

	        List<String> result = nested.stream()
	            .flatMap(list -> list.stream())
	            .filter(s -> (s!=null) && (!s.isBlank()))
	            .sorted(String.CASE_INSENSITIVE_ORDER)
	            .collect(Collectors.toList());

	        System.out.println(result);
	    }
}
