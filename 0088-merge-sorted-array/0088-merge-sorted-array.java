class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //use 3 pointers
        
        //pointer 1- at the end of the array , used to store the merged value
        //pointer 2- pointer of 1st array ie m
        //pointer 3- pointer of 2nd array ie n
        
        int pointer1 = nums1.length-1;
        
        int temp=0;
        while(n>0 && m>0 ) {
            if(nums1[m-1]>nums2[n-1]) {
                temp=nums1[m-1];
                m--;
            } else {
                temp=nums2[n-1];
                n--;
            }
            nums1[pointer1--]=temp;
            
        }
        
        while(n>0){
          nums1[pointer1--] =  nums2[n-1];
                n--; 
        }
        
        while(m>0){
           nums1[pointer1--] =  nums1[m-1];
            m--;
        }
    }
}