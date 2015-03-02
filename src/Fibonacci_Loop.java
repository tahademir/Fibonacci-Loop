import java.util.Scanner;


public class Fibonacci_Loop {

	public static void main(String[] args) {
		
		long birinciSayi = 1, ikinciSayi= 1, gecici;
		System.out.println("Bulunması istediğiniz fibonacci sayısını giriniz : ");
		Scanner sayi = new Scanner(System.in);
		int girilenSayi=sayi.nextInt();
		long baslangicZamani = System.nanoTime();
		
		for (int i = 0; i<girilenSayi; i++){
			System.out.println("\n"+birinciSayi);
			gecici = birinciSayi + ikinciSayi;
			birinciSayi = ikinciSayi;
			ikinciSayi = gecici;
		}
		long endTime = System.nanoTime();					//hesaplamayı bitiren kod
		long estimatedTime = endTime - baslangicZamani; 	// Geçen süreyi nanosaniye cinsinden elde ediyoruz
		double seconds = (double)estimatedTime/1000000000;  // saniyeye çevirmek için 1000000000'e bölüyoruz.
		System.out.println("\n"+seconds);

	}

}
