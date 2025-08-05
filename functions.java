//import java.util.Arrays;

//     public static boolean iseven(int num){
//         if(num%2==0){
//             return true;
//         }
//         return false;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         System.out.println(iseven(num));      
//     }
// }
// class functions{
//     public static int product(int a,int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int product=product(a,b);
//         System.out.println(product);        
//     }
// }
//passing arrays as arguments to the function if we change the array in that function it reflects on main function array
// class functions{
//     public static void swap(int a,int b){
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println("-----------------");
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println("---------------------");
//         swap(a, b);             
//     }
// }
// class functions{
//     public static int  fact(int num){
//         int fact=1;
//         for(int i=1;i<=num;i++){
//             fact*=i;
//         }
//         return fact;
//     }
//     public static int binocoeff(int n,int r){
//        int fact_n= fact(n);
//        int fact_r=fact(r);
//        int fact_nmr=fact(n-r);
//        int result =fact_n/(fact_r*fact_nmr);
//        return result;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         // int a=sc.nextInt();
//         // System.out.println(fact(a));
//         System.out.println(binocoeff(5, 5));       
//     }
// }
// import java.util.*;
// class functions{
//     public static int multiply(int a,int b){
//         return a*b;
//     }
//     public static float multiply(float a,float b,float c){
//         return a*b*c;
//     }

//     public static boolean prime(int num){
//         for(int i=2;i<=num/2;i++){
//             if(num%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int num= sc.nextInt();
//         for (int i = 2; i <= num; i++) {
//             if(num%i==0){}     
//         }
//     }
// }



// class functions{
//     public static void main(String[] args) {
//         int a=-25;
//         int b=16;
//         int max=Math.max(a, b);
//         System.out.println(max);
//         float abs=Math.abs(a);
//         System.out.println(abs);
//         int min=Math.min(a, b);
//         System.out.println(min);
        
//         int sqrt=(int)Math.sqrt(b);
//         System.out.println(sqrt);
//         //int average=Math.avg(a);

//     }
// }

// class functions{
//     public static int largest(int arr[]){
//         int large=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>large){
//                 large=arr[i];
//             }
//         }
//         return large;

//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7};

//         int largest=largest(arr);

//         System.out.print(largest);

        
//     }
// }


// class functions{
//     public static void revarray(int arr[]){
//         int left=0;
//         int right=arr.length-1;
//         while(left<right){
//             int temp=arr[right];
//             right=left;
//             left=temp;
//             left++;
//             right--;
//         }


//     }
//     public static void main(String[] args) {
//         int arr[]={6,5,4,3,2,1};
//         revarray(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+"");
            
//         }
//     }
// }
