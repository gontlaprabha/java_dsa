// public class oop{
//     public static void main(String[] args) {
//        student s1=new student();
//        s1.detail(1,"prabhas");
//         teacher t1=new teacher();
//         t1.name="prabhas";
//         t1.setid(1);
//         t1.getid();
//         System.out.println(t1.name);
//     }
// }

// class sum{
//     sum(int a,int b){
//      System.out.println(a+b);
//      }
//      sum(double a,double b){
//          System.out.println(a+b);
//      }
//      sum(byte a,byte b){
//         System.out.println(a+b);
//     }
//  }
// public class oop{
//     public static void main(String[]args){
//         sum s1=new sum(2.0, 3.0);
//         sum s2=new sum(2,3);
//     }



// public class oop{
//     public static void main(String[] args) {
//         // student s1=new student();
//         // s1.name="prabhas";
//         // s1.age=23;
//         // s1.details("prabhas",23);
//         // Bankaccount acc1=new Bankaccount();
//         // acc1.name="prabhas";
//         // acc1.setpassword(123);
//         // System.out.println(acc1.name+","+acc1.getpassword());
//         // Bankaccount acc1=new Bankaccount();
//         // Bankaccount acc2=new Bankaccount("prabhas");
//         // Bankaccount acc3=new Bankaccount("prabhas",12003092);   //constructor overloading
//         student s1=new student();
//         s1.name="prabhas";
//         s1.age=13;
//         s1.password=12345;
//         student s2=new student(s1);
//         s1.password=123;
//     }
// }

// class Bankaccount{
//     public int accno;
//     private int password;
//     protected String name;
//     public Bankaccount(){
//         System.out.println("constructor.....");
//     }
//     public Bankaccount(String name){
//         System.out.println("constructor with one parameter ");
//         System.out.println(name);
//     }
//     public Bankaccount(String name,int accno){
//         System.out.println(name+" and "+accno);
//     }
//     public int getpassword(){
//         return password;
//     }
//     public void setpassword(int newpassword){
//         password=newpassword;
//     }
// }
// class student{
//     String name;
//     float percentage;
//     int age;
//     int password;

//     public void calculatepercentage(int math,int phy,int chemistry){
//         percentage=(math+phy+chemistry)/3;
//         System.out.println(percentage);
//     }
//     public void details(String name,int age){
//        System.out.println(this.name=name); 
//        System.out.println(this.age=age);
//     }
// }
// class pen{
//     String color;
//     int tip;

//     public void settip(int newtip){
//         tip=newtip;

//     }
//     public void setcolor(String newcolor){
//         color=newcolor;
//     }
// }


// public class oop{
//     public static void main(String[] args) {
//         student s1=new student();
//         s1.name="prabhas";
//         s1.age=21;
//         s1.marks[0]=20;
//         s1.marks[1]=30;
//         s1.marks[2]=40;
//         student s2=new student(s1);
        
//     }
// }

// class student{
//     int age;
//     String name;
//     int password;
//     int marks[];
//     student(){
//         marks=new int[3];
//     }
//     student(student s1){
//         this.name=s1.name;
//         this.age=s1.age;
//         marks=new int[3];
//         for(int i=0;i<marks.length;i++){
//             System.out.println(this.marks[i]=s1.marks[i]);
//         }
//     }
// }

// public class oop{

//     public static void main(String[] args) {
//         fish tuna=new fish();
//         tuna.color="red";
//         tuna.eat();
//         tuna.breathe();
        
//     }
// }
// class animal{
//     String color;
//     public void eat(){
//         System.out.println("it eats");
//     }
//     public void breathe(){
//         System.out.println("breathe");
//     }
// }
// class fish extends animal{
//     int swins;
//     public void type(){
//         System.out.println("it's a fish");
//     }
//     public void swim(){
//         System.out.println("it swims in water");
//     }
// }


// public class oop{
//     public static void main(String[] args) {
//         horse h1=new horse();
//         h1.walk();
//         h1.legs();
//         h1.changecolor();

