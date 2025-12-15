import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Testing {

    @Test
    public void testAddingIntInt() {
        Addition<Integer, Integer> addition = new Addition<>();
        assertEquals(25.0, addition.add(20, 5), 0.0);
    }

    @Test
    public void testAddingIntDouble() {
        Addition<Integer, Double> addition = new Addition<>();
        assertEquals(25.5, addition.add(20, 5.5), 0.0);
    }

    @Test
    public void testAddingIntLong() {
        Addition<Integer, Long> addition = new Addition<>();
        assertEquals(25.0, addition.add(20, 5L), 0.0);
    }

    @Test
    public void testAddingDoubleDouble() {
        Addition<Double, Double> addition = new Addition<>();
        assertEquals(25.5, addition.add(20.0, 5.5), 0.0);
    }

    @Test
    public void testAddingDoubleLong() {
        Addition<Double, Long> addition = new Addition<>();
        assertEquals(25.0, addition.add(20.0, 5L), 0.0);
    }

    @Test
    public void testAddingLongLong() {
        Addition<Long, Long> addition = new Addition<>();
        assertEquals(25.0, addition.add(20L, 5L), 0.0);
    }

    @Test
    public void testBubbleSortInteger() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        Integer[] array = new Integer[]{4, 2, 8, 4, 22, 0, 7, 3, 9, 10};
        Integer[] expected = new Integer[]{0, 2, 3, 4, 4, 7, 8, 9, 10, 22};
        bubbleSort.sortArray(array);
        assertArrayEquals(array, expected);
    }

    @Test
    public void testBubbleSortDouble() {
        BubbleSort<Double> bubbleSort = new BubbleSort<>();

        Double[] array = new Double[]{3.0, 5.0, 4.0, 1.0, 2.0};
        Double[] expected = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        bubbleSort.sortArray(array);
        assertArrayEquals(array, expected);
    }

    @Test
    public void testBubbleSortString() {
        BubbleSort<String> bubbleSort = new BubbleSort<>();

        String[] arrayS = new String[]{"b", "d", "c", "e", "a"};
        String[] expectedS = new String[]{"a", "b", "c", "d", "e"};
        bubbleSort.sortArray(arrayS);
        assertArrayEquals(arrayS, expectedS);

        String[] arrayL = new String[]{"cat", "bee", "bea", "dog", "car"};
        String[] expectedL = new String[]{"bea", "bee", "car", "cat", "dog"};
        bubbleSort.sortArray(arrayL);
        assertArrayEquals(arrayL, expectedL);
    }

    @Test
    public void testModifiedBubbleSortInteger() {
        ModifiedBubbleSort<Integer> mBubbleSort = new ModifiedBubbleSort<>();

        Integer[] array = new Integer[]{11, 105, 2, 116, 254};
        Integer[] expected = new Integer[]{2, 11, 105, 116, 254};
        mBubbleSort.sortArray(array);
        assertArrayEquals(array, expected);
    }

    @Test
    public void testModifiedBubbleSortDouble() {
        ModifiedBubbleSort<Double> mBubbleSort = new ModifiedBubbleSort<>();

        Double[] array = new Double[]{3.0, 5.0, 4.0, 1.0, 2.0};
        Double[] expected = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        mBubbleSort.sortArray(array);
        assertArrayEquals(array, expected);

        Double[] array2 = new Double[]{3.0000001, 3.00000001, 3.00000002, 1.0, 2.0};
        Double[] expected2 = new Double[]{1.0, 2.0, 3.00000001, 3.00000002, 3.0000001};
        mBubbleSort.sortArray(array2);
        assertArrayEquals(array2, expected2);

        Double[] array3 = new Double[]{0.025, 150.0, 40.0, 35000.0};
        Double[] expected3 = new Double[]{150.0, 0.025, 35000.0, 40.0};
        mBubbleSort.sortArray(array3);
        assertArrayEquals(array3, expected3);
    }

    @Test
    public void testModifiedBubbleSortString() {
        ModifiedBubbleSort<String> mBubbleSort = new ModifiedBubbleSort<>();

        String[] array = new String[]{"hi", "", "a", "true", "hat"};
        String[] expected = new String[]{"", "a", "hi", "hat", "true"};
        mBubbleSort.sortArray(array);
        assertArrayEquals(array, expected);
    }

    @Test
    public void testListSum() {
        SumListElements summing = new SumListElements();

        List<Byte> byteList = Arrays.asList(Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        List<Short> shortList = Arrays.asList(Short.MIN_VALUE, Short.MAX_VALUE, Short.MIN_VALUE, Short.MAX_VALUE);
        List<Integer> intList = Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        List<Long> longList = Arrays.asList(20L, -50L, 228L, 125L);
        List<Double> doubleList = Arrays.asList(2.5, -3.7, 5.5, 8.2);
        List<Float> floatList = Arrays.asList(3.8f, -2.8f, 2.2f, 8.1f);

        double expectedSumBSI = -2.0;

        assertEquals(expectedSumBSI, summing.sumElements(byteList), 0.0);
        assertEquals(expectedSumBSI, summing.sumElements(shortList), 0.0);
        assertEquals(expectedSumBSI, summing.sumElements(intList), 0.0);
        assertEquals(323L, summing.sumElements(longList), 0.0);
        assertEquals(12.5, summing.sumElements(doubleList), 0.0001);
        assertEquals(11.3f, summing.sumElements(floatList), 0.0001);
    }
}
