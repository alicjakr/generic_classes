import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //just some examples, full cases tested in Testing class
        Addition<Integer, Double> additionID = new Addition<>();
        System.out.println(additionID.add(20, 5.5));

        Addition<Long, Long> additionLL = new Addition<>();
        System.out.println(additionLL.add(20L, 5L));

        BubbleSort<Integer> bubbleSortI = new BubbleSort<>();
        Integer[] arrayI = new Integer[]{4, 2, 8, 4, 22, 0, 7, 3, 9, 10};
        bubbleSortI.sortArray(arrayI);
        System.out.println(Arrays.toString(arrayI));

        BubbleSort<Double> bubbleSortD = new BubbleSort<>();
        Double[] arrayD = new Double[]{3.0, 5.0, 4.0, 1.0, 2.0};
        bubbleSortD.sortArray(arrayD);
        System.out.println(Arrays.toString(arrayD));

        BubbleSort<String> bubbleSortS = new BubbleSort<>();
        String[] arrayS = new String[]{"b", "d", "c", "e", "a"};
        bubbleSortS.sortArray(arrayS);
        System.out.println(Arrays.toString(arrayS));

        ModifiedBubbleSort<Integer> mBubbleSortI = new ModifiedBubbleSort<>();
        Integer[] arrayIM = new Integer[]{11, 105, 2, 116, 254};
        mBubbleSortI.sortArray(arrayIM);
        System.out.println(Arrays.toString(arrayIM));

        ModifiedBubbleSort<Double> mBubbleSortD = new ModifiedBubbleSort<>();
        Double[] arrayDM = new Double[]{0.025, 150.0, 40.0, 35000.0};
        mBubbleSortD.sortArray(arrayDM);
        System.out.println(Arrays.toString(arrayDM));


        ModifiedBubbleSort<String> mBubbleSortS = new ModifiedBubbleSort<>();
        String[] arraySM = new String[]{"hi", "", "a", "true", "hat"};
        mBubbleSortS.sortArray(arraySM);
        System.out.println(Arrays.toString(arraySM));

        SumListElements summing = new SumListElements();
        List<Double> doubleList = Arrays.asList(2.5, -3.7, 5.5, 8.2);
        System.out.println(summing.sumElements(doubleList));
    }
}
