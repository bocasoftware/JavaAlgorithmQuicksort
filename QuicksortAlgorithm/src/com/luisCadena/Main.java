package com.luisCadena;

import java.util.Scanner;


public class Main {


        public static void main (String[]args){

            while(true)

            {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quick Sort Test\n");

        int n, i;


        System.out.println("enter number of integer elements");
        n = scan.nextInt();


        int arr[] = new int[n];


        System.out.println("\nEnter " + n + " integer elements");

        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        QuickSort newSort = new QuickSort();
        newSort.sort(arr);


        System.out.println("\nElements after sorting");

        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

        System.out.println();

        scan.nextLine();


    }


    }

}
