package programming;

import java.util.List;
import java.util.stream.LongStream;

public class FP06Parallelizing {
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();

		//0, 1000000000 869
		//System.out.println(LongStream.range(0,1000000000).sum());//499999999500000000
		
		//601
		System.out.println(LongStream.range(0,1000000000).parallel().sum());
		System.out.println(System.currentTimeMillis() - time);
		
		
//		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15); // 16
//		numbers.stream()
//			.parallel().reduce(0, Integer::sum);
	}

}
