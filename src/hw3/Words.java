package hw3;

import java.util.*;

public class Words {

	public static void main(String ... args) {
		String [] words = {"а в моём дворе весёлом собралась элитка ", "бабок", "тёток", "мужиков", "мужиков","бабок", "бомжих","бомжей", "бомжей", "бомжей", "бомжей", "ментов", "ментов"};
		Set<String> distinctWords = new HashSet<>(Arrays.asList(words));
		System.out.println(distinctWords);
		System.out.println(numberOfTimes(words));
	}
	
	public static Map<String, Long> numberOfTimes(String ... args) {
		Map<String, Long> numberOfTimesMap= new HashMap<>();

		List<String> words = Arrays.asList(args);
		Set<String> distinctWords = new HashSet<>(words);
		for(String S: distinctWords) {
			numberOfTimesMap.put(S, (long)Collections.frequency(words, S));
		}

		return numberOfTimesMap;
	}

}
