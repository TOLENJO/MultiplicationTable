package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start, end) ? generateSingleExpression(start, end) : null;
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
        StringBuilder output = new StringBuilder();
        for ( int index = start; index < end + 1; index ++) {
            output.append(generateLine(start, index)).append(System.lineSeparator());
        }
        return output.toString().trim();
    }

    public String generateLine(int start, int row) {
        StringBuilder output = new StringBuilder();
        for ( int index = start; index < row + 1; index ++) {
            output.append(generateSingleExpression(index, row)).append("  ");
        }
        return output.toString().trim();
    }
    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + (multiplicand*multiplier);
    }
}
