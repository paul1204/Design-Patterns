package com.paul1204.strategy.sorting;

import javax.swing.plaf.ButtonUI;

public class Main {


    public static void main(String[] args) {
        SortingContext sort = new SortingContext();
//        SortingStrategy b = new BubbleSort();
//        int[] array = {5, 4, 3,2, 1};
//        b.sortMethod(array);
        SortingStrategy bubble = new BubbleSort();
        sort.setStrategy(bubble);
        sort.executeSort(new int[]{5,4,3,2,1});

        SortingStrategy insertion = new InsertionSort();
        sort.setStrategy(insertion);
        sort.executeSort(new int[]{5,4,3,2,1});






    }
}
