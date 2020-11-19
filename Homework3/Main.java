package Homework3;

import java.text.MessageFormat;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Москва","Питер","Ярославль", "Питер", "Самара",
                "Москва","Ростов","Смоленск", "Казань", "Вологда",
                "Питер","Серпухов","Ржев", "Рязань", "Волгоград"};

        wordsTool(words);

        //телефонный справочник
        Phonebook pb = new Phonebook();
        pb.newContact("Олег","+79212112233");
        pb.newContact("Валера","8945454545");
        pb.newContact("Олег","+79 1521588");

        pb.getContact("Саша");
        pb.getContact("Олег");
        pb.getContact("Валера");

    }

    private static void wordsTool(String[] words) {
        HashMap<String, Integer> unic = new HashMap<>();
        //add to HashMap
        for (String word: words) {
            unic.put(word,unic.getOrDefault(word,0) + 1);
        }
        //print HashMap
        for (String s : unic.keySet()) {
            System.out.println(MessageFormat.format("Слово |{0}| встречается {1} раз(а)",s,unic.get(s)));
        }
    }
}
