package recursion;

import java.util.ArrayList;

public class SubsequenceWithSumK {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int n = 3;
        int target_sum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        printS(0,list,0,target_sum,arr,n);
    }
    public static void printS(int index,ArrayList<Integer> list,int sum,int target_sum,int[] arr,int n) {
        if(sum == target_sum) {
            for(Integer i: list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        if(index == n) {
            return;
        }
        list.add(arr[index]);
        sum = sum+arr[index];
        printS(index+1,list,sum,target_sum,arr,n);

        sum = sum-arr[index];
        list.remove(list.size()-1);
        printS(index+1,list,sum,target_sum,arr,n);
    }
}
