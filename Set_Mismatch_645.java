package HashMap;
import java.util.*;
public class Set_Mismatch_645 {
	public static int[] findErrorNums(int[] nums) {
        int res[] = new int[2];
        Map<Integer, Integer> map= new HashMap<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.remove(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            if(e.getValue()==2)
                res[0] = e.getKey();
            
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int s: set)
        {
            sum = sum + s;
        }
        int n = nums.length;
        n = n * (n+1)/2;
        res[1] = n - sum;
        return res;
    }
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,4};
		for(int a: findErrorNums(arr))
		{
			System.out.print(a+" ");
		}
	}

}
