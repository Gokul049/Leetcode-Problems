package HashMap;
import java.util.*;
public class Intersection_of_Two_Arrays_II_350 {
	
	public static int[] intersect(int[] nums1, int[] nums2) 
	{
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!map.containsKey(nums1[i]))
            {
                map.put(nums1[i],1);
            }
            else
            {
                int freq = map.remove(nums1[i]);
                map.put(nums1[i],freq+1);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0)
            {
                list.add(nums2[i]);
                int freq = map.remove(nums2[i]);
                map.put(nums2[i], freq-1);
            }
        }
        int res[] = new int[list.size()];
        int k=0;
        for(int v: list)
        {
            res[k++]=v;
        }
        return res;

    }

	public static void main(String[] args) {
		
		int arr1[] = {1,2,2,1,3,3,4,5,3};
		int arr2[] = {2,2,3,5};
		
		for(int i=0;i<intersect(arr1, arr2).length;i++)
		{
			System.out.print(intersect(arr1, arr2)[i]+" ");
		}

	}

}
