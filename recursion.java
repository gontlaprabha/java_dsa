// public class recursion{
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printnum(n-1);

//     }
//     public static void main(String[] args) {
        
//     }
// }

// public class recursion {
//     public static void printnum(int n){ //f(x)
//         if(n == 6){
//             return;
//         }
//         System.out.println(n);
//         printnum(n+1); //f(f(x))

//     }
//     public static void main(String[] args) {
//         int n=1;
//         printnum(n);
//     }
    
// }

// 
// public class recursion{
//     public static int factorial(int x){ //void-not return
//         if(x == 0){
//             return 1;
//         }
//         else{
//             return (x*factorial(x-1));
//         }

//     }

//     public static void main(String[] args) {
//         int fact=factorial(1);
//         System.out.println(fact);
//     }
// }

// public class recursion{
//     public static int sum(int n){
//         if(n == 0){ //base case if it is not there then it occurs halting condition 
//             return 0;
//         }
//         return n+sum(n-1);
//  }

//     public static void main(String[] args) {
//         int m= sum(7);
// System.out.println(m);        
//     }
// }


// public class recursion{
//     public static int printnum(int m,int n){
//         if(n>m){
//             return n+printnum(m, n-1);
//         }
//         return n;
//     }
    
    
//     public static void main(String[]args){
//         System.out.println(printnum(5, 10));

        

//     }
// }


// public class recursion{
//     public static void sum(int m,int n,int sum ){ //1,5,0
//         if(m==n){
//             sum+=m;
//             System.out.println(sum);
//             return;
//         }
//         sum=sum+m; //0+1 
//         sum(m+1,n,sum);
//         System.out.println(m);


//     }
//     public static void main(String[] args) {
//         sum(1, 5,0);
//     }
// }


//     public static void TowerofHanoi(int n ,String src,String help,String des){
//         if(n == 1){
//             System.out.println("Transfer disk "+n+" from "+src+" to "+des);
//             return;         
//         }
//         TowerofHanoi(n-1, src ,des,help);
//         System.out.println("Transfer disk "+n+" from "+src+" to "+des);
//         TowerofHanoi(n-1, help ,src, des);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter No.of disks:");
//         int num=sc.nextInt();

//         TowerofHanoi(num,"Source","Helper","Destination");
        
//     }
// }

// public class recursion{
//     public static void revstr(String str,int index){
//         if(index == 0){
//             System.out.println(str.charAt(0));
//             return;
//         }
//         System.out.print(str.charAt(index)+"");
//         revstr(str, index-1);


//     }
//     public static void main(String[] args) {
//         String str="abcd";
//         revstr(str, str.length()-1);        
//     }
// }

// public class recursion{
//     public static int fibo(int num){
//         if(num<=1){
//             return num;
//         }
//         return fibo(num-1)+fibo(num-2);
//     }
//     public static void main(String[] args) {
//         int freq=10;

//         for(int i=0;i<freq;i++){
//             System.out.print(fibo(i)+"");
//         }
          
        
//     }
// }


// public class recursion{
//     public static void  printnumdec(int num){
//         if(num==0){
//             return ;
//         }
//         System.out.print(num+" ");
//         printnumdec(num-1);

//     }
//     public static void main(String[] args) {
//        printnumdec(6);        
//     }
// }

// public class recursion{
//     public static void printnuminc(int num){
//         if(num==1){
//             System.out.println(1);
//             return;
//         }
//         printnuminc(num-1);
//         System.out.println(num);
//     }
//     public static void main(String[] args) {
//         printnuminc(5);
        
//     }
// }


// public class recursion{
//     public static int fact(int num){
//         if(num==0){
//             return 1;
//         }
//         int factorial=fact(num-1);
//         return num*factorial;
//     }
//     public static void main(String[] args) {
//        int fact=fact(3);
//        System.out.println(fact);        

//     }
// }


// public class recursion{
//     public static int sum(int num){
//         if(num==0){
//             return 0;
//         }
//         sum(num-1);
//         return num+sum(num-1);
//     }
//     public static void main(String[] args) {
//         int sum=sum(5);
//         System.out.println(sum);
        
//     }
// }

// public class recursion{
// public static int fibo(int num){
//     if(num==0||num==1){
//       return num;
//     }
//     int fi1=fibo(num-1);
//     int fi2=fibo(num-2);
//     return fi1+fi2;
//   }
//     public static void main(String[] args) {
//       int seq=10;
//       for(int i=0;i<=seq;i++){
//         System.out.print(fibo(i)+" ");
//       }
//   }
// }

// public class recursion{
//     public static boolean isprime(int num){
//         if(num<=1){
//             return false;
//         }
//         if(num==2){
//             return true;
//         }
//         for(int i=2;i<=num;i++){
//             if(num % i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void primerange(int num){
//         for(int i=2;i<=num;i++){
//             if(isprime(i)){
//                 System.out.println(i+"");
//             }
//         }
//     }

//     public static void main(String[] args){
//         primerange(20);
//     }
// }




