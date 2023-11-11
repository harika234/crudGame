package recursion;

import java.util.ArrayList;

public class PrintsubSequenceByRecursion {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        printF(0,list,arr,n);
    }
    public static void printF(int index,ArrayList<Integer> list,int arr[],int n){
        if(index == n) {
            for(Integer i:list){
                System.out.print(i+" ");
            }
            if(list.size()==0){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }
        list.add(arr[index]);
        printF(index+1,list,arr,n);
        list.remove(list.size()-1);
        printF(index+1,list,arr,n);


    }
}
//tc = {2^n * n};
//sc = auxilary stack space -  O(n)
