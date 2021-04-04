import java.util.ArrayList;

public class Inheritance_ArrayList {
      public static void main(String args[]){
           HP HP = new HP();
           System.out.println(HP.sisaHP());

           HP.tambahHP("Samsung");
           HP.tambahHP("Xiaomi");
           HP.tambahHP("Redmi");
           System.out.println(HP.sisaHP());

           HP.gantiHP(1,"HP");
           System.out.println(HP.sisaHP());

           HP.HPRusak(0);
           System.out.println(HP.sisaHP());
      }
}

class Toko_HP {
      ArrayList<String> buah = new ArrayList<>();

      public Toko_HP(){

      }
      public void setHP(ArrayList<String> buah) {
            this.buah = buah;
      }
      public ArrayList<String> getHP(){
            return this.buah;
      }
} 

class HP extends Toko_HP {
      public void tambahHP(String HPs){
            super.getHP().add(HPs);
      }
      public String HPRusak(int index){
            return super.getHP().remove(index);
      }
      public void gantiHP(int index, String HPs){
            super.getHP().set(index, HPs);
      }
      public ArrayList<String> sisaHP(){
            return super.getHP();
      }
}