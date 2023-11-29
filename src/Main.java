import java.util.Arrays;

public class Main {
    /**
     * Takes an array and sorts it in an ascending order. Note that the method is void, so it should
     * sort the input, rather than return a sorted copy.
     *
     * @param arr - the array that needs to be sorted.
     */
    public void sort(int[] arr) {

        int[] arrLeft = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arrRight = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        System.out.println(Arrays.toString(arrLeft));
        System.out.println(Arrays.toString(arrRight));
        if (arr.length != 1) {
            sort(arrLeft);
            sort(arrRight);
        }


        merge(arr, arrLeft, arrRight);
    }

    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }}