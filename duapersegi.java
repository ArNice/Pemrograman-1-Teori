// Import Library Scanner 
import java.util.Scanner;
public class duapersegi {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);	// Membuat objek Scanner

		// Input koordinat x persegi 1
		// Tipe data double 
		System.out.print("Masukkan koordinat x persegi 1 : ");
		double p1x = input.nextDouble();
		// Input koordinat y persegi 1
		// Tipe data double 
		System.out.print("Masukkan koordinat y persegi 1 : ");
		double p1y = input.nextDouble();
		// Input lebar persegi 1
		// Tipe data double 
		System.out.print("Masukkan lebar persegi 1 : "); 
		double p1lebar = input.nextDouble();
		// Input panjang persegi 1
		// Tipe data double
		System.out.print("Masukkan panjang persegi 1 : ");
		double p1panjang = input.nextDouble();
		
		
		// Input koordinat x persegi 2
		// Tipe data double
		System.out.print("Masukkan koordinat x persegi 2 : ");
		double p2x = input.nextDouble();
		// Input koordinat y persegi 2
		// Tipe data double
		System.out.print("Masukkan koordinat y persegi 2 : ");
		double p2y = input.nextDouble();
		// Input lebar persegi 2
		// Tipe data double 
		System.out.print("Masukkan lebar persegi 1 : ");
		double p2lebar = input.nextDouble();
		// Input panjang persegi 2
		// Tipe data double 
		System.out.print("Masukkan panjang persegi 1 : ");
		double p2panjang = input.nextDouble();
		
		// Code untuk menentukan apakah Persegi 2 didalam Persegi 1 atau Persegi 2 memotong/tidak memotong Persegi 1
		if	((Math.pow(Math.pow(p2y - p1y, 2), .05) + p2panjang / 2 <= p1panjang / 2) && 
			(Math.pow(Math.pow(p2x - p1x, 2), .05) + p2lebar / 2 <= p1lebar / 2) &&
			(p1panjang/ 2 + p2panjang / 2 <= p1panjang) &&
			(p1lebar / 2 + p2lebar / 2 <= p1lebar))
			System.out.println("Persegi 2 di dalam Persegi 1");
		else if ((p1x + p1lebar / 2 > p2x - p2lebar) ||
					(p1y + p1panjang / 2 > p2y - p2panjang))
			System.out.println("Persegi 2 memotong Persegi 1");
		else
			System.out.println("Persegi 2 tidak memotong Persegi 1");
    }
}