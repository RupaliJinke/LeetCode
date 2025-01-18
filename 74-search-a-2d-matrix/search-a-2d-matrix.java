class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int n=matrix.length;
        int cols=matrix[0].length;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][cols-1]){
                return binarysearchId(matrix[mid],target);
            }
            else if(target<matrix[mid][0]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public boolean binarysearchId(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}