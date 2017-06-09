package com.company;

public class Main {

    public static int GetMaxAndMin(int[] arr){
        int max = 0;
        int max2 =0;

        int min = 0;
        int min2 = 0;
        int min3 = 0;

        int index1 = 0;
        int index2 = 0;

        int index3 = 0;
        int index4 = 0;
        int index5 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min = arr[i];
        }


        for (int i = arr.length-1; i >= 0; i--) {

            if(arr[i]>max2) {
                if (arr[i]==max){
                    continue;
                }
                max2 = arr[i];

            }
            if(arr[i]<min2){
                if (arr[i]==min)
                    continue;
                min2 = arr[i];

            }
            else if(arr[i]<min3){
                if (arr[i]==min && arr[i]==min2 ){
                    continue;
                }
                min3 = arr[i];
            }

        }



        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max )
                index1 = i;
            else if
                    (arr[i]==max2)
                index2 = i;
            else if
                    (arr[i]==min)
                index3 = i;
            else if
                    (arr[i]==min2)
                index4 = i;
            else if
                    (arr[i]==min3)
                index5 = i;
        }


        System.out.println(max);
        System.out.println(max2);

        System.out.println(min);
        System.out.println(min2);
        System.out.println(min3);

        System.out.println("Index of the largest "+index1);
        System.out.println("Index of the second largest "+index2);
        System.out.println("Index of the smallest "+index3);
        System.out.println("Index of the second smallest "+index4);
        System.out.println("Index of the third smallest "+index5);
        return 0;
    }


    public static void main(String[] args) {

        int[] arr = {-3,9,1,-2,7,42,-7,3,10,-2,23};

        GetMaxAndMin(arr);
    }
}
