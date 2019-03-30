package hw.third.mergealgorithm;

import java.util.Arrays;

public class MergeArrays {

    static int[] merge(int[] firstArray, int[] secondArray) {
        int indexOfFirstArr = 0;
        int indexOfSecondArr = 0;
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < mergedArray.length; i++) {
            if (indexOfFirstArr > firstArray.length - 1){
                mergedArray[i] = secondArray[indexOfSecondArr];
                indexOfSecondArr++;
            }else if (indexOfSecondArr > secondArray.length - 1){
                mergedArray[i] = firstArray[indexOfFirstArr];
                indexOfFirstArr++;
            }else if (firstArray[indexOfFirstArr] < secondArray[indexOfSecondArr]) {
                mergedArray[i] = firstArray[indexOfFirstArr];
                indexOfFirstArr++;
            } else {
                mergedArray[i] = secondArray[indexOfSecondArr];
                indexOfSecondArr++;
            }
        }
        return mergedArray;
    }

    public static void main(String[] args) {

        int[] arrayFirst = {0, 2, 2};
        int[] arraySecond = {1, 3};
        int[] resultArray = merge(arrayFirst, arraySecond);
        System.out.println(Arrays.toString(resultArray));

    }

}
