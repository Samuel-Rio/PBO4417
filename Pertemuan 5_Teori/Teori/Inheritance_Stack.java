import java.util.Stack;

public class Inheritance_Stack {
      public static void main(String args[]){
            Gaming Gaming= new Gaming();
            System.out.println(Gaming.sisaGaming());
 
            Gaming.tambahGaming("Komputer");
            Gaming.tambahGaming("Laptop");
            Gaming.tambahGaming("Keyboard");
            System.out.println(Gaming.sisaGaming());
 
            Gaming.gantiGaming(2,"Mouse");
            System.out.println(Gaming.sisaGaming());
 
            Gaming.GamingRusak();
            System.out.println(Gaming.sisaGaming());
      }
}
 
class Toko_Gaming {
      Stack<String> gear = new Stack<String>();
 
      public void setGaming(Stack<String> gear) {
            this.gear = gear;
      }
      public Stack<String> getGaming(){
            return this.gear;
      }
} 
 
class Gaming extends Toko_Gaming {
      public void tambahGaming(String gear){
            super.getGaming().push(gear);
      }
      public String GamingRusak(){
            return super.getGaming().pop();
      }
      public void gantiGaming(int index,String gear){
            super.getGaming().set(index, gear);
      }
      public Stack<String> sisaGaming(){
            return super.getGaming();
      }
}

