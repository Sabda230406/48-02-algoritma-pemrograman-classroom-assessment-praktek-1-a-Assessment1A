public class Nomor2{
    public static void main(String[] args){

        double omzetbeliau = 0;
        double omzetmereka = 0;
        double omzetkita = 0;
        double totaltrip = 0;
        double biayaperKm = 13000;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String driver = scanner.nextLine();

            
            System.out.print("Lama trip (km): ");
            double km = scanner.nextDouble();
            scanner.nextLine(); 

           double omzet = km * biayaperKm;

            
            if (driver.equalsIgnoreCase("Beliau")) {
                omzetbeliau += omzet;
            } else if (driver.equalsIgnoreCase("Mereka")) {
                omzetmereka += omzet;
            } else if (driver.equalsIgnoreCase("Kita")) {
                omzetkita += omzet;
            } else {
                System.out.println("Nama driver tidak valid.");
                 
            }

           
            totaltrip += km;

           
            System.out.print("Input lagi (Y/N)?: ");
            String lagi = scanner.nextLine();
            if (lagi.equalsIgnoreCase("N")) {
                break;
            }
        }

        
        System.out.println("Total trip yang dilakukan driver = " + totaltrip);

        
        double omzetTertinggi = Math.max(Math.max(omzetbeliau, omzetmereka), omzetkita);
        String driverTertinggi;
        if (omzetTertinggi == omzetbeliau) {
            driverTertinggi = "Beliau";
        } else if (omzetTertinggi == omzetmereka) {
            driverTertinggi = "Mereka";
        } else {
            driverTertinggi = "Kita";
        }

        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi);

    }
}
