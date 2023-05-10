package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ERROR = -1;
    public static final int NUMBERS_MAX_INDEX = 11;
    public static final int NUMBERS_MAX_SIZE = 12;
    public static final int STACK_EMPTY = -1;

    private final int[] NUMBERS = new int[NUMBERS_MAX_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_EMPTY;
    }

    public boolean isFull() {
        return total == NUMBERS_MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return NUMBERS[total--];
    }

}
