import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLearning {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            // pre-compute
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
            /*
                mpp.getOrDefault(5, 0)
                
                → This checks if key 5 exists in the map:

                If yes: it returns its value (e.g., 2).

                If not: it returns 0 (the default value).
            */
            
        }

        // iterate the map
        for(Map.Entry<Integer, Integer> e: mpp.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        /*
         * Map.Entry<Integer, Integer>
            → This represents a single key-value pair in the map. 
         * mpp.entrySet()
            → Returns a set of all key-value pairs from the map. 
         */

        int q = s.nextInt();
        while (q-- >= 1) {
            int num = s.nextInt();
            // fetch
            System.out.println("Count of " + num + ": " + mpp.get(num));
        }

        s.close();
    }
}
