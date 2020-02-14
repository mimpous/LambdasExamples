package com.ht.lampdas;

import java.util.Arrays;
import java.util.Comparator;

public class Example1 {

	public static void main(String[] args) {
		Example1 example = new Example1();
		example.test1();
		example.test2();
		example.test3();
		example.test4();
		example.test5();
	}
	Integer[] numbers = new Integer[]{1,4,6,2,9,33,6,32};
	
	private void test1() {
		
		Arrays.sort( numbers , new Comparator<Integer>() {

			@Override
			public int compare(Integer first, Integer second) { 
				return first.compareTo(second);
			}
		} );
		loop( );
		System.out.println("end of example 1");
	}
	
	private void test2() { 
		Arrays.sort( numbers , (Integer first, Integer second) -> { 
				return first.compareTo(second);
			 
		} );
		
		loop( );
		System.out.println("end of example 2");
	}
	
	private void test3() { 
		Arrays.sort( numbers , ( first,  second) -> { 
				return first.compareTo(second);
			 
		} );
		loop( );
		
		System.out.println("end of example 3");
	}

	private void test4() { 
		Arrays.sort( numbers , ( first,  second) -> { 
				return first.compareTo(second);
			 
		} );
		loop( );
	
		System.out.println("end of example 4");
	}
	
	private void test5() { 
		Arrays.sort( numbers , ( first,  second) ->  first.compareTo(second)  );
		loop( );
	
		System.out.println("end of example 5");
	}
	
	private void loop(   ) {
		for( Integer num : numbers) {
			System.out.println(num);
		}
		
	}
}
