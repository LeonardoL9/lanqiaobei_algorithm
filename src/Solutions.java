import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "");
        String[] split = input.split(",");
        int[] nums=new int[split.length];
        for(int i=0;i<split.length;i++){
            nums[i]=Integer.parseInt(split[i]);
        }

        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));


    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
