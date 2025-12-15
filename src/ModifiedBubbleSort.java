class ModifiedBubbleSort<T extends Comparable<T>> {
    private int compare(T obj1, T obj2) {
        //String - total number of characters
        if(obj1 instanceof String str1 && obj2 instanceof String str2) {
            return Integer.compare(str1.length(), str2.length());
        } else if (obj1 instanceof Integer int1 && obj2 instanceof Integer int2) {
            //Integer - total number of non-zero digits
            int obj1count = countNonZeroDigits(int1);
            int obj2count = countNonZeroDigits(int2);
            return Integer.compare(obj1count, obj2count);
        } else if (obj1 instanceof Double d1 && obj2 instanceof Double d2) {
            //Double significand of number - ex. for 1.02 x 10^5, 1.02 is the significand
            Double sig1 = getSignificand(d1);
            Double sig2 = getSignificand(d2);
            return sig1.compareTo(sig2);
        }
        return 0;
    }

    //helper method for Integer comparison
    private int countNonZeroDigits(Integer num) {
        num = Math.abs(num);
        int count = 0;
        while(num != 0) {
            if(num % 10 != 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    //helper method for Double comparison
    private double getSignificand(Double num) {
        if(num == 0) return 0;
        num = Math.abs(num);
        while(num >= 10.0) {
            num /= 10;
        }
        while(num < 1.0) {
            num *= 10;
        }
        return num;
    }

    void sortArray(T[] array) {
        boolean swapped;
        for(int i = 0; i < array.length - 1; i++) {
            swapped=false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (compare(array[j], array[j+1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
