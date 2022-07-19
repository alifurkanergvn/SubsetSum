import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
	
	public static int[] sayilar () {
		
		// int [] myNumbers= {1, 3, 5, 10, 15, -20, 55, 62, 47, 100}; 
		int [] myNumbers= {1, -100 ,47 ,62 ,-55 ,3 ,5 ,10 ,15 ,-20};
		return myNumbers;
	}
	
	public static int ulasilacakToplam() {
		System.out.println("Lutfen altkumeleri toplaminin ulasilmasini istediğiniz sayiyi giriniz");
		Scanner klavye =new Scanner(System.in);
		int reachableNumber= klavye.nextInt();
		klavye.close();
		return reachableNumber;
	}
	
	public static boolean siraliAltKumeVarMi(int[] sayilar, int ulasilacakToplam) {
		
		/*
		// Birinci Yol
		//Tüm ihtimaller tek tek deneniyor
		int sum = 0; 
		for (int i = 0; i < sayilar.length; i++) {
			sum=sayilar[i];
			for (int j =i+1 ; j < sayilar.length; j++) {
				sum+=sayilar[j];
				if (sum==ulasilacakToplam) {
					return true;
				}
			}
		}
		return false;
		*/
		//İkinci yol
		
		int cur_sum=0;
		List<Integer>listem = new ArrayList<Integer>();
		
		for (int i = 0; i < sayilar.length; i++) {
			
			//Array in ilk degerinden itibaren değerleri toplayarak ilerliyorum
			cur_sum+=sayilar[i];
			
			//Array in ilk değeri 
			if (cur_sum - ulasilacakToplam == 0) {
				return true;
			}
			
			//Eğer listemizde eklenen verilerde aşağıdaki işlem sonucu mevcutsa
			//altkümemiz sıralı olarak mevcuttur
			if(listem.contains(cur_sum - ulasilacakToplam)) {
				return true;
			}
			//Yukarıdaki şartları sağlamazsa mevcut toplamı listeme ekle 
			listem.add(cur_sum);
		}
		
		return false;
		
	}
	
	
}
