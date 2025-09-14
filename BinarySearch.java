package Project;
public class BinarySearch{
    public static int binarySearch(int[] array, int target) {
        // Initialize the left pointer to the start of the array
        int left = 0;

        // Initialize the right pointer to the end of the array
        int right = array.length - 1;

        // Continue searching while the left pointer is less than or equal to the right pointer
        while (left <= right) {
            // Calculate the middle index to avoid integer overflow
            int mid = left + (right - left) / 2;

            // If the middle element is equal to the target, return the index
            if (array[mid] == target) {
                return mid;
            }
            // If the middle element is less than the target, search in the right half
            else if (array[mid] < target) {
                left = mid + 1;
            }
            // If the middle element is greater than the target, search in the left half
            else {
                right = mid - 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }

    // Example usage (for testing purposes)
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 15;

        int result = binarySearch(sortedArray, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
  