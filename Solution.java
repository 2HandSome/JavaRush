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
        list.add("вола");
        list.add("упор");
        list.add("меа");
        list.add("роза");

        list = fix(list);
        for (String s : list) System.out.println(s);
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i).indexOf("р")>=0 && list.get(i).indexOf("л")== 0) {
                continue;
            }else if (list.get(i).indexOf("р")>=0 && list.get(i).indexOf("л")==-1) {
                list.remove(i);
            } else if (list.get(i).indexOf("л")>=0 && list.get(i).indexOf("р")==-1)
                list.add(list.get(i));
        }
        
        return list;
    }
}