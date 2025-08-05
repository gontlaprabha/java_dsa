
//public class strings{
//public static void main(String[]args){

//         String firstname="Tony";
//         String lastname="Tony";
//         String fullname= firstname+lastname;
//         System.out.println(fullname.length());
//         for(int i=0;i<fullname.length();i++){
//             System.out.println(fullname.charAt(i));
//         }
//         //1)s1>s2 = +ve
//         //2)s1==s2 =0
//         //3)s1<s2 = -ve
//         if(firstname.compareTo(lastname)==0){
//             System.out.println("equal");

//         }
//         else{
//             System.out.println("not equal");
//         }
//         String s="pitapuram taluka";
//         String sub =s.substring(0,7); //n, n-1
//         String str1 = "Hello";
//         String str2 = "Hello";
//         String str3 = new String("Hello");
        
//         System.out.println(str1 == str2); // true (both refer to the same string literal)
//         System.out.println(str1 == str3); // false (different memory locations)
//         System.out.println(str1.equals(str2)); // true (content is the same)
//         System.out.println(str1.equals(str3)); // true (content is the same)    



        

    // }
    // }
    
// public class strings{
//     public static void main(String[] args) {
//         //String sb="tony";
//         StringBuilder sb=new StringBuilder();
//         StringBuilder sb=new StringBuilder("ponny");
//         System.out.println(sb);
//         System.out.println(sb.charAt(0));
//         //setCharAt(indexnumber,"replacing character')
//         sb.setCharAt(0,'B'); //""=string,''=char
//         System.out.println(sb);
//         sb.insert(1,"i");
//         System.out.println(sb);
//         sb.delete(1,5 ); //sb.delete(n,n-1)
//         System.out.println(sb);
//         sb.append("e");
//         System.out.println(sb);
//         System.out.println(sb.length());        
//     }
// }
// public class strings{
//     public static void main(String[] args) {
//         StringBuilder sb=new StringBuilder("prabhas");
//         for(int i=0;i<sb.length()/2;i++){
//             int front=i;
//             int back=sb.length()-i-1;//7-0-1 =6 
//             char frontch =sb.charAt(front); //sb.charAt(0,1,2....)
//             char backch=sb.charAt(back);
//             sb.setCharAt(front,backch); //sb.charAt(0,1);
//             sb.setCharAt(back, frontch);//
            
//             System.out.println(sb); 

             
//         }
//     }
// }





