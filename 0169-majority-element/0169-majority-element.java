// class Solution {
//     public int majorityElement(int[] arr) {
//         //brute force 
        
//         // int n = arr.length;

//         // for(int i=0;i<n; i++){
//         //     int count = 0;

//         //     for(int j=0; j<n; j++){
//         //         if(arr[i]==arr[j]) count++;
//         //     }
//         //     if (count > n/2) return arr[i];
//         // }
//         // return -1;
//         Arrays.sort(arr);
//         int n = arr.length;
//         int freq = 1;
//         int ans = arr[0];

//         for (int i =0; i<n-1; i++){
//             if(arr[i]==arr[i-1]) freq++;
//             else{
//                 freq = 1;
//             }
//             if(freq > n/2) return arr[i];
//         }
//         return -1;
        
//     }
// }
class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}