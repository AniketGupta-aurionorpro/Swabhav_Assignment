package Question_1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Question_1_Stream {
	public static void main(String[] args) {
		ArrayList<Integer> nums1 = new ArrayList<>();
		for (int i = 0; i <=20; i++) {
			nums1.add(i);
		}
		List<Integer> nums2 = nums1.stream().filter(n->(n%2==0)).collect(Collectors.toList());
		nums2.forEach(System.out::println);		
	}
}
