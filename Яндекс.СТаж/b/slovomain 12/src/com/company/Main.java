package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static final int QUOTE_CHARACTER = '\'';
    private static final int DOUBLE_QUOTE_CHARACTER = '"';


    public static void main(String[] args) throws IOException {

        List<Integer> numbers=streamTokenizerWithDefaultConfiguration();
        removeNconsecutive(numbers, 3);

    }

    public static void removeNconsecutive(List<Integer> numbers, int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < numbers.size() - n + 1; i++) {
            int x = numbers.get(i);

            boolean toDelete = true;
            for (int j = i + 1; j < Math.min(i + n, numbers.size()); j++) {
                if (x != numbers.get(j)) {
                    toDelete = false;
                    break;
                }
            }

            if (toDelete) {
                int count = 0;
                while (i < numbers.size() && x == numbers.get(i)) {
                    count++;
                    numbers.remove(i);
                }
                i=0;
            }

        } System.out.println(numbers.toString().replaceAll("^\\[|\\]$", ""));

    }

    public static List<Integer> streamTokenizerWithDefaultConfiguration() throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new FileReader("input.txt"));
        List<Integer> tokens = new ArrayList<>();

        int currentToken = streamTokenizer.nextToken();
        while (currentToken != StreamTokenizer.TT_EOF) {

            if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                tokens.add((int) streamTokenizer.nval);
            } else if (streamTokenizer.ttype == StreamTokenizer.TT_WORD
                    || streamTokenizer.ttype == QUOTE_CHARACTER
                    || streamTokenizer.ttype == DOUBLE_QUOTE_CHARACTER) {
                tokens.add(Integer.valueOf(streamTokenizer.sval));
            } else {
                tokens.add((int) currentToken);
            }

            currentToken = streamTokenizer.nextToken();
        }

        return tokens;
    }
}
