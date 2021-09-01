package programming;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class FP05CreatingStream {

	public static void main(String[] args) {
		
		// Using List, Set and Map
		List.of(12, 9, 13, 4, 6, 2, 4, 12, 15).stream();
		Set.of(12, 9, 13, 4, 6, 2, 15).stream();
		Map.of(12, 9, 13, 4, 6, 2, 4, 12).values().stream();
		Map.of(12, 9, 13, 4, 6, 2, 4, 12).keySet().stream();
		Map.of(12, 9, 13, 4, 6, 2, 4, 12).entrySet().stream();
		
		// Using Stream class
		Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).forEach(System.out::println);
		Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count();
		Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum);
		
		//Primitive Type Stream
		IntStream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).min();
		LongStream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).distinct();
		DoubleStream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).sum();
		
		//Using Arrays
		int[] arrays = {12, 9, 13, 4, 6, 2, 4, 12, 15};
		Arrays.stream(arrays);
		Arrays.stream(arrays).sum();
		Arrays.stream(arrays).average();
		Arrays.stream(arrays).max();
		
		
		//Based on some range
		IntStream.range(1, 10).sum();
		IntStream.rangeClosed(1, 10).sum();
		//first 10 odd no
		IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum();
		//first 10 even no 
		IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum();
		//first 10 square of 2
		IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum();
		
		//create list
		IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList());
		
		//create big number > than Integer.MAX_VALUE
		IntStream.range(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
	}
}
