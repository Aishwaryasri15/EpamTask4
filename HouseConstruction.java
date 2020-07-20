package com.epam.Construction;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class HouseConstruction 
{
    public static void main( String[] args ) throws IOException{
    	Scanner sc = new Scanner(System.in);
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	bw.write("Choose Materials to Construct a House : "+"\n");
    	bw.write("1.1200/- for Standard Materials"+"\n");
    	bw.write("2.1500/- for Above Standard Materials"+"\n");
    	bw.write("3.1800/- for High Standard Materials"+"\n");
    	bw.write("4.2500/- for High Standard and Fully Automated"+"\n");
    	bw.flush();
    	int choice = sc.nextInt();
    	if(choice>=1&&choice<=4){
    		bw.write("Enter Area for Construction : ");
    		bw.flush();
    		int area = sc.nextInt();
    		bw.write("Cost for Construction is : "+calculateCost(area,choice)+"\n");
    		bw.flush();
    	}
    	else{
    		bw.write("Enter Valid Choice...!"+"\n");
    		bw.flush();
    	}
    }

	private static float  calculateCost(int area, int choice) {
		// TODO Auto-generated method stub
		float cost = 0;
		switch(choice){
		case 1 : cost = area * 1200;
			break;
		case 2 : cost = area * 1500;
			break;
		case 3 : cost = area * 1800;
			break;
		case 4 : cost = area * 2500;
			break;
		}
		return cost;
	}
}
