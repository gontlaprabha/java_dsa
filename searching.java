
// public class searching {
//     public static int linear(int arr[],int x){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size: ");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.print("Enter the array elements:");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Array:");
//         for (int i = 0; i< size; i++) {
//             System.out.println(arr[i]+"");
//         }     
//         System.out.print("Enter the element:");
//         int x= sc.nextInt();

//         int res=linear(arr, x);
//         if(res== -1){
//             System.out.println("Not Found");
//         }
//         else{
//             System.out.println("Found");
//         }
//         }      
//         }

//Recursive 

// import java.util.Scanner;

// public class searching{
//     public static int binary(int arr[],int left,int right,int num){
//         if(left<=right){
//             int mid=(left+right)/2;

//         if(num==arr[mid]){
//             return mid;
//         }

//         if(num>arr[mid]){
//             return binary(arr,mid+1,right, num);
//         }

//         if(num<arr[mid]){
//             return binary(arr,left,mid-1,num);
//         }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8};
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int binary=binary(arr,0,arr.length-1,num);

//         if(binary == -1){
//             System.out.println("no the number is not there ");
//         }
//         else{
//             System.out.println("num is there "+num);
//         }
//     } 
// }


 
    
public class searching{
    public static void main(String[] args) {
        String str="prabhas";
        System.out.println(str.matches("[a-z]"));

        

    }
}


    
    
