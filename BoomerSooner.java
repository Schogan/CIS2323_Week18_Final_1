import java.util.Scanner;
public class BoomerSooner{
	public static void main(String[] args){
				
		for(int i=1;i<=1000;i++){
			boolean printNum=true;
			if((i%3)==0){
				System.out.print("Boomer ");
				printNum=false;			
			}
			if((i%5)==0){
				System.out.print("Sooner");
				printNum=false;
			}
			if(printNum){
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}