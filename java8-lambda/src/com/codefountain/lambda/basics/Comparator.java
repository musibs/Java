package com.codefountain.lambda.basics;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
	
	public int compare(T p1, T p2);
	
	public static <U> Comparator<U> comparing(Function<U, Comparable> function){
		return (p1,p2) -> function.apply(p1).compareTo(function.apply(p2));
	}
	
	public default Comparator<T> thenComparing(Comparator<T> comparator){
		return (p1,p2) -> compare(p1, p2) == 0 ? comparator.compare(p1, p2) : compare(p1, p2);
	}

}
