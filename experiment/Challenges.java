package com.akash;

//given two arrays, create a function that let's the user know(true/false)
// whether these two array contain any common items. for example:
//array1 = ['a', 'b', 'c', 'x'];
//array2 = ['x', 'y, 'z'];
//should return true
//
//array1 = ['a', 'b', 'c', 'x'];
//array2 = ['i', 'y', 'z'];
//should return false

import java.util.HashMap;

public class Challenges {
    public static void main(String[] args) {
        String[] arr1 = {"a", "k", "s", "h", "a"};
        String[] arr2 = {"n", "u"};
        boolean ans = matchCommonElements(arr1, arr2);
        boolean ans1 = matchCommonElements1(arr1, arr2);
        System.out.println(ans);
        System.out.println(ans1);
    }

    //non efficient method. Time complexity O(n^2) i.e. quadratic
    public static boolean matchCommonElements(String[] arr1, String[] arr2) {
        for(int i = 0; i<arr1.length; i++) {
            for(int j = 0; j<arr2.length; j++) {
                if(arr1[i].equals(arr2[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    //efficient method. Time complexity O(m + n) i.e. linear
    public static boolean matchCommonElements1(String[] arr1, String[] arr2) {
        HashMap<String , Boolean> map = new HashMap<>();
        for(int i = 0; i < arr1.length; i++) {
            if(!map.containsKey(arr1[i])) {
                map.put(arr1[i], true);
            }
        }

        for(int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])) {
                return true;
            }
        }
        return false;
    }
}
