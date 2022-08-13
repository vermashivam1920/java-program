 package com.learn;

import java.util.Scanner;

	public class countword
	{
		
	public static void main(String[] args) 
	{
        String str = "this is shivam";
 
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}