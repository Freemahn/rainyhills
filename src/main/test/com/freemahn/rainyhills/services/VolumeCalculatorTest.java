package com.freemahn.rainyhills.services;

import beans.VolumeCalculation;
import beans.VolumeCalculationBean;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeCalculatorTest
{

    private VolumeCalculation volumeCalculationBean = new VolumeCalculationBean();


    @Test
    public void whenEmpty()
    {
        int expected = 0;
        int[] input = {};
        assertEquals(expected, volumeCalculationBean.calculateVolume(input));
    }


    @Test
    public void whenOneElement()
    {
        int expected = 0;
        int[] input = {2};
        assertEquals(expected, volumeCalculationBean.calculateVolume(input));
    }


    @Test
    public void whenLinearASC()
    {
        int expected = 0;
        int[] input = {1, 2, 3, 4};
        assertEquals(expected, volumeCalculationBean.calculateVolume(input));
    }


    @Test
    public void whenLinearDESC()
    {
        int expected = 0;
        int[] input = {10, 5, 4, 3, 2, 1};
        assertEquals(expected, volumeCalculationBean.calculateVolume(input));
    }


    @Test
    public void whenOnePitShort()
    {
        int expected = 1;
        int[] input = {3,2,4};
        assertEquals(expected, volumeCalculationBean.calculateVolume(input));
    }
    @Test
    public void whenOnePit()
    {
        int expected = 16;
        int[] input = {5, 3, 3, 3, 3, 3, 3, 3, 3, 5};
        assertEquals(expected, volumeCalculationBean.calculateVolume(input));
    }


    @Test
    public void whenManyPits()
    {
        int expected = 13;
        int[] input = {5, 4, 3, 4, 3, 4, 5, 6, 2, 4, 7};
        assertEquals(expected, volumeCalculationBean.calculateVolume(input));
    }

}