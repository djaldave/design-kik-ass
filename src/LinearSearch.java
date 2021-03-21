public class LinearSearch implements SearchStrategy {

    @Override
    public int search(int[] arr, int searchItem) {
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == searchItem)
                return i;
        }
        return -1;
    }
}
