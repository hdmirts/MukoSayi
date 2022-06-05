import java.util.Scanner;
public class muko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı girin :");
        int user = input.nextInt();

        int toplam=0;

        for(int i=1; i<user; i++){
            if(user%i==0){
                toplam +=i;
            }
        }
        if(user==toplam){
            System.out.println(user + " Mükemmel Bir Sayı!");

        }
        else{
            System.out.println(user + "Mükemmel Bir Sayı Değil!");
        }



    }
    
}
