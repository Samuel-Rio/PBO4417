import java.util.Scanner;

public class UjiCoba {
	
    public static void main(String args[]){
		
        String InputNamaMahasiswa;
        String InputNim;
        String InputNamaDosen;
        String InputMatkul;
        String InputJadwal;
		
        int JumlahMahasiswa, JumlahDosen, Pilihan, NilaiUtama, NilaiTambah;
		
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nJumlah Mahasiswa : ");
        JumlahMahasiswa = keyboard.nextInt();
		
        System.out.print("\nJumlah Dosen : ");
        JumlahDosen = keyboard.nextInt();

        String [][] Mahasiswa = new String [JumlahMahasiswa][4];
        String [][] Dosen = new String [JumlahDosen][2];
        String [][] Matkul = new String [JumlahDosen][3];
        String [][] Kelas = new String [JumlahMahasiswa][3];
        String [][] Nilai = new String [JumlahMahasiswa][4];

        Mahasiswa Mahasiswa1 = new Mahasiswa();
        Dosen Dosen1 = new Dosen();
        Matkul Matkul1 = new Matkul();
        Kelas Kelas1 = new Kelas();
        Nilai Nilai1 = new Nilai();

        while (true) {
            System.out.println("");
            System.out.println("1. Inputkan Biodata Mahasiswa");
            System.out.println("2. Inputkan Biodata Dosen");
            System.out.println("3. Inputkan Jadwal Matakuliah");
            System.out.println("4. Inputkan Nilai Mahasiswa");
            System.out.println("5. Tampil Data");
            System.out.println("6. Keluar");
            
            System.out.print("Masukkan pilihan anda : ");
            Pilihan = keyboard.nextInt();
            // Input biodata Mahasiswa
            if(Pilihan == 1) {
                for(int i= 0; i < JumlahMahasiswa; i++) {
                    System.out.println("");
                    System.out.println("Data Mahasiswa ke " + (i+1));
                    for(int j = 0; j<2; j++) {      
                        if (j == 0) {
                            System.out.print("Nama Mahasiswa : ");    
                            Mahasiswa[i][j] = keyboard.next();
                            Nilai[i][j] = Mahasiswa[i][j];
                            Kelas[i][j] = Mahasiswa[i][j];
                        }
                        else {
                            System.out.print("NIM : ");
                            Mahasiswa[i][j] = keyboard.next();
                            Nilai[i][j] = Mahasiswa[i][j];
                            Kelas[i][j] = Mahasiswa[i][j];
                        }
                    }
                }
                System.out.print("");
            }
            else if(Pilihan == 2) {
                for(int i= 0; i < JumlahDosen; i++) {
                    System.out.println("");
                    System.out.println("Data Dosen ke " + (i+1));
                    for(int j = 0; j<2; j++) {      
                        if (j == 0) {
                            System.out.print("Nama Dosen : ");    
                            Dosen[i][j] = keyboard.next();
                            Matkul[i][j] = Dosen[i][j];
                        }
                        else {
                            System.out.print("Mata Kuliah yang diampu : ");
                            Dosen[i][j] = keyboard.next();
                            Matkul[i][j] = Dosen[i][j];
                        }
                    }   
                }
            }
            else if(Pilihan == 3) {
                for(int i= 0; i < JumlahDosen; i++) {
                    System.out.println("");
                    System.out.println("Data Jadwal Pelajaran " + Dosen[i][1] + ":");
                    System.out.print("Masukkan Jadwal : ");    
                    Matkul[i][2] = keyboard.next();
                }
            }
            else if(Pilihan == 4) {
                for(int i= 0; i < JumlahMahasiswa; i++) {
                    System.out.println("");
                    System.out.println("Nilai Mahasiswa ke " + (i+1));
                    System.out.print("Masukkan Nilai pokok : ");    
                    NilaiUtama = keyboard.nextInt();
                    System.out.print("Masukkan Nilai tambahan : ");
                    NilaiTambah = keyboard.nextInt();
                    Nilai[i][2] = Nilai1.NilaiAkhir(NilaiUtama, NilaiTambah);
                    Mahasiswa[i][3] = Nilai[i][2];
                }
            }
            else if(Pilihan == 5) {
                System.out.println("");
                System.out.println("Data yang dimasukan : ");
				Mahasiswa1.printArrayMahasiswa(Mahasiswa);
				Dosen1.printArrayDosen(Dosen);
				Matkul1.printArrayMatkul(Matkul);
                Kelas1.printArrayKelas(Kelas);
				Nilai1.printArrayNilai(Nilai);
                System.out.println("");
            }
            else if(Pilihan == 6) {
                System.exit(0);
            }
            else {
                System.exit(0);
            } 
        }
    }
}