package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a [];
        int schet=0;
        int k = 0;

        for (int m=0;m<10000;m++){

            for(int i=k;i<n;i++){

                a = new int[n];
                a[i] = scanner.nextInt();
                k++;
                if (a[i] == m){
                    schet++;
                    break;
                }
            }
            if(m==n)break;
        }

        System.out.print(schet);
    }
}
