package com.dtcc.exams.assessment.part7;
import com.dtcc.exams.part7.FindTheWinner;
import org.junit.Assert;
import org.junit.Test;

public class FindTheWinnerTest {

    @Test
    public void winnerTest1(){
        Integer[] zan = {1,2,3};
        Integer[] brian = {2,1,3};
        String input = "Even";
        FindTheWinner findTheWinner = new FindTheWinner();
        String expected = "Brian";
        String actual = findTheWinner.winner(zan, brian, input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void winnerTest2(){
        Integer[] zan = {1,2,3};
        Integer[] brain = {2,1,3};
        String input = "Odd";
        FindTheWinner findTheWinner = new FindTheWinner();
        String expected = "Zan";
        String actual = findTheWinner.winner(zan, brain, input);
        Assert.assertEquals(expected, actual);
    }

}
