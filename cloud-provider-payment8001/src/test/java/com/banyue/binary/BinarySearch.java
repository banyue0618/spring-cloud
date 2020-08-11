package com.banyue.binary;

/**
 * @author banyue
 * date 2020-08-11
 */
public class BinarySearch {

    public static void main(String[] args) {
        int []a={1,10,30,34,40,45,59};
        int index=binarySearch(a, 30);
        System.out.println(index);
        index = binarySearch2(a, 0, 6, 30);
        System.out.println(index);
    }


    public static int binarySearch(int[] arr, int target){
        int high = arr.length - 1;
        int low = 0;
        while (low <= high){
            int mid = (high+low)>>1;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] arr, int low, int high, int target){
        if(low <= high){
            int mid = (high+low)>>1;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            return binarySearch2(arr, low, high, target);
        }
        return  -1;
    }


}