// import java.util.*;
// public class strings{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the name:");
//         String s=sc.nextLine();
//         int vowel=0;
//         int consonant=0;
//         s=s.toLowerCase();
//         for(int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             if(c =='a'||c =='e'||c =='i'||c =='o'||c =='u'){
//                 vowel++;
//             }
//             else if (c>='a' && c<='z' ) { //b,c,d............x,y,z
//                 consonant++;
//             }
//         }
//         System.out.println("Vowel count :"+vowel);
//         System.out.println("Consonant Count:"+consonant );       
//     }
// }
//Apple to aPPLE
// import java.util.*;
// public class strings{
//     public static String toggler(String name){
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<name.length();i++){
//             char ch= name.charAt(i);
//             if(Character.isUpperCase(ch)){ //if it is upper case 
//                 sb.append(Character.toLowerCase(ch)); //Character.toUppercase(ch) for changing                                                                           //  and Character.isUppercase(ch) for confirming
//             }
//             else if(Character.isLowerCase(ch)){
//                 sb.append(Character.toUpperCase(ch));
//             }
//             else{
//                 sb.append(ch);
//             }

//         }
//         return res.toString();

    
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the String");
//         String name=sc.next();
//         System.out.println(toggler(name));
        
//     }
// }

// public class strings{
//     public static int counting(int num){
//         int count=0;
//         if(num<0){
//             num=-num;
//         }
//         else if(num==0){
//             return 1;
//         }
//Suppose num = 12345:
// First iteration:
// num = 12345 / 10 = 1234
// count = 1
// Second iteration:
// num = 1234 / 10 = 123
// count = 2
// Third iteration:
// num = 123 / 10 = 12
// count = 3
// Fourth iteration:
// num = 12 / 10 = 1
// count = 4
// Fifth iteration:
// num = 1 / 10 = 0
// count = 5
//while(num(0)!=0) false
        // while(num!=0){
        //     num/=10;
        //     count++;
        //  }
        // return count; 
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int count=sc.nextInt();
//         System.out.println("The no.of digits in number:"+counting(count));
        
//     }
    
// }
// import java.util.*;
// public class strings{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String text=sc.nextLine();
//         String name=sc.nextLine();
//         int count=0;
//         int index=0;
//         while((index=text.indexOf(name,index))!=-1){
//             count++;
//             index+=name.length();

//         } 
//         System.out.println("The occurence of the name:"+count);
        
//     }
//}
// import java.util.*;
// public class strings{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the string:");
//         String str=sc.nextLine();
//         int count=0;
//        for(int i=0;i<str.length();i++){
//         if(str.charAt(i) !=' '){
            
//         } else {
//             count++;
//             }
//        }
//        System.out.println("No.of characters in string:"+count);
// }
// }

//anagrams
// public class strings{
//     public static boolean anagramscheck(String ch1,String ch2){
//         char[]chararr1=ch1.toCharArray();
//         char[]chararr2=ch2.toCharArray();
//         Arrays.sort(chararr1);
//         Arrays.sort(chararr2);
//         return Arrays.equals(chararr1,chararr2);

//     }
//     public static void main(String[] args) {
//         String s1="prabhas";
//         String s2="sabhrap";
//         if(anagramscheck(s1, s2)){
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         }

        
//     }
// }
// public class strings{
//     public static void main(String[] args) {
//         String name="123";
//         int num=Integer.parseInt(name);
//         System.out.println(num);
//         int num1=123;
//         String name1=Integer.toString(num1);
//         System.out.println(name1);

//     }
// }
// public class strings{
//     public static void main(String[] args) {
//         String s1="prabhas";
//         String s2=new String("prabhas");
//         String s3="prabhas";
//         // String sub=s1.substring(0,5);
//         // System.out.println(s1);
//         int num=33;
//         String numString=Integer.toString(num); 

//         System.out.println(s1==s3);
//         // Boolean equal=s1.equals(s2);
//         // System.out.println(equal);


//     }}
// public class strings{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the string:");
//         String str=sc.next();  //aaabbbccc  
//         String newstr="";    

//         for(int i=0;i<str.length();i++){
//            int count=1;

//            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//             count++;
//             i++;
//            }

//            newstr+=str.charAt(i);
//            if(count>1){
//             newstr+=Integer.toString(count);
//            }
//         }
//         System.out.println(newstr);
// //     }}
       

// public class strings{
//     public static void main(String[] args) {
//         String name="prabhas";
//         char ch=name.charAt(0);
//         String subString=name.substring(0,2);// 
//         String sen="prabhas are the handsome";
//         String change=sen.replace("are","is"); //"a" and "s" also
//         if(name.contains(sen)){
//             System.out.println("yes it is");
//         }
//     }
// }

// public class strings{
//     public static void main(String[] args) {
//         String name="prabhas";
//         String rev="";

//         for(int i=0;i<name.length();i++){
//             rev=name.charAt(i)+rev;
//         }
//         System.out.println(rev);
//     }
// }


// public class strings{
//     public static void main(String[] args) {
//         int num=1234;
//         int revnum=0;
  
//         // while(num!=0){
//         //     int remainder=num%10;//1234 1234%10=4 123%10=3 12%10=2 1%10=1;
//         //     revnum=revnum*10+remainder; //4 4*10+3=43  43*10+2=432 432*10+1=4321
//         //     num=num/10; //1234-->123-->12-->1
             
            
//         // }

