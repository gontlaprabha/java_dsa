
import java.util.HashMap;

// import java.util.HashMap;

//  public class problems{
//     public static void main(String[] args) {
//         int arr[]={1,0,2,0,3,0,4,0,5,0,6,0,7,0};

//         int count=0;

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]!=0){
//             arr[count++]=arr[i];
//             }
//         }
//         while(count<arr.length){
//             arr[count++]=0;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

public class problems{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,4,4,5,6,6,7};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        System.out.println(hm);

        int mostRepeated = arr[0];
        int maxCount = 0;
        for (int key : hm.keySet()) {
            if (hm.get(key) > maxCount) {
                maxCount = hm.get(key);
                mostRepeated = key;
            }
        }
        System.out.println("Most repeated number: " + mostRepeated + " (Count: " + maxCount + ")");
}
    }





//Find the longest word in the string
// public class problems{
//     public static void main(String[] args) {
//         String str="Hi this is prabhas gontla";
//         String[]arr=str.split(" ");
//         String largString=arr[0];

//         for(String a:arr){
//             if(a.length()>largString.length()){
//                 largString=a;
//             }

//         }    
//         System.out.println("The largest word:"+largString);
//     }
// }


// An integer array nums and an integer target. nums = [10, 15, 3, 7], target = 17

// public class problems{
//     public static int[] search(int arr[],int target){
//        for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//               if(arr[i]+arr[j]==target){
//                 return new int[]{i,j};
//               }
//         }
//        }
//        return null;
//     }
//     public static void main(String[] args) {
//         int arr[]={10,15,3,7};
//         int target=17;
//         int[] searcher = search(arr, target);
//         if (searcher != null) {
//             System.out.println(Arrays.toString(searcher));
//         } else {
//             System.out.println("No pair found");
//         }
        
//     }
// }

// Remove Duplicate Emails
// Story: Your company email list has duplicate addresses. Clean it up to keep only unique emails.

// Problem: Given a sorted array emails, remove duplicates in-place and return the count of unique emails.

// import java.util.HashSet;
// public class problems{
//     public static int removeduplicates(int[]emails){
//         HashSet<Integer>set=new HashSet<>();
        

//         for(int mails : emails){
//             set.add(mails);
//         }
//          return set.size();
//     }
//     public static void main(String[] args) {

//         int[]arr={1,1,2,3,3,4};

//         int dups=removeduplicates(arr);
//         System.out.println(dups);
        
//     }
// }




// Problem Statement

// Given a string s, reverse it and return the reversed string.

// Input format

// Input: A single string s (e.g., "hello").
// Output format

// Output: The reversed string. eg: olleh
// public class problems{
//     public static String reverse(String name){
//         String s="";
//         for(int i=0;i<name.length();i++){
//             char ch=name.charAt(i);
//             s=ch+s;
//         }
//         return s;

        
//     }
//     public static void main(String[] args) {
//         String name="prabhas";
        
//         String res=reverse(name);
//         System.out.println(res);
        
//     }
// }


// Two friends are combining their music playlists into one sorted playlist. Help them merge the two sorted playlists.

// Problem: Given two sorted arrays arr1 and arr2, merge them into one sorted array.

// Input format

// Two sorted arrays arr1 and arr2. arr1 = [1, 3, 5], arr2 = [2, 4, 6]
// Output format

// A single sorted array. [1, 2, 3, 4, 5, 6]


// import java.util.Arrays;

// public class problems{
//     public static int[] sort(int[] arr1, int[] arr2){
//         int[] arr = new int[arr1.length + arr2.length];
//         int i = 0, j = 0, k = 0;

//         while (i < arr1.length && j < arr2.length) {
//             if (arr1[i] < arr2[j]) {
//                 arr[k++] = arr1[i++];
//             } else {
//                 arr[k++] = arr2[j++];
//             }
//         }

//         while (i < arr1.length) {
//             arr[k++] = arr1[i++];
//         }

//         while (j < arr2.length) {
//             arr[k++] = arr2[j++];
//         }

//         return arr;
//     }

//     public static void main(String[] args) {
//         int[] arr2 = {1, 3, 5};
//         int[] arr1 = {2, 4, 6};
//         int[] mergedArray = sort(arr1, arr2);
//         System.out.println(Arrays.toString(mergedArray));
//     }
// }



// Rank the Contestants

// Story: You are managing a contest. Find the kth largest score among the contestants.

// Problem: Given an unsorted array nums and an integer k, return the kth largest element.

// Input format

// An integer array nums and an integer k.

// nums = [3, 2, 1, 5, 6, 4], k = 2  



// Output format

// The kth largest element.

// 5  
// import java.util.*;
// public class problems{
//     public static int kthlargest(Integer[] arr, int k){
//         Arrays.sort(arr, Collections.reverseOrder());
//         System.out.println("Sorted Array:"+Arrays.toString(arr));
    
