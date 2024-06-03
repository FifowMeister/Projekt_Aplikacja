package edu.kis.vh.nursery;

/**
 * The FIFORhymer class extends the DefaultCountingOutRhymer to provide
 * a FIFO (First In, First Out) counting out mechanism.
 */

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Overrides the countOut method.
     * Values are counted out in the order they were counted in.
     *
     * @return The first value that was counted in.
     */

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
