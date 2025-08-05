
import java.util.Arrays;


//     public static void printarr(int[]arr){
//       for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//       }
//     }
//     public static void main(String[] args) {
//         int []arr={8,3,4,1,7,7,5,2,6,5};

//         for (int i = 0; i < arr.length; i++) {
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]<arr[j+1]){
//                     //swap
//                     int temp=arr[j+1]; 
//                     arr[j+1]=arr[j];
//                     arr[j]=temp; 
//                 }
//             }
//         }
//         printarr(arr);
//         }

// }
//insertion sort
// public class sorting{
//     public static void printarr(int[]arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {

//         int[]arr={5,4,3,2,1};

//         for(int i=0;i<arr.length;i++){
//             int min=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[min]>arr[j]){
//                     min=j;
//             }
//         }
//         int temp=arr[min];
//         arr[min]=arr[i];
//         arr[i]=temp;

//         }
//         printarr(arr);
        
//     }
// }


//insertion sort    
// public class sorting{
//     public static void printarr(int[]arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {       
//         int[]arr={5,4,3,2,1};

//         for(int i=1;i<arr.length;i++){
//             int curr=arr[i];
//             int prev=i-1;

//             while(prev>=0 && arr[prev]>curr){
//                arr[prev+1]=arr[prev];
//                prev--;
//             }
//             arr[prev+1]=curr;
//        }
//        printarr(arr);
//     }
// }


public class sorting{
 public static void printarr(int[]arr){
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     } 
 }
 public static void mergesort(int[]arr,int start,int end){
    if(start>=end){
      return;
    }    
    int mid=start+(end-start)/2; 

    mergesort(arr,start,mid);
    mergesort(arr, mid+1, end);
    merge(arr, start,mid, end);
 }
 public static void merge(int[]arr,int start,int mid,int end){
      int temp[]=new int[end-start+1];
       int i=start;
       int j=mid+1;
       int k=0;

       while(i<=mid && j<=end){  
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];

        }
        else{
            temp[k++]=arr[j++];
        }
    }
        
        while(i<=mid){
          temp[k++]=arr[i++];
        }

        while(j<=end){
            temp[k++]=arr[j++];
        }

        for(k=0,i=start;k<temp.length;k++,i++){
              arr[i]=temp[k];
        }
        System.out.println(Arrays.toString(temp));


        
    
}
       
    public static void main(String[] args) {
       int[]arr={8,3,4,1,7,5};
       int start=0;
       int end=arr.length-1;
       mergesort(arr, start, end);
       
       
       
    }
}


// public class sorting{
//   public static void main(String[] args) {
//     int[]arr={23,56,74,40};
//     for(int i=0;i<arr.length;i++){
//       for(int j=0;j<arr.length-1-i;j++){
//         if(arr[j]%10>arr[j+1]%10){
//           int temp=arr[j+1];
//           arr[j+1]=arr[j];
//           arr[j]=temp;
//         }
//       }
//     }
//     System.out.println(Arrays.toString(arr));
//   }
// }

// import java.util.Arrays;

// class sorting{
  
//   public static void main(String[] args) {
//       int[]arr={8,3,4,1,7,7,5,2,6,5};
      
//       for(int i=0;i<arr.length;i++){
//           int smallest=i;
//           for(int j=i+1;j<arr.length;j++){
//               if(arr[j]>arr[smallest]){
//                   smallest=j;
//               }
//           }
//           int temp=arr[smallest];
//           arr[smallest]=arr[i];
//           arr[i]=temp;
//       }
      
//       System.out.println(Arrays.toString(arr));
      
      
//   }
// }


