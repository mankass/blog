package com.company;

import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {


        StreamTokenizer in = new StreamTokenizer(new FileReader("input.txt"));

        in.nextToken();
        int enemySize = (int) in.nval;
        int[] enemiesLevels = new int[enemySize];


        if (enemySize > 10e5) {
            throw new RuntimeException();

        }

        for (int i = 0; i < enemySize; i++) {
            in.nextToken();
            enemiesLevels[i] = (int) in.nval;
            if (enemiesLevels[i] > 10e6) {
                throw new RuntimeException();
//                System.out.println("Impossible");
//                return;
            }
        }
        ArrayList<Enimy> enemyList = new ArrayList<>();
        for (int i = 0; i < enemySize; i++) {
            Enimy enemy = new Enimy();
            enemy.setIndex(i+1);
            enemy.setLvlmob(enemiesLevels[i]);
            enemyList.add(enemy);
        }
        int lvl = 1;
        int counterHits = 0; // ранения

        List<Integer> result = new ArrayList<>();
        enemyList.sort(Comparator.comparingInt(Enimy::getLvlmob));
        for (Enimy enimy : enemyList) {
            if (lvl < enimy.getLvlmob()) {
                System.out.println("Impossible");
                return;
            }

            result.add(enimy.index);
            if (enimy.getLvlmob() * 2 > lvl) {
                counterHits++;
                if (counterHits > 2) {
                    lvl--;
                    counterHits = 0;
                }
            }
            lvl++;
        }

        System.out.println("Possible");

        String formattedString = result.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
        System.out.println(formattedString);
    }


    static class Enimy {
        public int getLvlmob() {
            return lvlmob;
        }

        public void setLvlmob(int lvlmob) {
            this.lvlmob = lvlmob;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        private int index;
        private int lvlmob;
    }
}


