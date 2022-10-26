package src.com.collegework.labfive;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// All of this could be done better probably
public class ArrayPractice {
    /* sets every item in A[] to initialValue */
    public static void initialize(int[] A, int initialValue) {
        for (int i = 0; i < A.length; i++) {
            A[i] = initialValue;
        }
    }

    /* returns the average of the items in A
     * Be careful: A[] is an array of int and the method returns
     * double. What do we do to handle this?
     */
    public static double average(int[] A) {
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        return (double) sum / A.length;
    }

    /* returns the number of times that x appears in A[] */
    public static int numOccurrences(int[] A, int x) {
        int occurrences = 0;
        for (int j : A) {
            if (j == x) {
                occurrences++;
            }
        }
        return occurrences;
    }


    /* returns the index of the first occurrence of
     * x in A[] or -1 if x doesn't exist in A[] */
    public static int find(int[] A, int x) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /* Returns the index of the first occurrence of
     * item within the first n elements of A[] or -1
     * if item is not among the first n elements of A[] */
    public static int findN(int[] A, int item, int n) {
        if (n > A.length) return -1;

        for (int i = 0; i < n; i++) {
            if (A[i] == item) {
                return i;
            }
        }
        return -1;
    }


    /* returns the index of the last occurrence of
     * x in A[] or -1 if x doesn't exist in A[] */
    public static int findLast(int[] A, int x) {
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /* returns the largest item found in A */
    public static int largest(int[] A) {
        if (A.length == 0) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        for (int num : A) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    /* returns the index of the largest item found in A */
    public static int indexOfLargest(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int largest = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    /* returns the index of the largest odd number
     * in A[] or -1 if A[] contains no odd numbers */
    public static int indexOfLargestOdd(int[] A) {
        if (A.length == 0) {
            return -1;
        }

        int item = 0;
        int z = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > item) {
                if (A[i] % 2 != 0) {
                    item = A[i];
                    z = i;
                } else {
                    return -1;
                }
            }
        }
        return z;
    }
    /* inserts n into A[] at A[index] shifting all */
    /*  the previous items one place to the right. For example */
    /*  if A is  */
    /*   |---+---+---+---+---+---+---+---+---+---| */
    /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
    /*   |---+---+---+---+---+---+---+---+---+---| */
    /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
    /*   |---+---+---+---+---+---+---+---+---+---| */

    /*   and we call insert(A, 15, 1), A then becomes */

    /*   |---+----+---+---+---+---+---+---+---+---| */
    /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
    /*   |---+----+---+---+---+---+---+---+---+---| */
    /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
    /*   |---+----+---+---+---+---+---+---+---+---| */
    /*  the element in A[] that's in the right-most */
    /*    position is removed.                      */
    /*                                              */
    /*  if index < 0 or index >= A.length-1, the method */
    /*                                    does nothing */
    public static void insert(int[] A, int n, int index) {
        if (index < 0 || index >= A.length - 1) return;

        int temp = A[index];
        A[index] = n;

        for (int i = index + 1; i < A.length - 1; i++) {
            int temp2 = A[i];
            A[i] = temp;
            temp = temp2;
        }
    }

    /* returns a new array consisting of all of the
     * elements of A[] */
    public static int[] copy(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        return B;
    }

    /* Returns a new array consisting of all of the
       first n elements of A[]. If n>A.length, returns a
       new array of size n, with the first A.length elements
       exactly the same as A, and the remaining n-A.length elements
       set to 0. If n<=0, returns null. */
    public static int[] copyN(int[] A, int n) {
        if (n <= 0) return null;

        int[] B = new int[n];

        for (int i = 0; i < B.length && i < A.length; i++) {
            System.out.println(Arrays.toString(B));
            System.out.println(i);
            B[i] = A[i];
        }

        return B;
    }

    /* returns a new array consisting of all of the
     * elements of A[] followed by all of the
     * elements of B[]. For example, if
     A[] is: {10,20,30} and
     B[] is: {5, 9, 38}, the method returns the
     array : {10,20,30,5,9,38} */
    public static int[] copyAll(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        return C;
    }

    /* reverses the order of the elements in A[].
     * For example, if A[] is:
     {10,20,30,40,50}, after the method, A[] would
     be {50,40,30,20,10} */
    // cool way to swap
    /*
    A[left] = A[left]^A[right]
    A[right] = A[left]^A[right]
    A[left] = A[left]^A[right]
     */
    public static void reverse(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }
    }

    /* Extra credit:
     *
     * Returns a new array consisting of all of the
     * elements of A, but with no duplicates. For example,
     * if A[] is {10,20,5,32,5,10,9,32,8}, the method returns
     * the array {10,20,5,32,9,8} */
    public static int[] uniques(int[] A) {
        // easy way
        // hashset doesn't allow duplicates
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int n : A) {
            if (!hashSet.contains(n)) {
                arrayList.add(n);
                hashSet.add(n);
            }
        }

        //this is streams, something new and pretty cool since java-8
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
