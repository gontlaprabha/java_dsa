
import java.util.Arrays;




// import java.util.Arrays;

// public class array{
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5,6};
//         int[]arr1={7,8,9,10,11};
        
//         int compare=Arrays.compare(arr,arr1);   //arr>arr1 = +ve  arr<arr1= -ve   arr == arr1 = 0;

//         System.out.println(compare);
//         System.out.println(Arrays.equals(arr,arr1));  //arr == arr1 true and arr != arr1 false
       
//     }
// }

// import java.util.Arrays;


// public class array{
//     public static void main(String[] args) {
//         int[]arr={5,4,3,2,1};
//         int left=0;
//         int right=arr.length;

//         while(left<right){ 
//             int temp=right;
//             right=left;
//             left=temp;
//             left++;
//             right--;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }
// public class array{
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6};
//         int arr1[] = {0, 9, 8, 7, 6};
//         int count = 0;
//         int dump[] = new int[arr.length];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr1.length; j++) {
//                 if (arr[i] == arr1[j]) { 
//                     dump[count++] = arr[i]; // store the matching element in dump
//                 } 
//             }
//         }
        
//         dump = Arrays.copyOf(dump, count);

//         System.out.println(Arrays.toString(dump));
//     }
// }

// public class array{
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5,6};
//         int[]arr1={7,8,9,10};

//         int[]sum=new int[arr.length+arr1.length];

//         for(int i=0;i<arr.length;i++){
//             sum[i]=arr[i];
//         }
//         for(int i=0;i<arr1.length;i++){
//             sum[arr.length+i]=arr1[i];
            
//         }

//         System.out.println(Arrays.toString(sum));
        
//     }
// }
// import java.util.Arrays;
// import java.util.Collections;

// public class array{

//     public static int minimum(int num, Integer[] arr) {
//         int count = 0;
//         int sum = 0;
        
//         Arrays.sort(arr, Collections.reverseOrder());
        
//         for (int value : arr) {
//             if (sum >= num) {
//                 break; 
//             }
//             sum += value;
//             count++;
//         }
        
//         return (sum >= num) ? count : -1; // Return -1 if it's impossible to reach the sum
//     }

//     public static void main(String[] args) {
//         Integer[] arr = {2, 4, 6, 8, 10}; 
//                 int num = 16;

//         int result = minimum(num, arr);
//         System.out.println("Minimum number of elements to sum to " + num + ": " + result);
//     }
// }


