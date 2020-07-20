package com.epam.cleanCode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SimpleInterest {
	float principleAmount,rate,time,simpleInterest;
	void readValues() throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Enter Principle Amount : ");
		bw.flush();
		principleAmount = sc.nextFloat();
		bw.write("Enter Rate : ");
		bw.flush();
		rate = sc.nextFloat();
		bw.write("Enter Time Period : ");
		bw.flush();
		time = sc.nextFloat();
	}
	void calculateSimpleInterest(){
		simpleInterest = (principleAmount * rate * time)/100;
	}
	void displayAmount() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Total Amount : "+simpleInterest);
		bw.flush();
	}
}