//         lion l=new lion();
//         l.walk();
//         l.legs();
//         l.changecolor();
//         }
// }
// abstract class animal{
//     String color;

//     animal(){
//         color="";
//         System.out.println(color);
        
//     }
//     abstract void walk();
//     void legs(){
//         System.out.println("differs from animal to animal");
//     }
// }
//  class horse extends animal{
//     void changecolor(){
//         color="brown";
//         System.out.println(color);
//     }
//     @Override
//     void legs(){
//         System.out.println("4 legs");
//     }
//     @Override
//     void walk(){
//         System.out.println("it walks buddy");

//     }
// }
//    class lion extends animal{

//     void changecolor(){
//         color="brown";
//         System.out.println(color);
//     }
//     @Override
//     void legs(){
//         System.out.println("4 legs but dangerous");
//     }
//     @Override
//     void walk(){
//         System.out.println("it walks buddy");
//     }
// }
// //constructor hirearcy
// //animal constructor --> horse constructor 

// public class oop{
//     public static void main(String[] args) {
//         Bear b1=new Bear();
//         b1.eatsveg();
//         b1.eatsnonveg();    
//     }
// }

// interface herbivore{
//     void eatsveg();
// }
// interface carnivore{
//     void eatsnonveg();
// } 
// class Bear implements herbivore,carnivore{
//     @Override
//     public void eatsveg(){
//         System.out.println("it eats veg");
//     }
//     @Override
//     public void eatsnonveg(){
//         System.out.println("it eats non-veg");
//     }


// }

// public class oop{
//     public static void main(String[] args) {
//         queen q1=new queen();
//         q1.moves();
//         king k1=new king();
//         k1.moves();
        
//     }
// }

// interface chess{
//     void moves();
// }
// class queen implements chess{
//     @Override
//     public void moves(){
//         System.out.println("moves up down diagonal right left");
//     }
// }
// class king implements chess{
//     @Override
//     public void moves(){
//         System.out.println("one step anyside");
//     }
// }

// public class oop{
//     public static void main(String[]args){
//         student s1=new student();
//         s1.name="prabhas";
//         s1.age=21;
//         s1.schoolname="sv";
//         s1.getdetails();
//         s1.marks(23,33,33);
//         student s2=new student();
//         s2.name="vignesh";
//         s2.age=23;
//         s2.getdetails();
//         System.out.println(s2.marks(0, 0, 0));
//     }
// }

// class student{
//     String name;
//     int age;
//     static String schoolname;
//     public void getdetails(){
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(schoolname);
//     }
//     public static int marks(int math,int phy,int chem){
//         return math+phy+chem/3;

//     }

// }


//class can't be private and protected because the properties are not assicble;


// public class oop{
//     class animal{
//         String name;
//         public void eat(){
//             System.out.println("it eats");
//         }
//     }
//     public static void main(String[] args) {
//         oop oops=new oop();
//         oop.animal animal=oops.new animal(); //outer.inner i_obj_name = o_obj_name.new i_obj_name
//         animal.name="cock";
//         System.out.println(animal.name);
//     }
// }

//
// interface{
//     methods-public,abstract 
//     variables-final,public,static
// }


// In Java, methods declared in an interface are implicitly public and abstract, 
// even if you do not explicitly specify the public keyword. 
// This means that any class implementing the interface must provide 
// implementations of these methods with the same visibility—i.e., public.

// interface mother{
//     void eyes();// void eyes ~~ public abstact void
//     void nose();
// }
// interface father{
//     void nose();
//     void eyes();
// }

// class Son implements mother,father{
//     public void eyes(){
//         System.out.println("mom eyes");
//     }
//     public void nose(){
//         System.out.println("dads nose");
//     }


    
// }
// public class oop{
//     public static void main(String[] args) {
//         Son s1=new Son();
//         s1.nose();
//         s1.eyes();

        
//     }
// }

// class amountbalance{
//     private int accountbalance;
    
