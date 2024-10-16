import java.util.ArrayList;

public class Jurusan {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> listMahasiswa;

    // constructor
    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        listMahasiswa = new ArrayList<>();
    }

    public void addMahasiswa(Mahasiswa m) {
        listMahasiswa.add(m);
    }

    // setter and getter
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getMahasiswa() {
        return listMahasiswa;
    }
}
