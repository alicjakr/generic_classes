import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Testing {
    @Test
    public void testAddingIntInt() {
        Addition addition=new Addition();
        Integer a=20;
        Integer b=5;
        Double res=25.0;
        Double c=addition.add(a, b);
        assertEquals(res, c);
    }

    @Test
    public void testAddingIntDouble() {
        Addition addition=new Addition();
        Integer a=20;
        Double b=5.5;
        Double res=25.5;
        Double c=addition.add(a, b);
        assertEquals(res, c);
    }

    @Test
    public void testAddingIntLong() {
        Addition addition=new Addition();
        Integer a=20;
        Long b=5L;
        Double res=25.0;
        Double c=addition.add(a, b);
        assertEquals(res, c);
    }

    @Test
    public void testAddingDoubleDouble() {
        Addition addition=new Addition();
        Double a=20.0;
        Double b=5.5;
        Double res=25.5;
        Double c=addition.add(a, b);
        assertEquals(res, c);
    }

    @Test
    public void testAddingDoubleLong() {
        Addition addition=new Addition();
        Double a=20.0;
        Long b=5L;
        Double res=25.0;
        Double c=addition.add(a, b);
        assertEquals(res, c);
    }

    @Test
    public void testAddingLongLong() {
        Addition addition=new Addition();
        Long a=20L;
        Long b=5L;
        Double res=25.0;
        Double c=addition.add(a, b);
        assertEquals(res, c);
    }

    @Test
    public void testBubbleSortInteger() {
        Integer[] array = new Integer[]{4, 2, 8, 4, 22, 0, 7, 3, 9, 10};
        Integer[] sortedArray = new Integer[]{0, 2, 3, 4, 4, 7, 8, 9, 10, 22};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sortArray(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(array, sortedArray);
    }

    @Test
    public void testBubbleSortDouble() {
        Double[] array = new Double[]{3.0, 5.0, 4.0, 1.0, 2.0};
        Double[] sortedArray = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        bubbleSort.sortArray(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(array, sortedArray);
    }

    @Test
    public void testBubbleSortString() {
        String[] arrayS = new String[]{"b", "d", "c", "e", "a"};
        String[] sortedArrayS = new String[]{"a", "b", "c", "d", "e"};
        BubbleSort<String> bubbleSortS=new BubbleSort<>();
        bubbleSortS.sortArray(arrayS);
        System.out.println(Arrays.toString(arrayS));
        assertArrayEquals(arrayS, sortedArrayS);

        String[] arrayL = new String[]{"cat", "bee", "bea", "dog", "car"};
        String[] sortedArrayL = new String[]{"bea", "bee", "car", "cat", "dog"};
        BubbleSort<String> bubbleSortL=new BubbleSort<>();
        bubbleSortL.sortArray(arrayL);
        System.out.println(Arrays.toString(arrayL));
        assertArrayEquals(arrayL, sortedArrayL);
    }

    @Test
    public void testModifiedBubbleSortInteger() {
        Integer[] array = new Integer[]{11, 105, 2, 116, 254};
        Integer[] sortedArray = new Integer[]{2, 11, 105, 116, 254};
        ModifiedBubbleSort<Integer> mBubbleSort = new ModifiedBubbleSort<>();
        mBubbleSort.sortArray(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(array, sortedArray);
    }

    @Test
    public void testModifiedBubbleSortDouble() {
        Double[] array = new Double[]{3.0, 5.0, 4.0, 1.0, 2.0};
        Double[] sortedArray = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        ModifiedBubbleSort<Double> mBubbleSort = new ModifiedBubbleSort<>();
        mBubbleSort.sortArray(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(array, sortedArray);

        Double[] array2 = new Double[]{3.0000001, 3.00000001, 3.00000002, 1.0, 2.0};
        Double[] sortedArray2 = new Double[]{1.0, 2.0, 3.00000001, 3.00000002, 3.0000001};
        mBubbleSort.sortArray(array2);
        System.out.println(Arrays.toString(array2));
        assertArrayEquals(array2, sortedArray2);

        Double[] array3 = new Double[]{0.025, 150.0, 40.0, 35000.0};
        Double[] sortedArray3 = new Double[]{150.0, 0.025, 35000.0, 40.0};
        mBubbleSort.sortArray(array3);
        System.out.println(Arrays.toString(array3));
        assertArrayEquals(array3, sortedArray3);
    }

    @Test
    public void testModifiedBubbleSortString() {
        String[] array=new String[]{"hi", "", "a", "true", "hat"};
        String[] sortedArray=new String[]{"", "a", "hi", "hat", "true"};
        ModifiedBubbleSort<String> mBubbleSort=new ModifiedBubbleSort<>();
        mBubbleSort.sortArray(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(array, sortedArray);
    }

    @Test
    public void testListSum() {
        List<Byte> byteList = Arrays.asList(Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        List<Short> shortList = Arrays.asList(Short.MIN_VALUE, Short.MAX_VALUE, Short.MIN_VALUE, Short.MAX_VALUE);
        List<Integer> intList = Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        List<Long> longList = Arrays.asList(20L, -50L, 228L, 125L);
        List<Double> doubleList = Arrays.asList(2.5, -3.7, 5.5, 8.2);
        List<Float> floatList = Arrays.asList(3.8f, -2.8f, 2.2f, 8.1f);
        SumListElements summing = new SumListElements();
        double byteSum=summing.sumElements(byteList);
        double shortSum=summing.sumElements(shortList);
        double intSum=summing.sumElements(intList);
        double longSum=summing.sumElements(longList);
        double doubleSum=summing.sumElements(doubleList);
        double floatSum=summing.sumElements(floatList);
        double expectedSum=-2.0;
        assertEquals(expectedSum, byteSum, 0.0);
        assertEquals(expectedSum, shortSum, 0.0);
        assertEquals(expectedSum, intSum, 0.0);
        assertEquals(383L, longSum, 0.0);
        assertEquals(12.5, doubleSum, 0.0);
        assertEquals(11.3f, floatSum, 0.0);
    }
}
