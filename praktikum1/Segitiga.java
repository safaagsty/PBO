public class Segitiga {
   
public static void main(String args[])
{    
    	int a, b;
	a=7; b=24;
	double c = Math.sqrt((a*a)+(b*b));
	double luas = (0.5)*a*b;
        double kel=a+b+c;
        System.out.println("sisi alas               : " +a);
        System.out.println("sisi tinggi             : " +b);
        System.out.println("sisi miring             : " +c);
	System.out.println("luas Segitiga	        : " +luas);
	System.out.println("Keliling Segitiga       : " +kel);
}
}
