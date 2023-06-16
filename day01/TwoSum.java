package DSA.day01;

import java.util.Arrays;
import java.util.HashMap;

// this problem is solved in O(nlogn) time.
// where nlogn is for sorting only and rest of code takes n time
// n + nlogn ==> O(nlogn)

public class TwoSum {

    public HashMap<Integer, Integer> Sum(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        Arrays.sort(arr);

        int p = 0;
        int q = arr.length - 1;
        int sum;
        while(p < q){
            sum = arr[p] + arr[q];
            if(sum == target){
                map.put(p, q);
                p++;
                q--;
            }else if(sum < target){
                p++;
            }else{
                q--;
            }
        }

        return map;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 5, 5, -10, 30};
        int target = 10;

        TwoSum t = new TwoSum();
        HashMap<Integer, Integer> map = t.Sum(arr, target);

        for(int key : map.keySet()){
            System.out.println(arr[key]+" "+ arr[map.get(key)]);
        }
    }
}
