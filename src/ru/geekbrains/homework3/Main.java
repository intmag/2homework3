package ru.geekbrains.homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Привет");
        arrayList.add("Андрей");
        arrayList.add("Привет");
        arrayList.add("Андрей");
        arrayList.add("Ну");
        arrayList.add("Где");
        arrayList.add("Ты");
        arrayList.add("Был");
        arrayList.add("Ну");
        arrayList.add("Обними");
        arrayList.add("Меня");
        arrayList.add("Скорей");
        System.out.println(arrayList);
        Set<String> setArrayList = new LinkedHashSet<String>();
        Iterator<String> iter = arrayList.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            setArrayList.add(str);
        }
        System.out.println(setArrayList);
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
        iter = arrayList.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            Integer val=lhm.get(str);
            if(lhm.containsKey(str)){
                lhm.put(str,++val);
            } else {
                lhm.put(str,(Integer)1);
            }
        }
        System.out.println(lhm);
        System.out.println("\n-----===== P H O N E  B O O K =====-----");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+79037374995","Иванов");
        phoneBook.add("+79037374996","Иванов");
        phoneBook.get("Иванов");
    }

}
