package com.dtcc.exams.part1;

public class DelTechConcatenator {

    Integer value;

    public DelTechConcatenator(){
        this(null);
    }
    public DelTechConcatenator(Integer val){
        this.value = val;
    }

    public boolean isDel(){
        return (value % 3 ==0);
    }

    public boolean isTech(){
        return (value % 5 ==0);
    }

    public boolean isDelTech(){
        return (value % 15 ==0);
    }
}
