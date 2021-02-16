package com.javatpoint.controller;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public static void main(String[] args) {

        int[] a={-2,1,-3,4,-1,2,1,-5,4};

        maxSubArray(a);
    }

    public static int maxSubArray(int[] a) {

        ArrayList<Integer>  arrayList = new ArrayList<>();
        ArrayList<Integer>  arrayList2 = new ArrayList<>();


        int max1 =0;
        int count =0;
        int b=0;

        for(int i=0;i<a.length;i++){


             for(int j=i;j<a.length;j++){

                 arrayList.add(a[j]);


                 for(Integer  integer:arrayList){

                     count = count + integer;



                 }
                 arrayList2.add(count);
                 count =0;









             }

             arrayList = new ArrayList<>();


        }

       int finalRes=  Collections.max(arrayList2);
        System.out.println(finalRes);

        return  finalRes;

    }
}
