import java.util.ArrayList;
import java.util.List;

public class UnionOfArraysOptimal {
    static List<Integer> unionArray(int[] array1, int[] array2) {
        ArrayList<Integer> union = new ArrayList<>();
        int n1 = array1.length;
        int n2 = array2.length;
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != array1[i]) {
                    union.add(array1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != array2[j]) {
                    union.add(array2[j]);
                }
                j++;
            }
        }

        while (j < n2) {
            if (union.size() == 0 || union.get(union.size() - 1) != array2[j]) {
                union.add(array2[j]);
            }
            j++;
        }

        while (i < n1) {
            if (union.size() == 0 || union.get(union.size() - 1) != array1[i]) {
                union.add(array1[i]);
            }
            i++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6 };

        System.out.println("Union: " + unionArray(arr1, arr2));
    }
}
