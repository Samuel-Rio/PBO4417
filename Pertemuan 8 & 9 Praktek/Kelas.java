import java.util.Arrays;

public class Kelas {
    public static void printArrayKelas(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
