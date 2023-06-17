package DSA.day02;

import java.util.Arrays;

public class StockSell {

    public int profit(int[] arr){
        int least = Integer.MAX_VALUE;
        int current = 0;
        int maxProfit = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < least){
                least = arr[i];
            }

            current = arr[i] - least;

            if(maxProfit < current){
                maxProfit = current;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,4,3,5,6};

        StockSell s = new StockSell();
        System.out.println(s.profit(arr));
    }
}
