package com.twschool.practice;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class GuessNumberTest {

    Answer answer = new Answer();
    String num = "1234";

    @Test
    public void should_return_4_A_0_B_given_1234() {
        //given
        String inputs = "1234";
        //when
        String result = answer.compare(inputs,num);
        //then
        assertThat(result,is("4A0B"));
    }

    @Test
    public void should_return_0_A_4_B_given_4321() {
        //given
        String inputs = "4321";
        //when
        String result = answer.compare(inputs,num);
        //then
        assertThat(result,is("0A4B"));
    }

    @Test
    public void should_return_0_A_0_B_given_5678() {
        //given
        String inputs = "5678";
        //when
        String result = answer.compare(inputs,num);
        //then
        assertThat(result,is("0A0B"));
    }

    @Test
    public void should_return_1_A_2_B_given_2436() {
        //given
        String inputs = "2436";
        //when
        String result = answer.compare(inputs,num);
        //then
        assertThat(result,is("1A2B"));
    }
    @Test
    public void should_return_0_A_1_B_given_2789() {
        //given
        String inputs = "2789";
        //when
        String result = answer.compare(inputs,num);
        //then
        assertThat(result,is("0A1B"));
    }

    @Test
    public void should_return_1_A_0_B_given_1789() {
        //given
        String inputs = "1789";
        //when
        String result = answer.compare(inputs,num);
        //then
        assertThat(result,is("1A0B"));
    }
}
