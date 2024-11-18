package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.genMultiplicationTable(start, end);

        System.out.println(multiplicationTable);
    }

    public String genMultiplicationTable(int startNumber,int endNumber) {
        return "";
    }

    public boolean isStartNotBiggerThanEnd(int startNumber,int endNumber){
        return startNumber <= endNumber;
    }

    public boolean isInRange(int number){
        return number >=1 && number <= 1000;
    }
}
