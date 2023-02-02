public class LinearSearch {
    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            switch (Integer.compare(array[mid], target)) {
                case -1:
                    left = mid + 1;
                    break;
                case 0:
                    return mid;
                case 1:
                    right = mid - 1;
                    break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int target = 4;
        int index = search(array, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
