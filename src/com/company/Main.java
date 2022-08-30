package com.company;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HashMap<String , String > map = new HashMap<String,String>();
        Scanner in = new Scanner(System.in);
        map.put(in.next(),in.next());
        map.put(in.next(),in.next());
        map.put(in.next(),in.next());
        map.merge(in.next(),in.next(),(v1,v2)->v1+v2);
        System.out.println(map);
    }
}
