package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лира");
        list.add("вода");
        list.add("упор");
        list.add("мера");

        list = fix(list);
        for (String s : list) System.out.println(s);
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л")) continue;
            if (list.get(i).contains("л")) list.remove(i);
            if (list.get(i).contains("р")) list.remove(i);
        }
        return list;
    }
}