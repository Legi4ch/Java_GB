package Homework3;

import java.text.MessageFormat;
import java.util.*;
import java.util.function.BiConsumer;

public class Lesson {

    public static void main(String[] args) {
        //testArrayList();
        //testLinkedList();
        //testSet();
        testMap();


    }

    private static void testMap() {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("Russia", "Moscow");
        map.put("France", "Paris");
        map.put("Ukraine", "Kiev");
/*

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(MessageFormat.format("Страна:{0}, Столица:{1}",entry.getKey(),entry.getValue()));
        }
*/

/*        for (String s : map.keySet()) {
            System.out.println(MessageFormat.format("Страна:{0}, Столица:{1}",s,map.get(s)));
        }*/

/*        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key,String value) {
                System.out.println(MessageFormat.format("Страна:{0}, Столица:{1}",key,value));
            }
        });*/

        map.forEach((key, value) -> System.out.println(MessageFormat.format("Страна:{0}, Столица:{1}",key,value)));

        System.out.println(map);

    }

    private static void testSet() {
        Set<String> set = new TreeSet<>();
        set.add("B");
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

    }

    private static void testLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("F");

        linkedList.set(1,"X");
        Collections.sort(linkedList);

        System.out.println(linkedList);

    }

    private static void testArrayList() {
        ArrayList<String> arrayList = new ArrayList<>(3);
        arrayList.add("a");
        arrayList.add("14");
        arrayList.add("И");
        arrayList.add("B");
        arrayList.add("17");
        arrayList.add("Z");
        arrayList.set(2,"GG");
        arrayList.add(3,"ass");
        //arrayList.trimToSize();
        arrayList.remove("GG");
        System.out.println(arrayList);

         //iterator
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //foreach
        for (String s: arrayList) {
            System.out.println(s);
        }
    }
}
