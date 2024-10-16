import java.util.ArrayList;

public class MainMahasiswa {
    public static void main(String[] args) {

        Jurusan j1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");

        Mahasiswa m1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa m2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa m3 = new Mahasiswa("6703", "Agus");

        j1.addMahasiswa(m1);
        j1.addMahasiswa(m2);
        j1.addMahasiswa(m3);


        Jurusan j2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        Mahasiswa m4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa m5 = new Mahasiswa("6302", "Siska");
        Mahasiswa m6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa m7 = new Mahasiswa("6304", "Rahmat");

        j2.addMahasiswa(m4);
        j2.addMahasiswa(m5);
        j2.addMahasiswa(m6);
        j2.addMahasiswa(m7);

        ArrayList<Mahasiswa> list1 = j1.getMahasiswa();
       
        ArrayList<Mahasiswa> list2 = j2.getMahasiswa();
        
        displayMahasiswa(j1, list1);
        displayMahasiswa(j2, list2);
        
        
    }

    private static void displayMahasiswa(Jurusan j, ArrayList<Mahasiswa> list) {
        System.out.println("\nKode: " + j.getKode() + "\nNama: " + j.getNama() + "\nDaftar mahasiswa: " + "\n" );
        for (Mahasiswa m : list) {
            System.out.println("- " + m.getNim() + " - " + m.getNama());
        }
    }
}
