// 

// interface p{
//     void show(int a);
// }
// class lamda {
//     public static void main(String[] args) {
//         p obj= a->{
//             System.out.println("interface p1 :"+a);  
//         };
//         obj.show(10);
//     }
// }


interface I{
    int add(int a,int b);
}
public class lamda{
    public static void main(String[] args) {
        //    I obj=new I() {
        //     @Override
        //     public int add(int a,int b){
        //       return a+b;
        //     }
        //    };
              
        
        // I obj=(int a,int b)->{
        //     return a+b;
        //   };
         
        I obj=(int a,int b)->a+b;

          int sum=obj.add(2, 3);
          System.out.println(sum);

        }
        
    }
