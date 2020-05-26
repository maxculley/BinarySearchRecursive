 
public class BinarySearch {
 
 
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30}; // Input array
       
        System.out.println(binarySearchRecursive(data, 14));
       
    }
   
    public static boolean binarySearchRecursive(int[] arr, int x, int left, int right){
        if (left > right) { // If the array is invalid
            return false;
        }
       
        int mid = (left + right) / 2; // Mid point of array
        if (arr[mid] == x) { // If the mid point is equal to 'x'
            return true;
        } else if (x < arr[mid]) { // If 'x' is less than the mid point
            return binarySearchRecursive(arr, x, left, mid - 1); // return mid - 1 because the upper bound is now the value before the previous mid point as you are discarding the right half of the array
        } else {
            return binarySearchRecursive(arr, x, mid + 1, right); // Return mid + 1 because the lower bound is now the value after the previous mid point as you are discarding the left half of the array
        }
       
    }
   
    public static boolean binarySearchRecursive(int[] arr, int x) { // Initial input will be the array and the integer you are looking for
        return binarySearchRecursive(arr, x, 0, arr.length - 1); // Calls the binary search method with correct parameters needed
    }
   
}