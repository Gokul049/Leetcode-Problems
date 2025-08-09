package HashMap;
import java.util.*;
public class Two_Sum_01 {
	
	public static  int[] twoSum(int[] nums, int target) 
	{
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for(int i=1;i<nums.length;i++)
        {
            int total = target - nums[i];
            if(map.containsKey(total))
            {
                return new int[]{map.get(total), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
	public static void main(String[] args)
	{
		int arr[] = {2, 7, 11, 15};
		int target = 9;
		int solve_arr[] = twoSum(arr, target);
		for(int i=0;i<solve_arr.length;i++)
		{
			System.out.print(solve_arr[i]+" ");
		}
	}
}
