
// public class twod {
//     public static boolean searching(int key,int arr[][]){
//         for (int i = 0; i < arr.length; i++){
//             for (int j = 0; j < arr[0].length; i++) {
//                 if(arr[i][j]==key){
//                     return true;
//                 }                
//             }
//         }
//         return false;


//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the row Size:");
//         int row=sc.nextInt();
//         System.out.print("Enter the col Size:");
//         int col=sc.nextInt();

//         // int[][]arr1={{2,2},{2,3}};
//         // int length=arr1.length;
//         // System.out.println("the length of arr1:"+length);


//         int [][] arr=new int [row][col];
//         System.out.println("Enter the Elements:");


//         for (int i = 0; i < row;  i++) {
//             for(int j=0; j< col; j++){
//                 arr [i][j]=sc.nextInt();
//             }
//         }

//         System.out.println("Array :");
//         for (int i = 0; i < row;  i++) {
//             for(int j=0; j< col; j++){
//                 System.out.print("[ "+arr[i][j]+" ]");
//             }
//             System.out.println();
//         }
        
//         System.out.println(searching(3, arr));

//     } }


// class twod{
//     public static void main(String[] args) {
//         int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
//         int highest=arr[0][0];

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(highest < arr[i][j]){
//                     highest=arr[i][j];
//                 }
//             }
//         }
//         System.out.println("highest element is"+highest );

//     }
// }

// class twod{
//     public static void main(String[] args) {
//         int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
//         int lowest=arr[0][0];

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(lowest > arr[i][j]){
//                     lowest=arr[i][j];
//                 }
//             }
//         }
//         System.out.println("lowest element is"+lowest );

//     }
// }

import java.util.Scanner;

public class twod{
    public static void main(String[] args) {
        int[][]arr=new int[3][3];
        Scanner sc=new Scanner(System.in);

        int max_count=-1;

        int row=0;

        for(int i=0;i<3;i++){
            int count=0;
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();

                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max_count){
            max_count=count;
            row=i+1;
            }
        }
        System.out.println("Biggest row:"+row);
    }
}