package com.hand;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        int temp;
        for (int i=0;i<50;i++){
            temp=(int)(Math.random()*100);
            list.add(temp);
        }
        /*for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
*/
        Map<Integer,ArrayList<Integer>> hashMap = new HashMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        ArrayList<Integer> list5 = new ArrayList<Integer>();
        ArrayList<Integer> list6 = new ArrayList<Integer>();
        ArrayList<Integer> list7 = new ArrayList<Integer>();
        ArrayList<Integer> list8 = new ArrayList<Integer>();
        ArrayList<Integer> list9 = new ArrayList<Integer>();
        for (int i=0;i<50;i++){

            if(list.get(i)/10==1){
                list1.add(list.get(i));
                hashMap.put(1,list1);
            }
            if(list.get(i)/10==2){
                list2.add(list.get(i));
                hashMap.put(2,list2);
            }
            if(list.get(i)/10==3){
                list3.add(list.get(i));
                hashMap.put(3,list3);
            }
            if(list.get(i)/10==4){
                list4.add(list.get(i));
                hashMap.put(4,list4);
            }
            if(list.get(i)/10==5){
                list5.add(list.get(i));
                hashMap.put(5,list5);
            }
            if(list.get(i)/10==6){
                list6.add(list.get(i));
                hashMap.put(6,list6);
            }
            if(list.get(i)/10==7){
                list7.add(list.get(i));
                hashMap.put(7,list7);
            }
            if(list.get(i)/10==8){
                list8.add(list.get(i));
                hashMap.put(8,list8);
            }
            if(list.get(i)/10==9){
                list9.add(list.get(i));
                hashMap.put(9,list9);
            }
        }

        hashMap.forEach((key,value)->System.out.println(key+"=>"+value));

    }
}
