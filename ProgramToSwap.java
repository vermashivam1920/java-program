package com.learn;

import java.util.Scanner;

class ProgramToSwap{
    public static void main(String ...args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");  
        int firstno= sc.nextInt();  
        System.out.print("Enter second number- ");  
        int secondno= sc.nextInt();  
        System.out.print("before swapping firstno : "+firstno+" secondno and "+secondno);  
        firstno=firstno-secondno;
	    secondno=firstno+secondno;
	    firstno=secondno-firstno;
	    System.out.print("\nafter swapping firstno : "+firstno+" secondno and "+secondno);
    }
} 