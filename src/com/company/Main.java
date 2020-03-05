package com.company;

import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
          Thread t1 = new Thread(new Team("1"));
          Thread t2 = new Thread(new Team("2"));
          t1.start();
          t2.start();
    }


}
