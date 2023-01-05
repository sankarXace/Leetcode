class Solution {
    public int[] merge(int[] arr,int[] nums1, int[] nums2){
        int i=0;
        for(int j=0;j<nums1.length;j++){
            arr[i] = nums1[j];
            i++;
        }
        for(int k=0;k<nums2.length;k++){
            arr[i] = nums2[k];
            i++;
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
  
        // pivot
        int pivot = arr[high];
        int i = (low - 1);
  
        for (int j = low; j <= high - 1; j++) {
  
            
            if (arr[j] < pivot) {
  
                
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
  
    
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
  
            
            int pi = partition(arr, low, high);
  
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        arr = merge(arr,nums1,nums2);
        quickSort(arr,0,arr.length-1);
        int n = arr.length;
        if(n%2!=0){
            return (double)(arr[n/2]);
        }else{
            return ((double)(arr[n/2-1]+arr[n/2]))/2;
        }
    }
}