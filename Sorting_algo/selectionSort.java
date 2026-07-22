package Sorting_algo;
import java.util.Scanner;

public class SelectionSort{
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int[] arr=new int[n];
    //     for (int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     for (int i=0;i<n;i++){
    //         int min_index=i;
    //         for (int j=i+1;j<n;j++){
    //             if (arr[j]<arr[min_index]){
    //                 min_index=j;
    //             }
    //         }
    //         // Swap the found minimum element with the first element
    //         int temp = arr[i];
    //         arr[i] = arr[min_index];
    //         arr[min_index] = temp;

    //     }
    //     // Print the sorted array
    //     for (int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     sc.close();
    // }
    // Question:- Implement Selection Sort and print the index which is being swapped in each iteration.
    // Input format:- First line of input conatins T- number of test cases. Next line contains N- size of array. The next line contains N space separated integers- elements of array.
    //Contraints:- 1<=T<=100, 1<=N<=1000, 1000<=arr[i]<=1000
    //Output format:- Print the index which is being swapped in each iteration. Separate the output of each test case by a new line.
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
            int min_index=i;
                for (int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[min_index]){
                        min_index=j;
                    }
                }
            
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
            for(int a=0;a<arr.length;a++){
                System.out.print(arr[a]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}

