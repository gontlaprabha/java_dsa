// public class prepinsta{
//     public static void revnum(int num){
//         int revnum=0;

//         while(num > 0 ){
//          int last=num%10;
//          revnum=revnum*10+last;
//          num=num/10;
      
//         }
//         System.out.println(revnum);
        
//     }
//     public static void main(String[] args) {
//         int num=1234;

//         revnum(num);

        
        
//     }
// }
public class prepinsta{
    public static int fibo(int a){
        if(a==0||a==1){
           return a;
        }
        return fibo(a-1)+fibo(a-2);
    }
  
    public static void main(String[] args) {
        
        

        
        
    }
}