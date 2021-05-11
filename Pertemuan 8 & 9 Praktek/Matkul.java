import java.util.Arrays;

public class Matkul {
    String jadwal;
	String kode;
    
    public void setjadwal(String jadwal){
        this.jadwal = jadwal;
    }
	
    public String getjadwal(){
        return jadwal;
    }
	
	public void setkode(String kode){
		this.kode = kode;
	}
	
	public String getkode(){
		return kode;
	}

    public static void printArrayMatkul(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}