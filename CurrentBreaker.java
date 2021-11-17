public class CurrentBreaker {
    private String name;
    private int currentRange;

    public CurrentBreaker(String name, int currentRange){
        this.name = name;
        this.currentRange = currentRange;
    }
    public String getName(){
        return name;
    }
    public int getCurrentRange(){
        return currentRange;
    }
}
