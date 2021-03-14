package com.sky.week1;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public int[] towSum(int[] nums, int target){
        Map<Integer,Object> map = new HashMap<Integer,Object>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{(int) map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
