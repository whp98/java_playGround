package array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Integer[] myarray_integer = new Integer[]{22, 25, 28, 31, 34};
        System.out.println(Arrays.asList(myarray_integer).contains(34));
        int[] myarray_int = new int[]{22, 25, 28, 31, 34};
        System.out.println(Arrays.asList(myarray_int).contains(34));
    }
}
