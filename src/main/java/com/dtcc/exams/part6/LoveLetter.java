package com.dtcc.exams.part6;

public class LoveLetter {

    public Integer[] mystery(String[] input){
        int l = input.length;
        Integer[] result = new Integer[input.length];

        //Cycle through each input item
        for(int i = 0; i < l; i++){
            String s = input[i];
            int count = 0;

            // Track from beginning and end;
            int j = 0;
            int k = s.length() - 1;

            //Go until we hit center
            while(j < k){
                count += Math.abs(s.charAt(j) - s.charAt(k));
                j++;
                k--;
            }
            result[i] = count;
        }
        return result;
    }
}
