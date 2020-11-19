public class Pair<T> {
    private T first;
    private T second;

    public Pair(T firstElem, T secondElem){
        first = firstElem;
        second = secondElem;

    }
    public T getFirst(){return first;}

    public T getSecond() {return second;}

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

}
