public class Context {
//    private final SearchStrategy strategy;
    private final SearchStrategy strategy;

    public Context(SearchStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int[] arr, int item){
        return strategy.search(arr, item);
    }
}
