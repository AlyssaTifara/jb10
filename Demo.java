import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom M.Kom", "199402");
        Pegawai pegawai1 = dosen1;
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();
        
        Dosen newDosen = (Dosen) pegawai1;
        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();

        // Dosen dosen2 = new Dosen("19700105", "Alyssa, S.T, M.T", "197001");
        // TenagaKependidikan tkp1 = new TenagaKependidikan("19750301", "Aida, A.Md", "Tenaga Kependidikan");
        // TenagaKependidikan tkp2 = new TenagaKependidikan("19650304", "Rika, S.T", "Tenaga Kependidikan");
        
        // ArrayList<Pegawai> daftarpegawai = new ArrayList<Pegawai>();

        // daftarpegawai.add(dosen1);
        // daftarpegawai.add(dosen2);
        // daftarpegawai.add(tkp1);
        // daftarpegawai.add(tkp2);

        // System.out.println("Jumlah Pegawai: " + daftarpegawai.size());
    }
}