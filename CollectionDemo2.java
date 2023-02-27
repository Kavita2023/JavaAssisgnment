package com.cg.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {

	public static int getMaxNumber(List<Integer> l1) {
		// get maximum number from the list
		return Collections.max(l1);
	}

	public static List<Integer> getReversedList(List<Integer> l1) {
		// reverse the list and return
		List<Integer> reversedList = new ArrayList<>(l1);
		Collections.reverse(reversedList);
		return reversedList;
	}

	public static List<Integer> getOrderedList(List<Integer> l1) {
		// return the ordered list [ascending order]
		List<Integer> orderedList = new ArrayList<>(l1);
		Collections.sort(orderedList);
		return orderedList;
	}

	public static List<Integer> getExactMidNumber(List<Integer> l1) {
		// return the mid number after sorting
		List<Integer> sortedList = new ArrayList<>(l1);
		Collections.sort(sortedList);
		List<Integer> midNumbers = new ArrayList<>();
		int size = sortedList.size();
		if (size % 2 == 0) {
			midNumbers.add(sortedList.get(size / 2 - 1));
			midNumbers.add(sortedList.get(size / 2));
			return Collections.singletonList(Collections.max(midNumbers));
		} else {
			return Collections.singletonList(sortedList.get(size / 2));
		}
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(145);
		list1.add(202);
		list1.add(32);
		list1.add(48);
		list1.add(598);

		System.out.println(getMaxNumber(list1)); // expected output: 598
		System.out.println(getReversedList(list1)); // expected output: [598, 48, 32, 202, 145]
		System.out.println(getOrderedList(list1)); // expected output: [32, 48, 145, 202, 598]
		System.out.println(getExactMidNumber(list1)); // expected output: [145]
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(14);
		list2.add(54);
		list2.add(76);
		list2.add(234);
		list2.add(123);

		System.out.println(getMaxNumber(list2)); // expected output: 234
		System.out.println(getReversedList(list2)); // expected output: [123, 234, 76, 54, 14, 10]
		System.out.println(getOrderedList(list2)); // expected output: [10, 14, 54, 76, 123, 234]
		System.out.println(getExactMidNumber(list2)); // expected output: [76]
	}
}
