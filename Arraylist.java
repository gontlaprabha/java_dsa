// import java.util.*;
// public class Arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.remove(4);
//         int size = list.size();
//         System.out.println(size);
//         int get = list.get(2);
//         System.out.println(get);
//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(2);
//         list2.add(4);
//         list2.add(6);
//         list2.add(8);
//         list2.set(3,4);
//         list2.remove(3);
//         System.out.println("Size:"+list2.size());
//         int idx1 = 0;
//         int idx2 = 1;
//         System.out.println(list2);
//         Collections.sort(list2);
//         System.out.println(list2);
//         Collections.sort(list2, Collections.reverseOrder());
//         System.out.println(list2);
//         swap(list2, idx1, idx2);
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < list2.size(); i++) {
//             if (max < list2.get(i)) {
//                 max = list2.get(i);
//             }
//         }
//         System.out.println(max);
//     }

//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx2);
//         list.set(idx2, list.get(idx1));
//         list.set(idx1, temp);
//     }
// }
    //arr.get(index) ,arr.add,arr.remove,arr.size(); .contains(element)  arr.set  
    
    //'*.- *'

// import java.util.ArrayList;
// public class Arraylist{
//     public static void main(String[] args) {
//     ArrayList<String>list=new ArrayList<>();
//     list.add("prabhas");
//     list.add("Pawan kalyan");
//     list.add("bhAAi");


//     // int size=list.size()-1;

//     // for(int i=size;i>=0;i--){
//     //     System.out.println(list.get(i));
//     // }



// //     }
// // }
// // import java.util.Collection;



//     Assignment To Itself(hints(5): 73:9-73:18)
// The assigned value is never used(hints(4): 73:14-73:18)
// String name


// import java.util.*;
// public class Arraylist{
//     public static void main(String[] args) {
//      int[]arr={1,2,3,4,5,6};
//      int n=3;
//      int len=arr.length;
//      int index=0;
//      int res[]=new int[len];

//      for(int i=n;i<len;i++){
//        res[index++]=arr[i];
//      }
//      for(int i=0;i<n;i++){
//         res[index++]=arr[i];
//      }
//      System.out.println(Arrays.toString(res));
//     }
    
// }

// import java.util.*;
// public class Arraylist
// {
// 	public static void main(String[] args) {
// 		int arr[]={1, 2, 3, 4, 5};
//         int k = 2;
//         int n= arr.length;
//         int temp[]=new int[k];
//         System.arraycopy(arr, 0, temp, 0, k);
//         System.out.println("Stage 1: "+Arrays.toString(temp));
//         System.arraycopy(arr, k, arr, 0, n-k);
//         System.out.println("Stage 2: "+Arrays.toString(arr));
//         System.arraycopy(temp, 0, arr, n-k, k);
//         System.out.println("Stage 3 Fin: "+Arrays.toString(arr));
// 	}
// }




//l and t
// public class Arraylist{
//     public static void main(String[] args) {
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(1);    
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);

//         System.out.println(list.get(2));
//     }
// }

// public class Arraylist{
//     public static void main(String[] args) {
//         ArrayList<Integer>list=new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);


//         int start=0;
//         int end=list.size()-1;

//         while(start<end){
//             int temp=list.get(start);
//             list.set(start,list.get(end));
//             list.set(end,temp);
//             start++;
//             end--;
//         }
//         System.out.println(list);

//     }
// }


// public class Arraylist {
//     public static void main(String[] args) {
//       int[]arr={8,0,3,0,1,0,4,0,7,0,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//       int[]temp=new int[arr.length];
//       int index=0;
      
//       for(int i=0;i<arr.length;i++){
//         if(arr[i]==0){
//            temp[index]=arr[i];
//            index++;
//         }
//       }
//       for(int i=0;i<arr.length;i++){
//         if(arr[i]!=0){
//           temp[index]=arr[i];
//           index++;
//           }
//         }
//         System.out.println(Arrays.toString(temp));
//     }
//   }

