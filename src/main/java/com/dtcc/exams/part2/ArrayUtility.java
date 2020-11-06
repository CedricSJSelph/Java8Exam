package com.dtcc.exams.part2;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayUtility<E>{

    private Object[] arr;
    private Integer length;

    // constructor
    public <E> ArrayUtility(E[] array){
        // Creates a new Object array of specified length
        arr = array;
        length = array.length;
    }

    public Object[] getArr() {
        return arr;
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate){
        Integer count = 0;
        E[] result = (E[]) new Object[this.length+ arrayToMerge.length];
        System.arraycopy(this.arr, 0, result,0, this.arr.length);
        System.arraycopy(arrayToMerge,0,result, this.arr.length, arrayToMerge.length);

        System.out.println(Arrays.toString(result));
        for(int i =0; i < result.length; i++){
            if(result[i] == valueToEvaluate){
                count +=1;
            }
        }

        return count;
    }
    public E getMostCommonFromMerge(E[] arrayToMerge, E valueToEvaluate){
        E[] result = (E[]) new Object[this.length+ arrayToMerge.length];
        System.arraycopy(this.arr, 0, result,0, this.arr.length);
        System.arraycopy(arrayToMerge,0,result, this.arr.length, arrayToMerge.length);
        Map<E, Integer> map = new TreeMap<>();
        for(E val:result){
            Integer count = map.get(val);
            map.put(val, count != null ? count+1 : 1);
        }
        return valueToEvaluate;
    }

    public Integer getNumberOfOccurrences(E value){
        Integer count = 0;
        E[] temp = (E[]) new Object[this.length];
        System.arraycopy(this.arr, 0, temp,0, this.arr.length);
        for(E val:temp){
            if(val==value){
                count+=1;
            }
        }
        return count;
    }

    public E[] removeValue(E valueToRemove){
        E[] testing = (E[]) new Object[this.length];
        System.arraycopy(this.arr, 0, testing,0, this.arr.length);

        int index = 0;
        for (int i=0; i<testing.length; i++) {
            if (testing[i] != valueToRemove) {
                testing[index++] = testing[i];
            }
        }
        return Arrays.copyOf(testing, index);
    }
}
