import java.util.Scanner;
public class Hava_Sicakligina_Göre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        try{
        System.out.print("Bugünün hava sıcaklığını giriniz : ");
        sicaklik = input.nextInt();

            if(sicaklik < 5 || sicaklik > 25 ){
                if(sicaklik < 5){
                System.out.println("Kayak yapabilirsiniz.");
                }
                else{
                System.out.println("Yüzebilirsiniz.");
                }
            }
            else{
                if(sicaklik > 5 && sicaklik < 15){
                System.out.println("Sinemaya gidebiirsiniz.");
                }
                if(sicaklik > 10 && sicaklik < 25){
                System.out.println("Piknik yapabilirsiniz.");
                }
            }
        }finally{
            input.close();
        }
    }
}
