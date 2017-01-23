package tic;
import java.awt.Checkbox;
import java.util.Random;
import java.util.Scanner;

public class Tictac {
	int chess[][][] = new int[4][4][4];
	
	public void userPlay(int[][][] chess){
		int user[]=new int[3];
		int x=0;
		int y=0;
		int z=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the value");
		for(int i=0; i<3; i++){			
				user[i]=scan.nextInt();							
		}
		x=user[0];
		y=user[1];
		z=user[2];
		
		if(chess[x][y][z]==0){					
				chess[x][y][z]=1;
		}
		else{
				System.out.println("please input again!");
				userPlay(chess);
		}		
		}


	public void computerPlay(int[][][] chess){
		int comp[] = new int[3];
		int x=0;
		int y=0;
		int z=0;
		Random random=new Random();
		x= Math.abs(random.nextInt(3));
		y= Math.abs(random.nextInt(3));
		z= Math.abs(random.nextInt(3));
		if(chess[x][y][z]==0){
			chess[x][y][z]=10;
			System.out.println("computer play" + x +"," +y+","+ z);
		}
		else
		computerPlay(chess);	
	}	
	
	public static void main(String args[]){
		int win=0;
		int[][][] chess=new int[4][4][4];
		Tictac tic = new Tictac();
		judge jud = new judge();
		do {
			tic.computerPlay(chess);
			tic.userPlay(chess);
			jud.check(chess);
			
		} while (win==0);
		
		
	}
}
