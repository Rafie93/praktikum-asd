
package chapter2;

/**
 *
 * @author USER
 */
public class Temparature3D {
    public static void main(String[] args) {
        
        double[][][] temperatureData = new double[3][7][24];
        
        // Mengisi data suhu acak
        for (int city = 0; city < 3; city++) {
            for (int day = 0; day < 7; day++) {
                for (int hour = 0; hour < 24; hour++) {
                    temperatureData[city][day][hour] = 20 + Math.random() * 15;
                }
            }
        }
        
        // Menghitung rata-rata suhu per kota
        for (int city = 0; city < 3; city++) {
            double total = 0;
            int count = 0;
            
            for (int day = 0; day < 7; day++) {
                for (int hour = 0; hour < 24; hour++) {
                    total += temperatureData[city][day][hour];
                    count++;
                }
            }
            
            System.out.printf("Rata-rata suhu kota %d: %.2f°C\n", 
                             city + 1, total / count);
        }
    }
    
}
