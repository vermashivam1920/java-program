package com.learn;

import java.util.Scanner;

	public class reverseword 
	{
	    public static void main (String[] args) 
	    {
	    	Scanner sc= new Scanner(System.in);
	        
	        String str= "coding", nstr="";
	        char ch;
	        
	      System.out.print("Original word: ");
	      System.out.println("coding"); //Example word
	        
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
	}