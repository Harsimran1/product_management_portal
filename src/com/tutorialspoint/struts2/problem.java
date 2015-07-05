package com.tutorialspoint.struts2;

import java.util.AbstractList;
import java.util.Arrays;

/**
 * Created by harsimran on 5/7/15.
 */
public class problem{



    public static boolean findPair(int[] arrs ,int x){
        int min=0,max=0;
        for(int i=0;i<arrs.length;i++){
            if(arrs[i]>arrs[i+1]) {
                min = i + 1;
                max=i;
                break;
            }
        }
        while(min!=max){
            if(arrs[min]+arrs[max]==x)
                return true;
            if(arrs[min]+arrs[max]>x)
                max=(arrs.length+max-1)%arrs.length;
            else
                min=(min+1)%arrs.length;

        }
        return false;

    }
    public void findMinAndMax(int arr[],int min,int max){
        min=arr[0];
        max=arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i]<min)
              min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
    }
    public static int findCommon(int mat[][]){
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            if(mat[i][n])
        }


        return 6;

    }
    public static void main(String args[]){
//        int[] arr={11, 15, 6, 8, 9, 10};
        int[] arr1={1,3,0,2};
//                   {2,0,3,1};
//        System.out.println(findPair(arr, 16));
        int mat[][] = { {1, 2, 3, 4, 5},
            {2, 4, 5, 8, 10},
            {3, 5, 7, 9, 11},
            {1, 3, 5, 7, 9},
        };

    }

}


