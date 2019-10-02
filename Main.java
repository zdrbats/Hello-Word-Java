//package com.company;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.List;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
//package bg.codexio;



public class Main {
    public static void main(String[] args) {

//2
        Scanner sc = new Scanner(System.in);
        Integer num = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<String>> synonyms = new LinkedHashMap<>();
        String word = "";
        String synonym = "";
        while(num > 0){
            word = sc.nextLine();
            synonym = sc.nextLine();
            if(!synonyms.containsKey(word)){
                synonyms.put(word, new ArrayList<>());
            }
            synonyms.get(word).add(synonym);
            num--;
        }

        synonyms.forEach((k,v) -> {
            System.out.print(k + " - ");
            System.out.println(String.join(", ", v));
        });


//        //1 Associative Arrays
//        Scanner sc = new Scanner(System.in);
//        double[] nums = Arrays.stream(sc.nextLine().split(" "))
//                .mapToDouble(Double::parseDouble).toArray();
//        Map<Double, Integer> counts = new TreeMap<>();
//        for(double num: nums){
//            if(!counts.containsKey(num)){
//                counts.put(num, 0);
//            }
//            counts.put(num, counts.get(num) + 1);
//        }
//
//        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
//
//            DecimalFormat df = new DecimalFormat("#.#######");
//
//            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
//        }





        //System.out.println("Hello World!");
    }
}
