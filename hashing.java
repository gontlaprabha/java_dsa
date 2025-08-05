
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;


// import java.util.ArrayList;
// import java.util.HashMap;


// import java.util.Iterator;
//import java.util.*;
// public class hashing {
//     public static void main(String[] args) {
//         //creating a hash set
//         HashSet<Integer> set=new HashSet<>();
//         //add elememts
//         set.add(1);
//         set.add(2);
//         set.add(3);
//         set.add(4);
//         System.out.println(set);
//         //searching elements
//         if(set.contains(2)){
//             System.out.println("set contains 2");
//         }
//         if(!set.contains(6)){
//             System.out.println("set doesnt contain 6"); //! -negation not true print 6

//         }
//         //deleting 
//         set.remove(1);
//         if(!set.contains(1)){
//             System.out.println("1 is removed by set.remove(1)");
//         }

//         int a =set.size();
//         System.out.println("the size of the set:"+a);

//         //iterator
//         Iterator it=set.iterator();
//         System.out.println("The First element:"+it.next()); //2
//         // System.out.println("The Second element:"+it.next()); //3
//         // System.out.println("The Third element:"+it.next());//4
//         System.out.println(it.hasNext()); //true if the next pointing elements are there
       
//     }
    
// }


//unordered set-hashmap;

// import java.util.*;
// public class hashing{
// public static void main(String[] args) {
// //creating a hash map

// HashMap<Integer,String>population=new HashMap<>();

// //adding elements-Put O(1);

// population.put(1,"India");
// population.put(2,"China");
// population.put(3,"USA");
// population.put(4,"Indonesia");
// population.put(5,"Pakistan");
// population.put(6,"Brazil");
// population.put(7,"Nigeria");
// population.put(8,"Bangladesh");
// population.put(9,"Russia");
// population.put(10,"Mexico");


// //searching elements-containsKey O(1);

// System.out.println(population.containsKey(1));

// //deleting elements-remove O(1);

// population.remove(10);

// //size of the hashmap-size O(1);

// System.out.println(population.size());


// //get the value of the key-get O(1);

// System.out.println(population.get(1));  


// //isempty O(1);

// System.out.println(population.isEmpty());


// //iterating through the hashmap-keyset O(n);
// Set<Integer>keys=population.keySet();

// System.out.println(keys);

// for(int key:keys){
//     System.out.println(key+":"+population.get(key));
// }
// //iterating through the hashmap-iterator O(n);

// // for(Integer i:population.keySet()){     
// //         System.out.println(i+":"+population.get(i));
// // }


//         }
// }

// import java.util.*;
// public class hashing{

// public static boolean issub(int[]arr1,int[]arr2){
//      Set<Integer>set=new HashSet<>();

//      for(int num:arr1){
//         set.add(num);
//      }

//      for(int num:arr2){
//         if(set.contains(num)){
//                 return true;
//         }
//      }
//  return false;    
// }
// public static void main(String[] args) {

//         int[]arr1={1,2,3,4,5};

//         int[]arr2={0,0,5,0,0};


//         if(issub(arr1, arr2)){
//              System.out.println("yes it is sub ");
//         }
//         else{
//                 System.out.println("nope");
//         }


//                 }

//         }


// import java.util.*;
// public class hashing{
//     public static int[] distinctElements(int arr[]){
//       HashSet<Integer>set=new HashSet<>();
//       for(int num:arr){
//         set.add(num);
//       }
//       int[]array=new int[set.size()];

//       int i = 0;
//       for (int num : set) {
//         array[i++] = num;
//       }
        
//          return array;
//         }
//     public static void main(String[] args) {
//         int[]arr={10,20,30,40,20,30,10};
        
//         int[]array=distinctElements(arr);

//         System.out.println(Arrays.toString(array));
        
//     }
// }




//set problems

