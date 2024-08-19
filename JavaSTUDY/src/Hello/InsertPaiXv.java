package Hello;

import java.util.*;

public class InsertPaiXv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<5;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]<arr[j]){
                    int k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }
}
