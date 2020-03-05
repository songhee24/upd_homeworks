package com.company;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Team implements Runnable {
     String team;
     int goal;
     int card;
     int offside;
    @Override
    public void run() {
        System.out.println("team:"+team+
                "\ngoals:" + (goal+=goals()) +
                "\ncards:" + (card+=cards()) +
                "\noffsides:" + (offside += offsides()));

    }
      int goals(){
        Random random = new Random();
        return random.nextInt( 15);
    }
      int cards(){
        Random random = new Random();
        return random.nextInt( 15);
    }
      int offsides(){
        Random random = new Random();
        return random.nextInt( 15);
    }


    public Team(String team) {
        this.team = team;
    }


}
