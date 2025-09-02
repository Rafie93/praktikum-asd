package chapter2;


public class Array3Dimensi {
     public static void main(String[] args) {
       int[][][] arr = {
            {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            },
            {
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}
            }
        };
       
       for (int i = 0; i < arr.length; i++) {             // dimensi 1
            System.out.println("Lapisan ke-" + i + ":");
            for (int j = 0; j < arr[i].length; j++) {      // dimensi 2
                for (int k = 0; k < arr[i][j].length; k++) { // dimensi 3
                    System.out.print(arr[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
       
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
