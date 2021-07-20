import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_217 {
}
//超时做法：双重循环遍历——时间复杂度太差
//class Solution217 {
//    public boolean containsDuplicate(int[] nums) {
//        for(int i = 0; i < nums.length; i++){
//            for (int j = 0; j < i; j++) {
//                if(nums[j] == nums[i])
//                    return true;
//            }
//        }
//        return false;
//    }
//}

//哈希表法，有重复的就会冲突，返回0
//class Solution217 {
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for(int x:nums){
//            if(!set.add(x))
//                return true;
//        }
//        return false;
//    }
//}

//先排序，再判断相邻两个数字是否相等（用sort也太无赖了）
//class Solution217 {
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == nums[i+1]) {
//                return true;
//            }
//        }
//        return false;
//    }
//}