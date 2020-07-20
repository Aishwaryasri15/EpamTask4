package com.epam.cleanCode;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalculateInterest 
{
    public static void main( String[] args ) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	bw.write("Choose either option 1 or 2 :"+"\n");
    	bw.write("1.Simple Interest"+"\n");
    	bw.write("2.Compound Interest"+"\n");
    	bw.flush();
    	SimpleInterest simpleInterest = new SimpleInterest();
    	CompoundInterest compoundInterest = new CompoundInterest();
    	int choice = sc.nextInt();
    	switch(choice){
    		case 1:simpleInterest.readValues();
    			   simpleInterest.calculateSimpleInterest();
    			   simpleInterest.displayAmount();
    			   break;
    		case 2:compoundInterest.readValues();
			   compoundInterest.calculateCompoundInterest();
			   compoundInterest.displayAmount();
			   break;
			default:bw.write("Please Enter Valid Option!");
    	}
    	bw.flush();
    }
}
