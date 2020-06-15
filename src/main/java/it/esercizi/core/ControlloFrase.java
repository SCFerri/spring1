package it.esercizi.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControlloFrase {
	
	public int countWord(String testo) {
		List<String> words = Arrays.asList(testo.split(""));
		return words.size();
		}
	
	public List<String> checkPalindromia(String testo) {
		
		List<String> words = Arrays.asList(testo.split(""));
		ArrayList<String> wordPalindrome = new ArrayList<String>();
		for (String word : words) {
			String[] array = word.split("");
			for (int i = 0; i < array.length/2; i++) {
				int x= array.length-i-1;
				if (array[i].equalsIgnoreCase(array[x]) ) {
					wordPalindrome.add(array[i]);
					}
				}
			} return wordPalindrome;
		}
	
	public int countWordPalindrome(String testo) {
		return checkPalindromia(testo).size();
	}
}
