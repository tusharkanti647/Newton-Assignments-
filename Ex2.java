package prectice;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> sta1=new Stack<>();
        Stack<Integer> sta2=new Stack<>();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        sta1.push(-1);
        for(int i=0;i<n;i++){
            while(sta1.peek()!=-1 && arr[sta1.peek()]>=arr[i]){
                sta1.pop();
            }
            arr1[i]=i-sta1.peek();
            sta1.push(i);
        }
        sta2.push(n);
        for(int i=n-1;i>=0;i--){
            while(sta2.peek()!=n && arr[sta2.peek()]>arr[i]){
                sta2.pop();
            }
            arr2[i]=sta2.peek()-i;
            sta2.push(i);
        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<n;i++){
//            System.out.print(arr2[i]+" ");
//        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(arr[i]*arr1[i]*arr2[i]);
        }
        System.out.println(sum);

    }
}