//         for(;num!=0;num=num/10){
//             int remainder=num%10;
//             revnum=revnum*10+remainder;
//         }
//         System.out.println(revnum);

//     }
// }


// public class strings{
//     public static float getdist(String route){
//         int x=0;
//         int y=0;
//         for(int i=0;i<route.length();i++){
//             char ch=route.charAt(i);
//             if(ch == 'N'){
//              x++;
//             }
//             else if(ch =='S'){
//              x--;
//             }
//             else if(ch =='W'){
//              y--;
//             }
//             else if(ch =='E'){
//                 y++;
//             }

//         }
//         int X=x*x;
//         int Y=y*y;
//        return (float)Math.sqrt(X+Y);
//     }
//     public static void main(String[] args) {
//         float dist=getdist("NSEWESNSWENSWNESWE");
//   System.out.println(dist);

        
//     }
// }

// public class strings{
//     public static boolean ordered(int[]arr){
//         int n=arr.length;
//         if(n==0){
//             return true;
//         }

//         for(int i=1;i<arr.length;i++){ 
//             return arr[i]<arr[i-1];  
//         }  
//         return false;
//     }
//     public static void main(String[] args) {
//         int[]arr={1,2,8,7,1,6};

//         if(ordered(arr)){
//             System.out.println("Yes it is ordered");
//         }
//         else{
//             System.out.println("No");
//         }
    
        
//     }
// }


// public class strings{
//     public static void main(String[] args) {
//         String[]words={"prabhas","sreedevi","raghu"};
//         String largest=words[0];

//         for(int i=0;i<words.length;i++){
//             if(largest.compareTo(words[i])<0){
//                 largest=words[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }

// import java.util.*;
// class strings {
//     public static String numstring(String str){
//         String result="";
//         char ch[]=str.toCharArray();
//         for(int i=0;i<str.length();i++){
//             if(Character.isDigit(ch[i])){
//                 result=result+ch[i];
//             }
//         } 
//         return result;
//     }
//     public static void main(String[] args) { 
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
        
//         System.out.println(numstring(str));
//             }
//         }


// public class strings{
//     public static void main(String[] args) {
//         String str="Prabhas123 is a boy";
//         String digit="";
        
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);

//             if(Character.isUpperCase(ch)){
//                  digit=digit+ch;
//             }
//         }
//         System.out.println(digit);

//     }
// }

//Character.isUpperCase and isLowerCase .isDigit .isLetterorDigit .isWhiteshape


// import java.util.*;
// public class strings{
//     public static String revsentence(String str){
//          String[]string=str.split(" ");
//          StringBuilder sb=new StringBuilder();

//          for(int i=string.length-1;i>=0;i--){
//             sb.append(string[i]).append(" ");

//          }
//          return sb.toString();
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a sentence: ");
//         String str=sc.nextLine();
//         System.out.println(revsentence(str));

        
//     }
// }

// public class strings{
//     public static void main(String[] args) {
//         int count=0;
//         String str="#$%^&prabh123as";
//         String result="";

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)){
//                 result=result+ch;
//                 count++;
//             }
//         }
//         System.out.println(result);
//         System.out.println(count);
        
//     }
// }

// 

// public class strings{
//     public static String deString(String ch,int m){
//         return ch.substring(0,m)+ch.substring(m+1);

//     }
//     public static void main(String[] args) {
//         String str=deString("prabhas",0);
//         System.out.println(str);
//     }
// }


// public class strings{
//     public static String prefixString(String[]arr){
//     StringBuilder res=new StringBuilder();
//       char fir[]=arr[0].toCharArray();
//       char las[]=arr[arr.length-1].toCharArray();

//       for(int i=0;i<fir.length;i++){
//         if(fir[i] !=las[i]){
//             break;
//         }
//         res.append(fir[i]);
        
//       }
//       return res.toString();

//     }
//     public static void main(String[] args) {
//         String[]arr={"prabhas","praneeth","pranusha"};

//         String s=prefixString(arr);

//         System.out.println(s);
//     }
// }


