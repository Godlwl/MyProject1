package com.example.lwl.myproject;

/**
 * Created by LWL on 2017/3/9.
 */

/**
 * 冒泡算法
 */
public class Sort {
    public static void bubbleSort(int[] data){
        int temp;
        boolean flag=false;
        for (int i=0;i<data.length-1;i++){
            for (int j=data.length-1;j>i;j--){
                if (data[j]<data[j-1]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                    flag=true;
                }
            }
            if (flag==false){
                break;
            }
        }
    }
    /**
     * 选择排序
     */
    public static  void select_sort(int[] data){

        for (int i=0;i<data.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<data.length;j++){
                if (data[j]<data[minIndex]){
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                int temp=data[i];
                data[i]=data[minIndex];
                data[minIndex]=temp;
            }
        }
    }

    /**
     * 插入排序
     */
    public static void insertSort(int[] a){
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }else {
                    break;
                }
            }
        }
    }

    /**
     * 二分法
     */
    public static int binarySearch(int[] data,int key){
        int start=0;
        int last=data.length-1;
        int mid=-1;
        while (start<=last){
            mid=(start+last)/2;
            if (key<data[mid]){
                last=mid-1;
            }else if (key>data[mid]){
                start=mid+1;
            }else if (key==data[mid]){
                break;
            }
        }
        return mid;

    }
}


