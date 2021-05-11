import java.util.Arrays;

public class Dosen implements HarapanKita {
    String Nama;
    String Matkul;
	String TTL;
	String Kelamin;

    public void setnama(String Nama){
        this.Nama = Nama;
    }
	
    public String getnama(){
        return Nama;
    }
	
    public void setMatkul(String Matkul){
        this.Matkul = Matkul;
    }
	
    public String getMatkul(){
        return Matkul;
    }
	
	public void setTTL(String TTL){
		this.TTL = TTL;
	}
	
	public String getTTL(){
		return TTL;
	}
	
	public void setKelamin(String Kelamin){
		this.Kelamin = Kelamin;
	}
	
	public String getKelamin(){
		return Kelamin;
	}

    public static void printArrayDosen(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}