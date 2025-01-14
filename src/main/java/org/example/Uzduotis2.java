package org.example;

import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.List;

public class Uzduotis2 {
    public static void main(String[] args) {

        int[] skaiciai = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(skaiciai));
        System.out.println("Max: " + Ints.max(skaiciai));
        System.out.println("Min: " + Ints.min(skaiciai));

        System.out.println("Ar egzistuoja 4? " + Ints.contains(skaiciai,4));
        System.out.println("Ar egzistuoja 9? " + Ints.contains(skaiciai,9));

        List<Integer> skaiciai2 = Ints.asList(skaiciai);
        System.out.println(skaiciai2);

    }
}
