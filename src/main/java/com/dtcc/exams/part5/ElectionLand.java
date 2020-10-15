package com.dtcc.exams.part5;

import java.util.Map;
import java.util.TreeMap;

public class ElectionLand {

    public static Map<String, Integer> tally;
    //Use tree for alphabetical sorting
    public ElectionLand(){
        tally = new TreeMap<>();
    }

    public String electionWinner(String[] votes){
        String winner = null;
        int tempCount = 0;

        //Counts up votes for each
        for(String temp:votes){
            if(tally.containsKey(temp)){
                tally.replace(temp, tally.get(temp) + 1);
            }else{
                tally.put(temp, 1);
            }
        }

        //Get last with most
        for(Map.Entry m: tally.entrySet()) {
            if ((int)m.getValue() >= tempCount) {
                tempCount = (int)m.getValue();
                winner = (String)m.getKey();
            }
        }
        return winner;
    }
}
