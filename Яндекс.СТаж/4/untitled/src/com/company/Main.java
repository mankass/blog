package com.company;


import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new FileReader("input.txt"));
        in.nextToken();
        int len = (int) in.nval;
        in.nextToken();
        String data=(String)in.sval;
        List<String> result = new ArrayList<>();

        for (int i = 0; i <= data.length() - 3; i++) {
            String substring = data.substring(i, i + len);
            if (isPol(substring)) {
                result.add(substring);
                i += len - 1;
            }
        }
        System.out.println(result);
    }

    private static Boolean isPol(String data) {
        assert data.length() > 0;
        if (data.length() == 1) return true;

        for (int i = 0; i < data.length() / 2; i++) {
            if (data.charAt(i) != data.charAt(data.length() - i - 1)) return false;
        }
        return true;
    }
}
