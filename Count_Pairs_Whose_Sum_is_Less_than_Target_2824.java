package ArrayList;
import java.util.*;
public class Count_Pairs_Whose_Sum_is_Less_than_Target_2824 {
	public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(i!=j)
                {
                    if((nums.get(i) + nums.get(j)) < target)
                        count++;
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); // 6,2,5,-2,-7,-1,3
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(-2);
		list.add(-7);
		list.add(-1);
		list.add(3);
		System.out.println(countPairs(list, 2));
		
		
		
	}

}
