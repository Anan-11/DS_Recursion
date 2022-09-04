// print all the subsequences of an array that has all distinct elements

import java.util.LinkedList;

public class subsets_or_subsequences_of_array_of_distinct_elements {
  
    public static void print(int[] arr,int i,LinkedList<Integer> l1)
    {
        if(i==arr.length)
        {
            System.out.println(l1);
            return;
        }
        l1.add(arr[i]);
        print(arr,i+1,l1);
        l1.removeLast();
        print(arr,i+1,l1);

    }

    public static void main(String[] args) {
        LinkedList <Integer> l1=new LinkedList<>();
        int[] arr={1,2,3};
        print(arr,0,l1);
    }
}
