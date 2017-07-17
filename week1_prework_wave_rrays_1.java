/*
Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
 NOTE : If there are multiple answers possible, retur
 */
 public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    Collections.sort(a);
	    Iterator it=a.iterator();


     for (int i=1; i < a.size(); i = i+2) {
         if( a.get(i) % 2 == 0){
          Collections.swap(a, i, i-1);
         }else{

         }
         
}
	 

	return a;
}
}
