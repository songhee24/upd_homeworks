package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<Integer, String> hashMap = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 10;i++){
            int number = random.nextInt(31);
            hashMap.put(number,getRandomString());
        }
        System.out.println(hashMap);

        //отфильтрованные ключи
        List<Integer> filterInt = hashMap.keySet().stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(filterInt);

        //% 3 == 0
        List<Integer> keyPercentThree = filterInt.stream().filter(x -> x % 3 ==0).collect(Collectors.toList());

        List<String> valuesMoreFive = hashMap.values().stream().filter(x -> x.length() > 5).collect(Collectors.toList());


        System.out.println("2 "+valuesMoreFive.get(2));

        System.out.println("values length more 5" + valuesMoreFive);

        System.out.println("values by key "+getValuesByKeys(filterInt,hashMap));

        List<String> comma = getValuesByKeys(keyPercentThree,hashMap);
        System.out.println("comma "+comma);

        Stream<String>stringStream = comma.stream();
        Optional<String> reduce = stringStream.reduce((value,combined) ->{return value + "," + combined;});
        System.out.println(reduce.get());

        getKeysByValue(hashMap,valuesMoreFive).forEach(x -> System.out.println(x*x));

    }

    //просто чтобы получить  рандомные слова
    static String getRandomString(){
        int r = (int) (Math.random()*5);
        String name = new String [] {"minecraft","reactjs","washing-machine","exception","js","java"}[r];
        return name;
    }

    //я сделал метод который получает значения из hashMap смотря на ключи которые предварительно были отфильтрованы с помощью stream().filter(x -> x > 5)
    static List<String> getValuesByKeys(List<Integer> integerList, HashMap<Integer,String> map){
        List<String> strings = new ArrayList<>();
        for (int i =0;i<integerList.size();i++){
             strings.add(map.get(integerList.get(i)));
        }
        return strings;
    }

 //и метод который получает ключи смотря на значения используя entrySet()
   static public  Set<Integer> getKeysByValue(HashMap<Integer,String> map, List<String> value) {
        Set<Integer> keys = new HashSet<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            for (int i = 0; i < value.size();i++){
                if (entry.getValue().equals(value.get(i))) {
                    keys.add(entry.getKey());
                }
            }

        }
        return keys;
    }

}
