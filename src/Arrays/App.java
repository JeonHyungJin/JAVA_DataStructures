package Arrays;

import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[5];
		int[] nums2 = new int[10];

		for (int i = 1; i < nums.length; i++) {
			nums[i] = 2 * i;
		}

		// O(1) random index
		int num = nums[0];
		System.out.println(num);

		// O(n) "Linear Search" --> O(logN) : Binary trees --> O(1) : hashtables

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				System.out.println("index found, " + i);
			}
		}
		// nums[5] = 10;

		List<String> list = new java.util.ArrayList<>();

		list.add("Adex");
		list.add("Jax");
		list.add("Kevin");

		System.out.println("---------------------");
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println("---------------------");

		Object[] array = list.toArray();

		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("---------------------");

		for (Object s : array) {
			System.out.println(s);
		}
	}

}
