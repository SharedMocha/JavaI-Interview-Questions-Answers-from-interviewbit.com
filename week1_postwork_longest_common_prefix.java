/*
Write a function to find the longest common prefix string amongst an array of strings.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.

Example:

Given the array as:

[

  "abcdefgh",

  "aefghijk",

  "abcefgh"
]
The answer would be “a”.
*/
public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
	    String smallestWord = "";
	    int length = 0;
	    StringBuffer buffer = new StringBuffer();
	    String ans = "";
	    //find smallet word
	    for(int i=0 ; i<a.size();i++){
	        if(i == 0){
	           length = a.get(0).length();
	           smallestWord = a.get(0);
	        }else{
	            if(length < a.get(i).length()){
	                smallestWord = a.get(i);
	                //length = a[0].length(); 
	            }
	        }
	    }
	    //iterate to find repeating letters by going index by index--2 loops to rotate again on array and again on each word to find letter
	    char[] smallestWordCharArray = smallestWord.toCharArray();
	    //Loop again on entire array
	    for(int j=0 ; j<a.size();j++){
	    char[] tempCharArray = a.get(j).toCharArray();
	         //loop on each word now
	         for (int k = 0 ; k<= tempCharArray.length-1; k++) {
	             //check if we have the letter in string buffer
	             if(tempCharArray[k] == smallestWordCharArray[k]){
	                 //char temp = tempCharArray[k];
	                 if(buffer.toString().contains(String.valueOf(tempCharArray[k]))){
	                     //do nothing
	                    
	                     	               	             }else{
	                 buffer.append(tempCharArray[k]);

	             }
	                 
	             }

  }
	        
	    }
	    
	    return buffer.toString();
	}
}
