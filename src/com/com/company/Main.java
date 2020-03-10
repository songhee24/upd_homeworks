package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Generic<Integer,String> generic = new Generic<>(1,"one");
        generic.print();
        Integer[] numbers = {1, 2, 3, 4};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println(GenericMethods.average(numbers));
        Double sum = Wildcards.sum(integers);
        System.out.println(sum);
    }


}
