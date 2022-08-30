package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start<=end;
    }

    public String generateTable(int start, int end) {
        String output = "";
        for ( int i = start; i < end + 1; i ++) {

            output += generateLine(start, i) + System.lineSeparator();
        }
        return output.trim();
    }

    public String generateLine(int start, int row) {
        String output = "";
        for ( int i = start; i < row + 1; i ++) {
            output += generateSingleExpression(i, row) + "  ";
        }
        return output.trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + (multiplicand*multiplier);
    }
}
