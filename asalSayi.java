package asalSayi;

import java.util.Scanner;

public class asal {

	public static void main(String[] args) {
		 Scanner asal=new Scanner(System.in);
		 System.out.println("sayı gir");
	        int sayac = 0  , asalmi;
	        asalmi=asal.nextInt();
	        // Döngü Sayıya(asalmi) kadar gidecek.
	        // Yani 1 ile asalmi arasındaki tüm sayılara bölünecek.
	        if(asalmi<=1) {
	        	System.out.println("Sayı Asal Deil");
	        }
	        else {
	        for (int i = 2; i <= asalmi; i++) {
	            // Tam bölündüğünü kontrol ediyoruz
	            if (asalmi % i == 0) {
	                // Tam bölünürse içine gircek
	                sayac++;
	      
	                // ve Sayı her bölündüğünde 1 arttırıyoruz
	            }
	        }

	        // Asal sayıları sadece 1 ve kendilerine bölünürler
	        // Sayıyı Bölen 2 yada 2 den az sayı varsa asal olduğunu anlayacaz.
	        if (sayac <= 2) {
	            System.out.println("Sayı Asaldır  ");
	        } else {
	        }   System.out.println("Sayı Asal Deil " );
	        }}

}
