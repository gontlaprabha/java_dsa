
// public class loops {
//     public static void main(String[] args) {
//     for(int i=0; i<5;i++){
//         System.out.println("hi");
//     }
        
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//         int i=0;
//         while(i<4){
//             System.out.println("hi");
//             i++;
//         }
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//         int i=4;
//         do{
//             System.out.println("hi");
//         }
//         while(i<3);
//     }
// }


// import java.util.*;
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the no.of repeats:");
//         int a=sc.nextInt();
//         for(int i=0;i<a;i++){
//         System.out.println("apna college");

//         }
        
//     }
// }

// import java.util.*;
// class loops{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the number:");//5
//     int a=sc.nextInt(); 
//     System.out.println("the " + a +  " even numbers will be printed");
//     for(int i=2;i<=a*2;i+=2){ //5*2=10 2,4,6,8,10
//         System.out.println(i+"");
//     }
// sc.close();
        
//     }
// }


// import java.util.*;
// class loops{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int n=sc.nextInt();
//         while(num<=n){
//             System.out.print(num+"");
//             num++;
//         }
//     }
// }

// import java.util.*;
// class loops{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int n=sc.nextInt();
//         int count =0;
//         while(num<=n){
//             count+=num;
//             num++;
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;
// class loops{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int num=1;

        // for(int i=1;i<=n;i++){
        //     System.out.println("* * * * *");

        // }
    //     while(num<=n){
    //         System.out.println("* * * * *");
    //         num++;

    //     }
       
    //     }
    // }


    // import java.util.*;
    // class loops{
    //     public static void main(String[]args){
    //         Scanner sc=new Scanner(System.in);
    //         int n=sc.nextInt();
    //         // int count=0;

    //         // while(n!=0){
    //         //     int last=n%10;
    //         //     System.out.print(last+"");
    //         //     n=n/10;                
                
    //         // }
    //         do { 
    //             System.out.println(n);
    //             n++;
                
    //         } while (n<=10);
            
    //         }
    //     }
    

    // import java.util.*;
    // class loops{
    //     public static void main(String[]args){
    //         Scanner sc=new Scanner(System.in);
            
    //         do { 
    //             int n=sc.nextInt();
    //             if(n%10==0){
    //                 continue;
    //             }
    //             System.out.println("the num is"+n);             
    //         } while (true);
            
    //         }
    //     }
//     import java.util.*;
//     class loops{
//         public static void main(String[]args){
//             Scanner sc=new Scanner(System.in);
//             int num=sc.nextInt();
//             Boolean isprime=true;

//             for(int i=2;i<=num/2;i++){
//                 if(num % i ==0){ //
//                     isprime=false;
//             }
//         }
//         if(isprime){
//             System.out.println("prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//     }
// }
    class loops{
        public static void main(String[]args){
            int arr[]={1,2,3,4,5};
            int evensum=0;
            int oddsum=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    evensum+=arr[i];
                }
                else{
                    oddsum+=arr[i];
                }

            }
            System.out.println(evensum);
            System.out.println(oddsum);
    }
}



public class loops{
    public static void main(String[] args) {

    }
}
