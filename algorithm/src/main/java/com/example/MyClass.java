package com.example;

import java.util.Scanner;

public class MyClass {

    static int key=0;
    public static void main(String[] args) {
        String[] arr={"dfs","asd","sert","tresl","lkgj"};
        AllSort(arr,0,arr.length-1);
        if(key>0){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
    }

    public static void AllSort(String[] arr, int begin,int end){
        if(begin==end){
            //在这里调用判断算法
            key=key+canArrangement(arr);
        }
        for(int i=begin;i<=end;i++){
            swap(arr,begin,i);
            AllSort(arr,begin+1,end);
            swap(arr,begin,i);
        }
    }

    public static void swap(String[] arr,int begin,int i){
        String temp=arr[begin];
        arr[begin]=arr[i];
        arr[i]=temp;
    }

    public static int canArrangement(String[] arr){
        String s1="";
        String s2="";
        if(arr.length==2){
            if(s1.charAt(s1.length()-1)==s2.charAt(0)){
                return 1;
            }else{
                return 0;
            }
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            s1=arr[i];
            s2=arr[i+1];
            if(s1.charAt(s1.length()-1)!=s2.charAt(0)){
                count++;
            }
        }
        return count>0?0:1;
    }
}