// public class array{
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5,6,7,8,9,10};
//         int count=0;

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]+arr[j] == 12){
//                    count++;
//                 }

//             }
//         }
//       System.out.println(count);

//     }
// }

// public class array{

//     public static void main(String[] args) {
//         String[]arr={"prabhas","vaibhav","sneha","vikram","kalyankrishna"};
//         for(int i=0;i<arr.length-1;i++){
//        for(int j=0;j<arr.length-1-i;j++){
//         if(arr[j].length()<arr[j+1].length()){
//             String temp=arr[j+1];
//             arr[j+1]=arr[j];
//             arr[j]=temp;
//         }

//        }

//     }
      
        
// }

// }

// public class array {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int maxSum = Integer.MIN_VALUE; 

//         for (int i = 0; i < arr.length; i++) {
//             int currentSum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 currentSum += arr[j]; 
//                 System.out.print("Subarray: ");
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println(" | Sum: " + currentSum);
            
//                 if (currentSum > maxSum) {
//                     maxSum = currentSum;
//                 }
//             }
//         }

//         // Print the maximum sum
//         System.out.println("Maximum sum of subarrays: " + maxSum);
    
//     }
// }


// public class array{
//     public static void main(String[] args) {
//         int arr[]={1,1,2,2,3,3,4,4,5,6,6};
//         HashSet<Integer>set=new HashSet<>();

//      for (int num:arr) {
//          set.add(num);
//      }

//      int[]arr1=new int[set.size()];
//      int index=0;
//      for(int num:set){
//         arr1[index++]=num;
//      }
//      System.out.println(Arrays.toString(arr1));

        
//     }
// }


// public class array {
//    public static void main(String[]args){
//     int[]arr={1,1,1,2,2,3,3,4,4,5,5};
//     int maxcount=0;
//     int count;
//     int freq_array_repeated = arr[0]; 

//      for(int i=0;i<arr.length;i++){
//         count=0;
//         for(int j=0;j<arr.length;j++){
//             if(arr[i]==arr[j]){
//                 count++;
//             }
//         }
//         if(count>maxcount){
//             maxcount=count;
//             freq_array_repeated=arr[i];

//         }
//      }
//      System.out.println(freq_array_repeated+":"+maxcount);
//    }
// }

// import java.util.HashMap;
// import java.util.Map;

// public class array{
//     public static void main(String[] args) {
//         HashMap<Integer,Integer>hm=new HashMap<>();

//         int[]arr={1,1,1,1,2,2,2,3,3,3,4,4,4};


//         for(int num:arr){
//             hm.put(num,hm.getOrDefault(num,0)+1);
//         }

//         for (Map.Entry<Integer,Integer>map :hm.entrySet()) {
//             System.out.println(map.getKey()+"-->"+map.getValue());
//         }
//     }
// }



// public class array{
//     public static void main(String[] args) {
//         int[]arr={-1,3,6,7,8,9};
//         int target=2;

//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){  
//                 if(arr[i]+arr[j]==target){
//                     System.out.println(arr[i]+","+arr[j]);
//                 }
//             }
//         }
//     }
// }

// import java.util.*;

// public class array{
//     public static boolean ispalindrome(int n){
//         int original = n;
//         int rev = 0;
//         while(n != 0){
//             int rem = n % 10;
//             rev = rev * 10 + rem;
//             n = n / 10;
//         }
//         return rev == original;
//     }

//     public static int Largestpalindrome(Integer[] arr, int size){
//              int max=-1;
             
//             for(int i=0;i<arr.length;i++){
//                 if(max<arr[i] && ispalindrome(arr[i])){
//                     max=arr[i];
//                 }
//             }
//             return max;
//         }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the size: ");
//         int len = sc.nextInt();
//         Integer[] arr = new Integer[len];
//         System.out.println("Enter the elements in array:");
//         for (int i = 0; i < len; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int result = Largestpalindrome(arr, len);
//         System.out.println("Largest palindrome: " + result);
//     }
// }
// arrays.fill(arr,fromindex,toindex,number)   or Arrays.fill(arr,number) 


// public class array{
//     public static void main(String[] args) {
//         int[]arr={1,-1,2,-2,3,-3,4,-4};
//         int[]res=new int[arr.length];
//         int index=0;

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<0){
//                 res[index++]=arr[i];
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>0){
//              res[index++]=arr[i];
//             }
//         }

        

//         System.out.println(Arrays.toString(res));
//     }
// }

// public class array{
//     public static void printrangearr(int[]arr,int k,int n){
        
//         for(int i=0;i<n;i+=k){
//             int left=i;
//             int right=Math.min(i+k-1,n-1);
//             int temp;
//             while(left<right){
//               temp=arr[right];
//               arr[right]=arr[left];
//               arr[left]=temp;
//               left++;
//               right--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5,6,7,8,9,10,11};
//         int k=3;
//         int n=arr.length;

//         printrangearr(arr, k, n);

//       for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//       }
//     }
// }




// public class array{
//     public static void printrangearr(int[]arr,int k,int n){
        
//         for(int i=0;i<n;i+=k){

//             int left=i;
//             int right=Math.min(i+k-1,n-1);
//             int temp;
//             while(left<=right){
//               temp=arr[right];
//               arr[right]=arr[left];
//               arr[left]=temp;
//               left++;
//               right--;
//             }
//         }
        

//     }
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5,6,7,8,9,10,11};
//         int k=3;
//         int n=arr.length;

//         printrangearr(arr, k, n);

//       for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//       }
//     }
// }

// public class array{
//     public static int[] twosum(int []arr,int target){
//           int left=0;
//           int right=arr.length-1;

//         while (left<right) {
//             int sum=arr[left]+arr[right];
//                 if(sum==target){
//                     return new int[]{left, right};
//                 }
//                 if (sum < target) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//             return new int[]{-1, -1};
//         }
    

//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5};

        
//     }
//     }



public class array{
    public static void main(String[] args) {
        int arr[]={1,1,1,0,1,0,1,1,0,0  }; 

        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(arr[left]==0){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));

        String str="prba";
        System.out.println(str.trim());
    }
}
