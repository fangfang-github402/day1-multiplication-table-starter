package com.tw;

import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.genMultiplicationTable(start, end);

        System.out.println(multiplicationTable);
    }

    public String genMultiplicationTable(int startNumber,int endNumber) {
        if(!checkNumber(startNumber,endNumber))
            return null;
        int[] numbers = genNumbersArray(startNumber,endNumber);
        return printMultiplicationTable(numbers);
    }

    public boolean isStartNotBiggerThanEnd(int startNumber,int endNumber){
        return startNumber <= endNumber;
    }

    public boolean isInRange(int number){
        return number >=1 && number <= 1000;
    }

    public boolean checkNumber(int startNumber,int endNumber){
        if(!isStartNotBiggerThanEnd(startNumber,endNumber))
            return false;
        if (!isInRange(startNumber))
            return false;
        if (!isInRange(endNumber))
            return false;
        return true;
    }

    public int[] genNumbersArray(int startNumber,int endNumber){
        return IntStream.rangeClosed(startNumber, endNumber).toArray();
    }

    public String genMultiplicaitonResult(int number1,int number2){
        return number1 + "*" + number2 + "=" + number1 * number2;
    }

    public String genConjunction(int number1,int number2){
        if(number1 != number2)
            return " ";
        else return "\n";
    }

    public String printMultiplicationTable(int[] numbers){
        StringBuilder table = new StringBuilder();
        IntStream.range(0, numbers.length)
                .forEach(i -> IntStream.range(0, i+1)
                        .mapToObj(j -> genMultiplicaitonResult(numbers[j], numbers[i]) + (j < numbers.length ? genConjunction(numbers[i], numbers[j]):""))
                        .forEach(table::append));
        return table.toString();
    }
}
