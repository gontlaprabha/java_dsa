
//     public static void main(String[] args) {
//         //getbit "and" "bitmask"
//         int n=5; //0101
//         int pos=2;
//         int bitMask=1<<pos;
//         if((bitMask & n)==0) {
//             System.out.println("bit was zero");
            
//         }
//         else{
//             System.out.println("bit was one");
//         }

        
//     }
// }

// public class bits {
//     public static void main(String[] args) {
//         //setbit  "and" "bitmask"
//         int n=6; //0110
//         int pos=1;
//         int bitMask=1<<pos;

//         int num = bitMask | n;
//         System.out.println(num);

// }
// }

// public class bits{
//     public static void main(String[]args){
//         int n=5; //0101
//         int pos=1;
//         int bitmask=1<<pos;
//         int newBitmask=~(bitmask);
//         int newnumber= newBitmask & n;
//         System.out.println(newnumber);

//     }
// }
// import java.util.Scanner;
// public class bits{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter zero for set or one for update bit:");
//         int operation =sc.nextInt(); //0=set 1=update
//         int n=5; //1010
//         int pos=1;
//         int bitmask=1<<pos;
//         if(operation == 0){
//             int newnumber = bitmask | n ;
//             System.out.println("Set bit of "+ n +" in " + pos + " is "+newnumber);

            
//         }
//         else{
//             int newBitmask = ~(bitmask);
//             int newnumber = newBitmask & n;
//             System.out.println("Set bit of "+ n + " in "+ pos +" is "+newnumber);

//         }

        
//     }
// }
// import java.util.*;
// public class bits{
//     public static boolean ispoweroftwo(int n){
//         if(n<=0){
//             return false;
//         }
//         return (n & (n-1)) == 0;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n=sc.nextInt();
//         System.out.println(ispoweroftwo(n));

        
//     }
// }
// import java.util.Scanner;
// public class bits{
//     public static void numtobinary(int num){
//         if(num == 0){
//             System.out.println("Binary is 0");
//             return;
//         }
//         String s="";

//         while(num > 0){  //16 
//             int remainder = num %2; //16%2 = 0 8%2=0 
//             s = remainder + s; // _ _ _ _ 0 ,_ _ _ 0 0 ,
//             num =num/2; //16/2 =8 ;8/2=4 ; 4/2=2; 2/2=1 ;1/2=
//                 }
//             System.out.println(s);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int binary=sc.nextInt();
//         System.out.print("Binary number of "+binary+":");
//         numtobinary(binary);


        
//     }
// }