import java.util.ArrayList;

public class Utils {

    public static <T extends Comparable<T>> Pair getMinMax(ArrayList<? extends T> arr){
        T max = arr.get(0);
        T min = arr.get(0);
        for (T elem : arr){
            if (elem.compareTo(max) > 0){
                max = elem;
            }
            if (elem.compareTo(min) < 0){
                min = elem;
            }
        }
        Pair pair = new Pair(min, max);
        return pair;
    }
}
