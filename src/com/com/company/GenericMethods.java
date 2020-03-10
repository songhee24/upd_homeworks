package com.company;

public class GenericMethods<Z> {
    public static <T extends Number> T average(T[] arr){
        Double b = 0.0;
        T sum = null;
        for (int i = 0;i < arr.length;i++){
             b += (Integer) arr[i];
        }
        b /= arr.length;
        sum = (T)b;
        return sum;
    }

}
