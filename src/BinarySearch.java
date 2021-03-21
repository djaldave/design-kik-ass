public class BinarySearch implements SearchStrategy {

    @Override
    public int search(int[] arr, int searchItem) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == searchItem)
                return m;
            if (arr[m] < searchItem)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
