package com.dtcc.exams.part3;

public enum RockPaperScissors {
    ROCK, PAPER, SCISSORS;

    RockPaperScissors(){}

    public RockPaperScissors getWinningSign(){
        if(this.equals(ROCK)){
            return PAPER;
        }else if(this.equals(PAPER)){
            return SCISSORS;
        }else{
            return ROCK;
        }
    }

    public RockPaperScissors getLosingSign(){
        if(this.equals(ROCK)){
            return SCISSORS;
        }else if(this.equals(PAPER)){
            return ROCK;
        }else{
            return PAPER;
        }
    }
}
