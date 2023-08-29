package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List l1 = new ArrayList<>();
        List l2 = new LinkedList<>();



        l1.add("str");

        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new TreeSet<>();

        String str = "Hello";

        Object o = str;
        o = l1;
        o = l2;
        o = s1;
        o = s2;
        o = str;

        Collection c;

        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        if(type.equals("arraylist")){
            c = l1;
        }else if(type.equals("linkedlist")){
            c = l2;
        }else if(type.equals("hashset")){
            c = s1;
        }else if(type.equals("treeset")){
            c = s2;
        }else{
            c = l1;
        }

        c.add("hello");
        System.out.println(c);

        List<String> arrlist = new ArrayList<>();

        for(String item : arrlist){
        }
        // arraylist
        l1.add("str");
        l1.remove(0);
        // linkedlist
        l2.add("str");
        l2.remove(0);

    }
}