//         for(int i=1;i<=arr.length;i++){
//             if(i==k){
//                 return arr[i-1];
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Integer[] arr = {5, 2, 3, 1, 9};

//         int k=6;
//         int kth=kthlargest(arr, k);
//          if(kth==-1){
//          System.out.println("Exceed the limit");
//         }
//     else{
//         System.out.println(kth);
//     }
        
//     }
// }


// Story: You are an airport manager, and one boarding pass number among 1 to n is missing. Help identify the missing pass number.

// Problem: You are given an array arr of size nn -1, containing distinct numbers from 1 to n. Find the missing number.

// public class problems{
//     public static void main(String[] args) {
//         String name="prABhas";
//         StringBuilder sb=new StringBuilder();
        
//         for(int i=0;i<name.length();i++){
//             char ch=name.charAt(i);
//             if(Character.isLowerCase(ch)){
//                 sb.append(Character.toUpperCase(ch));

//             }
//             else{
//                 Character.toLowerCase(ch);
//                 sb.append(Character.toLowerCase(ch));

//             }
//         }
//         System.out.println(sb);

//     }
// }
// import java.util.*;
// public class problems{
//     public static void main(String[] args) {
//         int[]arr={0,0,1,0,1};   

//         int left=0;
//         int right=arr.length-1;

//         while(left<=right){
//            if(arr[left]==1 && arr[right]==0){
//             int temp=arr[right];
//             arr[right]=arr[left];
//             arr[left]=temp;
//             left++;
//             right--;
//            }
//            if(arr[left]==0){
//             left++;
//            }
//            if(arr[right]==1){
//             right--;
//            }
//         }
//         System.out.println(Arrays.toString(arr));


//     }
// }
//     public static void main(String[] args) {
//       int[]arr1={1,3,5};
//       int[]arr2={6,7,8};

//       int[]arr3=new int[arr1.length+arr2.length];
        
//       int i = 0, j = 0, k = 0;

//       while(i<arr1.length && j<arr2.length){
//         if(arr1[i]<arr2[j]){
//             arr3[k++]=arr1[i++];
//         } 
//         else{
//             arr3[k++]=arr2[j++];
//         }
//       }

//       while(i<arr1.length){
//         arr3[k++]=arr1[i++];
//       }

//       while(j<arr2.length){
//         arr3[k++]=arr2[j++];
//       }

//       System.out.println(Arrays.toString(arr3));
//     }
// }



//rotation of array


// public class problems{
//   public static void krotation(int[]arr,int k){
//         int[]res=new int[arr.length];
//         int index=0;

//         for(int i=k;i<arr.length;i++){
//           res[index++]=arr[i];
//         }

//         for(int i=0;i<k;i++){
//           res[index++]=arr[i];
//         }
//         System.out.println(Arrays.toString(res));
//   }
//   public static void main(String[] args) {
//     int[]arr={1,2,3,4,5}; 
//     int k=2;

//     krotation(arr, k);
  

//   }
// }


// public class problems{
//     public static boolean isprime(int num){
       
//         if (num==0 || num==1) {
//             return false;
//         }
        
//         if(num==2){
//             return true;
//         }

//         for(int i=2;i<=Math.sqrt(num);i++){
//             if(num % i  == 0){
//                 return false;
//             }   
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int sum=0;

//         for(int i=2;i<=10;i++){
//           if(isprime(i)){
//             sum+=i;
//           }
//         }
//         System.out.println(sum);
//     }
// }


// class problems {
//     public static Boolean ispalin(String s){
//         int left=0;
//         int right=s.length()-1;
        
//         while(left<right){
//             if(s.charAt(left)!=s.charAt(right)){
//                 left++;
//                 right--;
//             }
//             return false;
//     }
//     return true;

//     }
//     public static void main(String[] args) {
//         String s="papa";
        
//         if(ispalin(s)){
//             System.out.println("Yes it is Palindrome");
//         }
//         else{
//             System.out.println("No it is not a Palindrome");
//         }
        
        
//         }
//     }

 

// class Main{
    //     public static boolean issorted(int[]arr){
    //         for(int i=0;i<=arr.length-2;i++){
    //             if(!(arr[i]<arr[i+1])){
    //                 return false;
    //             }
    //         }
    //         return true;
    //     }
    //     public static void main(String[]args){
    //         int[]arr={1,2,3,4,0};
            
    //         if(issorted(arr)){
    //             System.out.println("It is sorted");
    //         }
    //         else{
    //             System.out.println("It is not sorted");
    //         }
            
            
    //     }
    // }

// import java.util.HashMap;

// public class problems{
//     public static void main(String[] args) {
//          int[]arr={1,1,2,2,3,1,2};

//          HashMap<Integer,Integer>map=new HashMap<>(); 

//          for(int num:arr){
//             map.put(num,map.getOrDefault(num,0)+1);
//          }

//          System.out.println(map);
 
          

//     }
// }




// public class problems{
//     public static class Node{
//           String data;
//           Node next;

