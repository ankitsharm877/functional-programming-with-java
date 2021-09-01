package programming;

import java.util.List;

public class FP02Exercises {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		// sum of square of numbers
		Integer sum = numbers.stream().map(n -> n * n).reduce(0, Integer::sum);
		System.out.println(sum);

		// sum of cube of numbers
		Integer cube = numbers.stream().map(n -> n * n * n).reduce(0, Integer::sum);
		System.out.println(cube);

		// sum of odd numbers
		Integer sumOfOdd = numbers.stream().filter(n -> n % 2 != 0).reduce(0, Integer::sum);
		System.out.println(sumOfOdd);
		
	}
}
