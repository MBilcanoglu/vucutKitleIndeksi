package vucutKitleIndeksi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double boy, kilo, indeks;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz: ");
		boy=input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz: ");
		kilo=input.nextDouble();
		indeks=kilo/(boy*boy);
		System.out.println("V�cut Kitle �ndeksiniz: "+indeks);
	}

}
