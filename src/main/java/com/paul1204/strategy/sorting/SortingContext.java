package com.paul1204.strategy.sorting;

public class SortingContext {
    SortingStrategy strategy;

    public SortingContext(){

    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSort(int[] nums){
        strategy.sortMethod(nums);
    }

}
