package triangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		double aX,bX,cX;
		double aY,bY,cY;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite os lados do triangulo X");
		aX = sc.nextDouble();
		bX = sc.nextDouble();
		cX = sc.nextDouble();
		
		
		System.out.println("Digite os lados do triangulo X");
		aY = sc.nextDouble();
		bY = sc.nextDouble();
		cY = sc.nextDouble();
		
		double p = (aX + bX + cX) / 2;
		double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));
		
		p = (aY + bY + cY) / 2; 
		double areaY = Math.sqrt (p *(p - aY) * (p - bY) * (p - cY));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			
			System.out.println("Digite os lados do triangulo Y:");
		}else {
			
			System.out.println("O triangulo Y tem a maior área");
			
		}
		
		
		

	}

}
