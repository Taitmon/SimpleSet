package com.company;

import java.util.*;

public class SimpleSet
{

    public static void main(String[] args)
    {
        SimpleSet set = new SimpleSet();
        set.run();
    }

    public void run()
    {
        HashSet<Integer> myset = new HashSet<>();
        myset.add(1);
        myset.add(2);
        myset.add(3);
        myset.add(4);
        myset.add(5);
        System.out.println(myset);
        myset.add(3);
        System.out.println(myset);
    }
}
