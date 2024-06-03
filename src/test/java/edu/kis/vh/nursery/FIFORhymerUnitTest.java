package edu.kis.vh.nursery;
import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerUnitTest {

    @Test
    public void testCountOut() {
        FIFORhymer fifoRhymer = new FIFORhymer();
        int testValue = 0;

        fifoRhymer.countIn(testValue);
        Assert.assertEquals(testValue, fifoRhymer.countOut());
    }

    @Test
    public void testCountOutMultipleValues() {
        FIFORhymer rhymer = new FIFORhymer();
        int[] test = {1, 2, 3, 4};

        for (int value : test) {
            rhymer.countIn(value);
        }

        for (int value : test) {
            Assert.assertEquals(value, rhymer.countOut());
        }
    }

    @Test
    public void testCountOutWithEmpty() {
        FIFORhymer fifoRhymer = new FIFORhymer();

        Assert.assertEquals(-1, fifoRhymer.countOut());
    }
}