//     public void getbalance(){
//         System.out.println(accountbalance);
//     }
//     public void setbalance(int accountbalance){
//         this.accountbalance=accountbalance;
//     }
//     void display(){
//         System.out.println("yeah it is displayed man");
//     }
//     void displayed(){
//         this.display();
//     }

// }

// public class oop{
//     public static void main(String[] args) {
//         amountbalance balance=new amountbalance();
//         // balance.setbalance(500000);
//         // balance.getbalance();
//         balance.displayed();

        
        
//     }
// }

// class student{
//     String Firstname;
//     String Lastname;

//     public student(String Firstname,String Lastname) {
//        System.out.println(this.Firstname=Firstname); 
//        System.out.println(this.Lastname=Lastname);
//     }

//     public student(student s1) {
//         System.out.println(this.Lastname=s1.Lastname);
//         System.out.println(this.Firstname=s1.Firstname);
//     }
    
// }
// public class oop{
//     public static void main(String[] args) { 
//         student s1=new student("Prabhas","Gontla");
//         student s2=new student(s1);


       
//     }
// }
// class a{
//     public a(){
//         super();
//         System.out.println("simple a constructor");
//     }
//     public a(int a){
//         super();
//         System.out.println("a constructor with one parameter");
//     }
// }
// class b extends a{
//     public b(){
//         super(5); //super(5)if you call the b with default constructor it will check the super of parent of parameterized constructor
//         System.out.println("simple b constructor");
//     }
//     public b(int m){
//         this();  //this(20) execute the constructor with parameter within the class
// //It refers to the constructor of the same class whose parameters matches with the parameters passed to this(parameters).
//         super(m); //if you call the b with int a parameter it will check the super and then execute parent default one 
//         System.out.println("b constructor with one parameter");
//     }
// }
// public class oop{
//     public static void main(String[] args) {
//         b b1=new b();
        
//     }
// }
// class Employee{
//     int id;
//     String name;
//     int salary;

//     public Employee(int id){
//         this.id=id;
//     }
//     public Employee(int id,String name){
//         this(id);
//         this.name=name;
//     }
//     public Employee(int id,String name,int salary){
//         this(id, name);
//         this.salary=salary;
//     }
//     public void print(){
//         System.out.println(id);
//         System.out.println(name);
//         System.out.println(salary);
//     }

// }
// public class oop{
//     public static void main(String[] args) {
//         Employee e1=new Employee(12,"prabhas",1234);
//         e1.print();

        
//     }
// }
// 
// class teacher{
//      int id;
//      static String haircolor;
// }
// public class oop{
//     public static void main(String[] args) {
//         teacher t1=new teacher();
//         t1.id=20;

//         teacher.haircolor="black";

//         System.out.println(teacher.haircolor+""+t1.id);
//     }
// }

//static method should have static variables it should not have instance variables why beacause the variables for every object will be different which variable should it print

// class mobile{
//  String color;
//  String brand;
//  static String screen;

//  public void show(){
//     System.out.println(color+""+brand+""+screen);
//  }
//  public static void show1(mobile obj){
//     System.out.println(obj.color+""+obj.brand+""+screen);

//  }
// }
// public class oop{
//     public static void main(String[] args) {

//         mobile mobile1=new mobile();
//         mobile1.brand="samsung";
//         mobile1.color="red";
//         mobile1.screen="black";

//         // mobile1.show1(); Accessing static method show1(hints(2): 532:17-532:22)

//         mobile1.show1(mobile1);
        
        
//     }
// }

// class parent1{
//     public void eyes(){
//         System.out.println("parent1 eyes");
//     }
// }
// interface parent2 {
//     void eyes();
// }

// class child extends parent1 implements parent2 {
//     @Override
//     public void eyes() {
//         super.eyes();
//         System.out.println("child eyes");
//     }
// }
// public class oop{
//     public static void main(String[] args) {
//         child c = new child();
//         c.eyes();
//     }

