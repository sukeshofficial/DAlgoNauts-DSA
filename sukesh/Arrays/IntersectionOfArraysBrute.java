import java.util.ArrayList;

public class IntersectionOfArraysBrute {
    static ArrayList<Integer> intersection(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int[] vis = new int[n2];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j] && vis[j] == 0) {
                    ans.add(a[i]);
                    vis[j] = 1;
                    break;
                }
                if (b[j] > a[i])
                    break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int[] arr2 = { 2, 3, 3, 5, 6, 6, 7 };

        System.out.println("Intersection: " + intersection(arr1, arr2));
    }
}
