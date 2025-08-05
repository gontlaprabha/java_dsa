class Rectangle{
    int length;
    int breadth;
    public void info(){
        System.out.println(length);
        System.out.println(breadth);
    }

}
public class copy{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=20;
        r1.breadth=10;


        Rectangle r2= r1; //shallow copy
        System.out.println(r2);
        System.out.println(":::::::::::::::::::::");
        r1.length=10;
        r1.breadth=30;

        // System.out.println(r1.length);
        // System.out.println(r1.breadth);
        // System.out.println("---------------------  r2");
        // // System.out.println(r2.length);
        // // System.out.println(r2.breadth);
         Rectangle r3=new Rectangle();
        r3.length=r1.length;
        r3.breadth=r1.breadth;
        System.out.println(r3.length);
        System.out.println(r3.breadth);
        System.out.println("--------------------------- r3");
        r1.length=20;
        r1.breadth=30;
        System.out.println(r1.length);
        System.out.println(r1.breadth);
        
        // System.out.println("------------------------------");
        // System.out.println(r3.length);
        // System.out.println(r3.breadth);


        
        
        
    }
}