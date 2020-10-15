package com.dtcc.exams.assessment.part3;

import com.dtcc.exams.part3.RockPaperScissors;
import org.junit.Assert;
import org.junit.Test;

public class PaperEvaluatorTest implements EvaluatorTestInterface {
    @Test
    public void evaluateWinnerTest() {
        RockPaperScissors input = RockPaperScissors.ROCK;
        RockPaperScissors expected = RockPaperScissors.PAPER;

        RockPaperScissors actual = input.getWinningSign();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluateLoserTest() {
        RockPaperScissors input = RockPaperScissors.ROCK;
        RockPaperScissors expected = RockPaperScissors.SCISSORS;

        RockPaperScissors actual = input.getLosingSign();

        Assert.assertEquals(expected, actual);
    }
}
