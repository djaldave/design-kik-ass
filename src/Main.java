public class Main {
    public static void main(String[] args) {
        int[] data = { 10,17,23,31,42,49,53,55,67,85,99}, linearSData = {31, 55, 1},binarySData = {67, 17, 176};

        System.out.println("\tLinear Search\t");
        search(linearSData, new LinearSearch(), data);
        System.out.println("\n\tBinary Search");
        search(binarySData,new BinarySearch(), data);

    }
    static void search(int[] item, SearchStrategy searchStrategy, int[] data){
        Context context = new Context(searchStrategy);
        for (int value: item) {
            System.out.println(value+" is @ index "+context.executeStrategy(data, value));
        }
    }
}

