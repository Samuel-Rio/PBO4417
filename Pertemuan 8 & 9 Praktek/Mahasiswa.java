import java.util.Arrays;

public class Mahasiswa implements HarapanKita {
    String Nama;
    String NIM;
	String TTL;
	String Kelamin;

    public void setNama(String Nama){
        this.Nama = Nama;
    }
	
    public String getNama(){
        return Nama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }
	
    public String getNIM(){
        return NIM;
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

    public static void printArrayMahasiswa(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}