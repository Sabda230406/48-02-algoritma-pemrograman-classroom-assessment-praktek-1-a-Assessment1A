public class Nomor1{
    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan total jam lembur anda : ");
        double totalJamLembur = scanner.nextDouble();

        
        double honor_lembur = hitungHonorLembur(totalJamLembur);

       
        System.out.println("Total jam lembur: " + totalJamLembur);
        System.out.println("Honor lembur: " + honor_lembur);
    }

    public static double hitungHonorLembur (double totalJamLembur) {
        double honor_lembur = 0;

        if (totalJamLembur <= 16) {
            honor_lembur = totalJamLembur * 10000;
        } else {
            honor_lembur = (16 * 10000) + (totalJamLembur - 16 * 15000);
        }

        return honor_lembur;


    }
}