//         public Node(String data) {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node Head;
//     public static Node Tail;
//     public static int size;


//     public void addFirst(String data){
//         Node newnode=new Node(data);
//             if(Head==null){
//                 Head=newnode;
//                 return;
//             }
//            newnode.next=Head;
//            Head=newnode; 
            
//     }

//     public void addLast(String data){
//         Node newnode=new Node(data);
//         if(Tail==null){
//             Tail=newnode;
//             return;
//         }

//         Tail.next=newnode;
//         Tail=newnode;
//     }


//     public void print(){
//         Node curr=Head;

//         while(curr!=null){
//            System.out.print(curr.data+"-->");
//            curr=curr.next;
//         }
//        System.out.print("Null");
//     }
//     public static void main(String[] args) {
//         problems ll=new problems();
//         ll.addFirst("Prabhas");
//         ll.addFirst("Gontla");
//         ll.addLast("is");

//         ll.print();
        
//     }
// }


// Repeated Coding Problems on Strings

// 1. Check if a given string is palindrome or not
// 2. Count the occurrence of a character in string
// 3. Count word in string
// 4. Reverse each word in string
// 5. Count number of vowels, consonants, spaces in String
// 6. Find the ASCII value of a character
// 7. Remove all vowels from the string
// 8. Remove spaces from a string
// 9. Remove characters from a string except alphabets
// 10. Reverse a String
// 11. Remove brackets from an algebraic expression
// 12. Sum of the numbers in a String
// 13. Capitalize first and last character of each word
// 14. Calculate frequency of characters in a string
// 15. Find Non-repeating characters of a String
// 16. Check if two strings are anagram of each other
// 17. Count common sub-sequence in two strings
// 18. Check if two strings match where one string contains wildcard
// characters
// 19. Return maximum occurring character in the input string
// 20. Remove all duplicates from the input string.
// 21. Print all the duplicates in the input string.
// 22. How to read data from the text file
// 23. How to write data into text file
// 24. Convert a string to uppercase and lowercase
// 25. Check if a string contains only digits
// 26. Count the number of uppercase and lowercase letters in a string
// 27. Toggle case of each character in a string
// 28. Check if a string is a pangram (contains all 26 letters)
// 29. Check if a string starts and ends with the same character
// 30. Count how many times a substring appears in a string





// public class problems{
//     public static boolean pal(String str){
//         StringBuilder sb = new StringBuilder();
        
//         for(int i=str.length()-1;i>=0;i--){
//             sb.append(str.charAt(i));
//         }
//         return sb.toString().equals(str);
//     }
//     public static void main(String[] args) {
//         String str = "madam";
//         if (pal(str)) {
//             System.out.println(str + " is a palindrome");
//         } else {
//             System.out.println(str + " is not a palindrome");
//         }
        
//     }
// }


// import java.util.*;
// public class problems{
//     public static void main(String[] args) {
//         String str="prabhas";
//         HashMap<Character,Integer>hm=new HashMap<>();

//         for(char ch:str.toCharArray()){
//             hm.put(ch,hm.getOrDefault(ch,0)+1);
//         }

//         System.out.println(hm);
        
//     }
// }


// public class problems{
//     public static void main(String[] args) {
//          String str="prabhas";
//          int count=0;

//          for(int i=0;i<str.length();i++){
//             count++;
//          }
//          System.out.println(count);
//     }
// }


// public class problems{
//     public static void main(String[]args){
//         String str="boy good a is prabhas";
//         String[]arr=str.split(" ");
//         String res="";
//         for(int i=arr.length-1;i>0;i--){
//             res+=arr[i]+" ";
//         }
//         System.out.println(res);
//     }
// }

// import java.util.*;
// public class problems{
//     public static void main(String[]args){
//         int[]arr={5,6,2,1,3};

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                    int temp=arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=temp;                }
//             }
//         }
//         System.err.println(Arrays.toString(arr));
//     }
// }

// import java.util.HashMap;
// public class problems{
//     public static void main(String[] args) {
//         String str="prabhas";
//         HashMap<Character,Integer>hm=new HashMap<>();
       
//         for(char ch:str.toCharArray()){
//             hm.put(ch,hm.getOrDefault(ch,0)+1);
//         }

//         for(char ch:hm.keySet()){
//               if(hm.get(ch)>1){
//                  System.out.println(ch+"-"+hm.get(ch));
//               }
//         }

        
        
//     }
// }

// public class problems{
//     public static void main(String[] args) {
//         String str="prabhas1234 is a good boy";

//         int volcount=0;
//         int conscount=0;
//         int digitcount=0;
//         int spaces=0;

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);

//             if (Character.isDigit(ch)) {
//                 digitcount++;
//             } else if (ch == ' ') {
//                 spaces++;
//             } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 volcount++;
//             } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//                 conscount++;
//             }
//         }

//         System.out.println(volcount);
//         System.out.println(conscount);
//         System.out.println(digitcount);
//         System.out.println(spaces);
//     }
// }

