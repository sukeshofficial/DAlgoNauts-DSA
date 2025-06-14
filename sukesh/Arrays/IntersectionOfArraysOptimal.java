import java.util.ArrayList;

public class IntersectionOfArraysOptimal {
    static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) i++;
            else if (b[j] < a[i]) j++;
            else {
                intersection.add(a[i]);
                j++;
                i++;
            }
        }

        return intersection;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int[] arr2 = { 2, 3, 3, 5, 6, 6, 7 };

        System.out.println("Intersection: " + intersection(arr1, arr2));
    }
}
