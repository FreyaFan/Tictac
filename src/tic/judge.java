package tic;

import java.util.zip.ZipEntry;

public class judge {
	
	public void check(int[][][] chees){
		int win=0;
		//case1 in x axis
		for(int z=0;z<4;z++){
			for(int y=0;y<4;y++){
				int sum=0;
				for(int x=0; x<4;x++){
					sum+=chees[x][y][z];
					//System.out.println("case1:"+sum);
				}
				if(sum==4){
					win=1;
					System.out.println("You win!");
					System.exit(0);					
				}
				else if(sum==40){
					win=2;
					System.out.println("Computer win!");
					System.exit(0);
				}
			}
		}
		//case2 in y axis
		
		for(int z=0;z<4;z++){
			for(int x=0;x<4;x++){
				int sum=0;
				for(int y=0; y<4;y++){
					sum+=chees[x][y][z];
					//System.out.println("case2:"+sum);
				}
				if(sum==4){
					win=1;
					System.out.println("You win!");
					System.exit(0);
				}
				else if(sum==40){
					win=2;
					System.out.println("Computer win!");
					System.exit(0);
				}
			}
		}
		//case3 in z axis
		for(int x=0; x<4;x++){			
			for(int y=0;y<4;y++){
				int sum=0;
				for(int z=0;z<4;z++){
					sum+=chees[x][y][z];
					//System.out.println("case3:"+sum);
				}
				if(sum==4){
					win=1;
					System.out.println("You win!");
					System.exit(0);
				}
				else if(sum==40){
					win=2;
					System.out.println("Computer win!");
					System.exit(0);
				}
			}
		}
		//case4 in diagnal1
		int sum=0;
		for(int x=0;x<4;x++)
					sum+=chees[x][x][x];
					//System.out.println("case4:"+sum);
		if(sum==4){
			win=1;
			System.out.println("You win!");
			System.exit(0);
		}
		else if(sum==40){
			win=2;
			System.out.println("Computer win!");
			System.exit(0);
		}
		else{
			sum=0;
		}
		//case5 in diagnal2
		for(int x=0;x<4;x++)
			for(int y=3;y>=0;y--)
				sum+=chees[x][y][y];
				//System.out.println("case5:"+sum);
				if(sum==4){
					win=1;
					System.out.println("You win!");
					System.exit(0);
				}
				else if(sum==40){
					win=2;
					System.out.println("Computer win!");
					System.exit(0);
				}
				else{
					sum=0;
				}
		//case6 in diagnal3
		for(int x=0;x<4;x++)
			for(int y=3;y>=0;y--)
				sum+=chees[x][y][x];
				//System.out.println("case6:"+sum);
				if(sum==4){
					win=1;
					System.out.println("You win!");
					System.exit(0);
				}
				else if(sum==40){
					win=2;
					System.out.println("Computer win!");
					System.exit(0);
				}
				else{
					sum=0;
				}
		//case6 in diagnal3
		for(int x=0;x<4;x++)
			for(int z=3;z>=0;z--)
				sum+=chees[x][x][z];
				//System.out.println("case7:"+sum);
				if(sum==4){
					win=1;
					System.out.println("You win!");
					System.exit(0);
				}
				else if(sum==40){
					win=2;
					System.out.println("Computer win!");
					System.exit(0);
				}
				else{
					sum=0;
				}
	}
}
	

