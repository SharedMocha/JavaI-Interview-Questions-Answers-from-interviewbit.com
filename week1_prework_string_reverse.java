/*
Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
*/
public class Solution {
	public String reverseWords(String a) {
	    StringBuffer strb = new StringBuffer();
	    
	      String[] words = a.split(" ");

	    for(int i = words.length - 1; i >= 0 ; i--){
	        strb.append(words[i]+" ");
	    }
	    	return strb.toString();

	}
}
