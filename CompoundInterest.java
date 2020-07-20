package com.epam.cleanCode;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CompoundInterest {
	float principleAmount,rate,time,compoundInterest,n;
	void readValues() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		bw.write("Enter Principle Amount : ");
		bw.flush();
		principleAmount = sc.nextFloat();
		bw.write("Enter Rate : ");
		bw.flush();
		rate = sc.nextFloat();
		bw.write("Enter Time Period : ");
		bw.flush();
		time = sc.nextFloat();
		//System.out.println("Enter Number of times the amount should be compunded : ");
		//n = sc.nextFloat();
	}
	void calculateCompoundInterest(){
		compoundInterest = (float) (principleAmount * (Math.pow((1 + rate / 100.0), time))); 
	}
	void displayAmount() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Total Amount : "+compoundInterest);
		bw.flush();
	}
	

}
