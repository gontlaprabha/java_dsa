
     @Override
     public void run(){
         for(int i=0;i<10;i++){
             System.out.println("thread a");
               }
         try {
             Thread.sleep(10);
         } catch (InterruptedException ex) {
         }
     }
 }

 class B extends Thread{
     @Override
    public void run(){
     for(int i=0;i<10;i++){
   System.out.println("thread b");
     }
         try {
             Thread.sleep(10);
         } catch (InterruptedException ex) {
         }
    }
 }
 public class threading {
     public static void main(String[] args) {
         A a1=new A();
         B b1=new B();

         a1.setPriority(5);

         a1.start();
         b1.start();
        
     }
    
 }
