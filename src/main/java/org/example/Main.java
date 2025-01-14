package org.example;

import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        Range<Integer> range = Range.closed(50,100);
        Range<Integer> range2 = Range.openClosed(50,100);

        System.out.println(range.contains(50));
        System.out.println(range2.contains(50));

        System.out.println(range.intersection(range2));
        System.out.println(range.span(range2));

        System.out.println(range2.intersection(range));
        System.out.println(range2.span(range));

    }
}