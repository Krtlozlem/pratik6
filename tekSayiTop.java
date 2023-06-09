import java.util.Scanner;
public class tekSayiTop {
    public static void main(String[] args) {
        int i;
        int sayac =0;

        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Bir sayı giriniz: ");
            i = inp.nextInt();

            if(i %2==0 || i%4==0){
                sayac += i;


            }

        }while(i%2==0);

        System.out.println("Toplam: "+ sayac);

    }
}
