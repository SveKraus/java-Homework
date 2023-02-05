package homework2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdditionalTask {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("465454");
        arrayList.add("7");
        arrayList.add("8");

        linkedList.add("7844587");
        linkedList.add("5");
        linkedList.add("6");

        arrayList.set(1, "1");

        int center = arrayList.size() / 2;
        String first = arrayList.get(0);
        arrayList.set(center, first);

        arrayList.remove(2);

        linkedList.addAll(arrayList);

        System.out.println(linkedList);

        String maxString = "";
        for (String s: linkedList) {
            if(s.length() > maxString.length()) {
                maxString = s;
            }

        }
        System.out.println(maxString);
    }
}
