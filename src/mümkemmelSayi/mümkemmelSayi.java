package mümkemmelSayi;

public class mümkemmelSayi {

	public static void main(String[] args) {
       int number=5;
       int toplam =0;
       for(int i=1;i<number;i++) {
    	   if(number%i==0) {
    		   toplam=toplam+i;
    	   }
       }
       if(toplam==number) {
    	   System.out.println("Mümkemmel Sayı");
       }
       else {
    	   System.out.println("Mümkemmel Sayı değidir");
       }
	}

}
