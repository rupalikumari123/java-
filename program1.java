//Given an array arr, rotate the array by one position in clockwise direction.

class Solution {
    public void rotate(int[] arr) {
        int lastElement=arr[arr.length-1];
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            int temp1=arr[i+1];
            arr[i+1]=temp;
            temp=temp1;
            
        }
        arr[0]=lastElement;
        // code here
    }
}
