package ru.geekbrains.homework3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class PhoneBook {
    HashMap<String, String> phoneBook = new HashMap<String, String>();

    public void add(String phone, String surname) {
        phoneBook.put(phone, surname);
    }

    public void get(String str) {
        Set entrySet = phoneBook.entrySet();
        Iterator it = entrySet.iterator();
        int count = 0;
        System.out.println("По фамилии " + str + " найдены следующие телефоны:");
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();//Если честно не понимаю что тут произошло, подсмотрел
            if (me.getValue() == str) {
                count++;
                System.out.println("  " + count + ") " + me.getKey());
            }
        }
        if(count==0){
            System.out.println("Ничего не найдено :-(");
        }

    }
}
