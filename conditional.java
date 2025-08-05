
// public class conditional{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         double temp=sc.nextDouble();

//         if(temp>100.0){
//             System.out.println("too hot to handle");

//         }


   
//     }

// }


//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the age:");
//     int a= sc.nextInt();
//     if(a>18){
//         System.out.println("yes to vote");
//     }
//     else{
//         System.out.println("no to vote");

//     }
// sc.close();
//     }    
// }
// import java.util.*;
// public class conditional{ 
// public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the a:");
//     int a =sc.nextInt();
//     System.out.print("Enter the b");
//     int b=sc.nextInt();
//     System.out.println("1:addition 2.subtraction 3.multiplication 4.division");
//     int i=sc.nextInt();
//     switch(i){
//         case 1:
//         System.out.println("a+b:"+(a+b));
//         break;
//         case 2:
//         System.out.println("a-b:"+(a-b));
//         break; 
//         case 3:
//         System.out.println("a*b:"+(a*b));
//         break;
//         case 4:
//         System.out.println("a/b:"+(a/b));
//         break; 
//         default:
//         System.out.println("error");
//     }
// }
// }

//Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

// import java.util.*;
// public class conditional{
// public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the Number");
//     int a=sc.nextInt();
//     switch(a){
//         case 1 -> {
//             System.out.println("January");
//         }
//         case 2 -> {
//             System.out.println("febrary");
//         }
//         case 3 -> {
//             System.out.println("march");
//         }
//         case 4 -> {
//             System.out.println("april");
//         }
//         case 5 -> {
//             System.out.println("may");
//         }
//         case 6 -> {
//             System.out.println("June");
//         }
//         case 7 -> {
//             System.out.println("July");
//         }
//         case 8 -> {
//             System.out.println("augest");
//         }
//         case 9 -> {
//             System.out.println("september");
//         }
//         case 10 -> {
//             System.out.println("october");
//         }
//         case 11 -> {
//             System.out.println("november");

//         }
//         case 12 -> {
//             System.out.println("December");
//         }
//         default -> System.out.println("error");
        
//         }
//         sc.close();

//     }
// }


// public class conditional{
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5};
//         int sum=0;
//         for(int num:arr) {
//         sum=sum+num;
//         }
//         System.out.println(sum);
//     }
// }

// public class conditional{
//     public static boolean isprime(int n){
//         if(n<=1){
//             return false;
//         }

//        for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             return false;
//         }
//        }
//        return true;
//     }
//     public static void main(String[] args) {
//         boolean isprime = isprime(9);

//         if(isprime){
//             System.out.println("prime");
//         }
//         else{
//             System.out.println("not prime");
//         }

        
        
//     }
// }


// public class conditional{
//     public static void main(String[] args) {
//         int a=10;

//         if(a>5){
//             System.out.println("yes greater than 5");
//         }
//         if(a>9){
//             System.out.println("yes greater than 9");
//         }
//         else if(a>=10){
//             System.out.println("yes greater equal than 10 ");
//         }
//     }
// }