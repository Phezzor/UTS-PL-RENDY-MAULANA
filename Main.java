import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String File = "D:\\outputjava\\UTS-PL\\src\\datacuboid.txt";
        List<luas> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(File))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                luas Hitung = new luas();
                Hitung.panjang = Double.parseDouble(row[0]);
                Hitung.lebar = Double.parseDouble(row[1]);
                Hitung.tinggi = Double.parseDouble(row[2]);

                data.add(Hitung);
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        for (luas kubus : data) {
            double L = kubus.Hitungluas();
            double v = kubus.Hitungvolume();
            System.out.println("LUAS : " +L);
            System.out.println("VOLUME : " +v);

            if (L > 20000){
                System.out.println(L);
            }

        }
    }
}