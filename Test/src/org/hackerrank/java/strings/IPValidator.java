package org.hackerrank.java.strings;

import java.util.Scanner;

class IPValidator
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext())
        {
            String IP = scanner.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
        
        scanner.close();
    }
}


class myRegex
{
	public final String pattern = "^(?:(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}