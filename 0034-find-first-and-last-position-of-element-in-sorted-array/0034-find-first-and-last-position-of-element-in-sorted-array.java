class Solution {
    public int[] searchRange(int[] arr, int target) {
        int firstOcc = first(arr , target);
        int lastOcc = last(arr , target);
        return new int[]{firstOcc,lastOcc};
    }


public int  first(int[] arr , int target){
int n = arr.length;
int lo = 0 , hi = n-1;
int ans = -1;

while(lo <= hi){
    int mid = (lo+hi)/2;
    if(arr[mid]== target){
    ans = mid;
    hi= mid-1;
    }
    else if(arr[mid]< target) lo = mid+1;
    else {
        hi = mid -1;
    }
    }
    return ans;

}

public int  last(int[] arr , int target){
int n = arr.length;
int lo = 0 , hi = n-1;
int ans = -1;

while(lo <= hi){
    int mid = (lo+hi)/2;
    if(arr[mid]== target){
    ans = mid;
    lo = mid+1;
    }
    else if(arr[mid]< target) lo = mid+1;
    else {
        hi = mid -1;
    }
    }
    return ans;

}
}