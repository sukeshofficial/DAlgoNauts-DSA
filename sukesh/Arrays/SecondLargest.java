class SecondLargest {
    static int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        int n = arr.length;
        
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
    public static void main(String[] args) {
       int arr[] = {12, 35, 1, 10, 34, 1};
       int arr1[] = {10, 5, 10};
       int arr2[] = {10, 10, 10};

       System.out.println(getSecondLargest(arr));
       System.out.println(getSecondLargest(arr1));
       System.out.println(getSecondLargest(arr2));
    }
}