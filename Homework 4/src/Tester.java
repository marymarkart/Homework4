import java.awt.*;
import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        Utils util = new Utils();
        Pair pair;

        //Test multiple values in Integer ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(345);
        arrayList.add(55);
        arrayList.add(45);
        arrayList.add(566);
        arrayList.add(503);
        arrayList.add(2334);
        arrayList.add(3);
        arrayList.add(21);
        arrayList.add(4);
        arrayList.add(34);
        arrayList.add(58);
        arrayList.add(234567);
        arrayList.add(345);
        arrayList.add(90);
        pair = util.getMinMax(arrayList);
        System.out.println(pair.toString());

        //Test 1 value in String ArrayList
        ArrayList<String> arr = new ArrayList<>();
        arr.add("x");
        pair = util.getMinMax(arr);
        System.out.println(pair.toString());

        //Test 2 values in Double ArrayList
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.1);
        doubles.add(1.01);
        pair = util.getMinMax(doubles);
        System.out.println(pair.toString());
    }
}
