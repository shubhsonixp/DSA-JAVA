/*
Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 

Follow up: Could you solve the problem in linear time and in O(1) space?
*/
import java.util.*;;
public class problem44 {
    public static void main(String[] args){
        int[] nums={3,2,3};
        int n=nums.length;
        int k=n/3;
        List<Integer> aist = new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>k){
                aist.add(nums[i]);
            }
            Set<Integer> set = new HashSet<>(aist);
            aist.clear();
            aist.addAll(set);
        }
        System.out.println(aist);
    }
}
