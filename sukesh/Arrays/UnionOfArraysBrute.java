import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArraysBrute {

    static int[] unionArray(int[] array1, int[] array2) {
        Set<Integer> st = new HashSet<>();
        int n1 = array1.length;
        int n2 = array2.length;

        for (int i = 0; i < n1; i++) {
            st.add(array1[i]);
        }

        for (int i = 0; i < n2; i++) {
            st.add(array2[i]);
        }

        int[] union = new int[st.size()];

        int i = 0;

        for (Integer num : st) {
            union[i++] = num;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6 };

        System.out.println("Union: " + Arrays.toString(unionArray(arr1, arr2)));
    }
}