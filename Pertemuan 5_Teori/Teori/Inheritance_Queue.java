import java.util.Queue;
import java.util.LinkedList;

public class Inheritance_Queue {
      public static void main(String args[]){
            Besi Besi = new Besi();
            System.out.println(Besi.sisaBesi());
 
            Besi.tambahBesi("Cat");
            Besi.tambahBesi("Pralon");
            Besi.tambahBesi("Seng");
            Besi.tambahBesi("Kawat");
            Besi.tambahBesi("Paku");
            System.out.println(Besi.sisaBesi());
 
            Besi.BesiRusak(3);
            System.out.println(Besi.sisaBesi());
      }      
}

class Toko_Besi {
      Queue<String> sayur = new LinkedList<String>();
 
      public Toko_Besi(){
 
      }
      public void setBesi(Queue<String> sayur) {
            this.sayur = sayur;
      }
      public Queue<String> getBesi(){
            return this.sayur;
      }
}

class Besi extends Toko_Besi {
      public void tambahBesi(String sayur){
            super.getBesi().add(sayur);
      }
      public void BesiRusak(int index){
            System.out.println(super.getBesi().poll());
      }
      public Queue<String> sisaBesi(){
            return super.getBesi();
      }
} 