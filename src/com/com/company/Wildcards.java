package com.company;

import java.util.List;

public class Wildcards {
    public static<T> T sum(List<? extends Number> numbers){
        Double a = 0.0;
        T sum = null;
        for (int i = 0;i < numbers.size();i++){
             a += (Integer)numbers.get(i);
        }
        sum = (T)a;
        return sum;
    }
}
