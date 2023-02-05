package main;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();

        map.put("Фрайбург", 230241);
        map.put("Штутгарт",634830);

        if (map.containsKey(name)) {
            Integer mark = map.get(name);
            System.out.println(mark);
        }
        else {
            System.out.println("Не знакомый город");
        }

        Set<String> set = map.keySet();
        System.out.println(set);

        Collection<Integer> collection = map.values();

        for (Integer integer : collection) {
            System.out.println(integer);
        }








    }
}
