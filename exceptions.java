// class exception extends Exception {
//     public exception(String s){
//         super(s);
//     }
// }
//     public class exceptions{
//     public static void main(String[] args) {
//         try {
//             throw new exception("1");
//         } catch (exception e) {
//             System.out.println(e.getMessage());

//         }

        
//     }
    
// }


//checked exception these are should checked in compile time only.....



// import java.util.Scanner;
// public class exceptions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age");
//         int age = sc.nextInt();
//         try {
//             if(age<0){
//                 throw new ArithmeticException("age should not be negative");
//             }
            
//         } catch (ArithmeticException e) {
//             System.out.println(e);
//         }
//     }
// }

// public class exceptions{
//     public static int divide(int a, int b) throws ArithmeticException
//     {
//         int t = a/b;
//         return t;
//     }
//         public static void main(String[] args) {
//             int a=10;
//             int b=0;

//             int k=divide(a, b);

//             System.out.println(k);

//         }
//     }
//example for sql exception
// import java.sql.*;
// public class exceptions{
//     public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
//             Statement stmt = con.createStatement();
//             ResultSet rs = stmt.executeQuery("select * from student");
//             while(rs.next()){
//                 System.out.println(rs.getInt(1)+" "+rs.getString(2));
//             }
//             con.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//
//     }

class ageexception extends Exception{
    public ageexception(String age){
        super(age);
    }
}
public class exceptions{
    public static void main(String[] args) {
        int age=-4;

        try {
            if(age<0){
                throw new ageexception("age can't be negative");
            }
            
        } catch (ageexception e) {
            System.out.println(e.getMessage());
        }
        
    }
}