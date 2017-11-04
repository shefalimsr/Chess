package Chess;
import java.util.*;
class Player 
{
   public int color;
   public Rook rook[] = new Rook[2];
	public Bishop bishop[] = new Bishop[2];
	public Pawn pawn[] = new Pawn[8];
	public Knight knight[]=new Knight[2]; 
	public King king = new King(0,0,1);
	public Queen queen = new Queen(0,0,1);
	static Empty emp[][]= new Empty[8][8];
    
   
  Player(int col)
  {    
      
        int i,j;
		this.color=col;
		for(i=0;i<8;i++)
			{   
				for(j=0;j<8;j++)
				  emp[i][j]=new Empty(i,j,-1)	;
			}
		
	 if(this.color == 0)  
	     {   
			
			
			
	        System.out.println("black created");
            rook[0]= new Rook(0, 0 ,0);
			rook[1]= new Rook(0, 7,0);
			bishop[0]= new Bishop(0, 2,0);
			bishop[1]= new Bishop(0, 5,0);
			knight[0]= new Knight(0, 1,0);
			knight[1]= new Knight(0, 6,0);
			queen= new Queen(0, 3,0);
			king= new King(0, 4,0);
			
			
			for(i=0; i<8; i++)
			{   pawn[i] = new Pawn(1,i,0);
                
            }
			
			Board.square[0][4]=king;			//placing pieces in intial position
			Board.square[0][2]=bishop[0];
			Board.square[0][5]=bishop[1];
			Board.square[0][0]=rook[0];
			Board.square[0][7]=rook[1];
			Board.square[0][1]=knight[0];
			Board.square[0][6]=knight[1];
			Board.square[0][3]=queen;
			
			
			for(i=0;i<8;i++)
				Board.square[1][i]=pawn[i];
			
			for(i=2;i<6;i++)
			{
				for(j=0;j<8;j++)
				{
					Board.square[i][j]=emp[i][j];
				}
			}
            
        }
		else if(this.color == 1)  
	     {
			
			 System.out.println("white created");
			rook[0]= new Rook(7, 0,1);
			rook[1]= new Rook(7, 7,1);
			bishop[0]= new Bishop(7,2,1);
			bishop[1]= new Bishop(7,5,1);
			knight[0]= new Knight(7,1,1);
			knight[1]= new Knight(7,6,1);
			queen= new Queen(7,3,1);
			king= new King(7,4,1);
			
			
			for(i=0; i<8; i++)
			{   pawn[i] = new Pawn(6,i,1);
               
            }
            Board.square[7][4]=king;			//placing pieces in intial position
			Board.square[7][2]=bishop[0];
			Board.square[7][5]=bishop[1];
			Board.square[7][0]=rook[0];
			Board.square[7][7]=rook[1];
			Board.square[7][1]=knight[0];
			Board.square[7][6]=knight[1];
			Board.square[7][3]=queen;
			for(i=0;i<8;++i)
				Board.square[6][i]=pawn[i];
			
			for(i=2;i<6;i++)
			{
				for(j=0;j<8;j++)
				{
					Board.square[i][j]=emp[i][j];
				}
			}
		
        }
		 
  }
  
  
  
  
}

   

   

  


    