package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int array1[]={2,3,5,1,2,4};
        int array2[]={7,5,9,5};
        int size = array1.length+ array2.length;
        int array3[]=new int[size];
        for (int i = 0; i < array3.length; i++) {
            for (int j = i; j < array1.length; j++) {
                array3[i]=array1[i];
            }
            for (int j = 0; j < array2.length; j++) {
                array3[array1.length+j]=array2[j];
            }
        }
        System.out.print("Mảng sau khi gộp là :");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]+" ");
        }
    }
}
