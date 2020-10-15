package com.dtcc.exams.part7;

public class FindTheWinner {

    private String winner;

    public FindTheWinner(){
        this.winner = null;
    }

    public void setWinner(String val){
        this.winner = val;
    }
    public String getWinner(){
        return this.winner;
    }

    public String winner(Integer[]zan, Integer[] brian, String input){
        int zScore=0;
        int bScore=0;
        for(int i = 0; i < brian.length;i++){
            if(i%2 ==0 && input.equals("Even")){
                zScore += zan[i]-brian[i];
                bScore += brian[i]-zan[i];
            }else if(i%2 !=0 && input.equals("Odd")){
                zScore += Integer.valueOf(zan[i]-brian[i]);
                bScore += brian[i]-zan[i];
                System.out.println(zScore);
            }
        }
        String winn = (zScore > bScore)?"Zan" : "Brian";
        this.setWinner(winn);
        return this.getWinner();
    }
}
