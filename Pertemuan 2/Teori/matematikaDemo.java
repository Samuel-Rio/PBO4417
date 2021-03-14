public class matematikaDemo{
    public static void main(String[] args) {
        matematika operator = new matematika();
    
        operator.setAngka(20, 20);
        System.out.println("Pertambahan \t: " + operator.angka_1 + " + " + operator.angka_2 + " \t= " + operator.pertambahan());

        operator.setAngka(10, 5);
        System.out.println("Pengurangan \t: " + operator.angka_1 + " - " + operator.angka_2 + " \t= "  + operator.pengurangan());

        operator.setAngka(10, 20);
        System.out.println("Perkalian \t: " + operator.angka_1 + " x " + operator.angka_2 + " \t= "  + operator.perkalian());

        operator.setAngka(20, 2);
        System.out.println("Pembagian \t: " + operator.angka_1 + " / " + operator.angka_2 + " \t= "  + operator.pembagian());
    }
}

class matematika {
    public int angka_1;
    public int angka_2;

    public matematika(){

    }


    public void setAngka(int angka1, int angka2){
        angka_1 = angka1;
        angka_2 = angka2;
    }


    public int pertambahan(){
        return angka_1 + angka_2;
    }


    public int pengurangan(){
        return angka_1 - angka_2;
    }


    public int perkalian(){
        return angka_1 * angka_2;
    }


    public int pembagian(){
        return angka_1 / angka_2;
    }


}