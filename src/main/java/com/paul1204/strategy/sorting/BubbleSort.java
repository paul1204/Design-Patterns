package com.paul1204.strategy.sorting;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sortMethod(int[] nums) {
        System.out.println("Before Bubble Sort");
        for(int i =0; i < nums.length; i++){

            System.out.print(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j< nums.length-1; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("\n");
for(int i =0; i < nums.length; i++){
    System.out.print(nums[i]);
}
        System.out.print("\n After Bubble Sort");
    }


}
