package org.shiva.problems;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class Leetcode {
	
	@Test
	public void runner() {
		
		int[] arr = {11,7,2,45,15,6,36,63,82};
		
		
//		System.out.println(Arrays.toString(twoSum(arr,9)));
//		System.out.println(Arrays.toString(twoSumwithOn(arr,9)));
//		System.out.println(Arrays.toString(twoSumsMap(arr,9)));
		
		System.out.println(secondlargestnlogn(arr));
		System.out.println(secondlargestn2(arr));
		System.out.println(secondlargestn(arr));
		
		
		System.out.println(largestnumberinarray(arr));
		
	}
	
	
	/*
	 * 	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

		You may assume that each input would have exactly one solution, and you may not use the same element twice.

		You can return the answer in any order.
		Example 1:
		
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		Example 2:
		
		Input: nums = [3,2,4], target = 6
		Output: [1,2]
		Example 3:
		
		Input: nums = [3,3], target = 6
		Output: [0,1]

	 */
	//Order of O(n2)
	public int[] twoSum(int[] num, int target) {
		
		
		
		int[] indices = new int[2];
		
		for(int i=0;i<num.length; i++) {
			
			for(int j=i+1; j<num.length; j++) {
				
				if(num[i]+num[j]==target) {
					
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
		

		return indices;
	}
	
	//order of O(n) - will not work
	
	public int[] twoSumwithOn(int [] num,int target) {
		
		int left = 0;
		int right = num.length-1;
		int tempsum;
		
		while(left<right) {
			
			tempsum = num[left] + num[right];
			if(tempsum==target) {
				return new int[] {left,right};
			}
			if(tempsum>target)
				left++;
			else
				right--;
		}
		
		
		return new int[] {-1,-1};
		
	}
	
	//O(n) - working logic
	//Input: nums = [2,7,11,15], target = 9
	
	public int[] twoSumsMap(int[] num, int target) {
		
		HashMap<Integer,Integer> imap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<num.length;i++) {
			
			if(imap.containsKey(target-num[i])) {
				return new int[] {imap.get(target-num[i]),i};
			}else {
				imap.put(num[i], i);
			}
		}
		
		
		return new int[] {-1,-1};
	}
	
	
	//finding the second largest number in the array
	
	//O(nlogn)
	
	public int secondlargestnlogn(int[] num) {
		
		Arrays.sort(num);
		
			
		return num[num.length-2];
	}
	
	//O(n2)
	
	public int secondlargestn2(int[] num) {
		
		int largest=0,secondlargest=0;
		
		for(int i=0;i<num.length;i++) {
			
			largest = Math.max(largest, num[i]);
		}
		
		for (int i=0;i<num.length;i++) {
			
			if(num[i]!=largest) {
				secondlargest = Math.max(secondlargest, num[i]);
			}
		}
		
		
		return secondlargest;
	}
	
	
	//O(n)
	
	public int secondlargestn(int[] num) {
		
		int first=0,second=0;
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>first) {
				second=first;
				first=num[i];
			}
			
			else if(num[i]>second && num[i]!=first) {
				second=num[i];
			}
		}
		
		
		return second;
	}
	
	
	// find the largest number in array
	// O(n) 
	
	
	public int largestnumberinarray(int[] num) {
		int largest=0;
		
		for (int i=0;i<num.length;i++) {
			
			largest = Math.max(largest, num[i]);
		}
		
		return largest;
	}
	
	

}


