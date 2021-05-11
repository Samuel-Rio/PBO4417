import java.util.Arrays;

abstract class Perhitungan {
    int NilaiUtama;
    int NilaiTambah;
    String nilai;
	
    String NilaiAkhir(int NilaiUtama, int NilaiTambah) {
        return nilai;
    }
}
public class Nilai {
    int NilaiUtama;
    int NilaiTambah;
    int Nilai;

    public String NilaiAkhir(int NilaiUtama, int NilaiTambah) {
        Nilai = ((6*NilaiUtama) + (4*NilaiTambah)) / 10;
        String NilaiAkhir = String.valueOf(Nilai);
        return NilaiAkhir;
    }

    public static void printArrayNilai(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}