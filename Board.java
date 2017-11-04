package Chess;
import java.util.*;

public class Board 
{
	  
	 public static pieces square[][] = new pieces[8][8] ;
	 
       
     public Player Player1=new Player(0);
	 public Player Player2=new Player(1);
	
	public void display()
	{
		int i,j,k;
		System.out.println("--------------------------------------------------------------------\n");
		System.out.printf("\t");
		for( k=0;k<8;++k)
			System.out.printf("  %d \t",k);
		System.out.println("\n\n");
		for(i=0;i<8;++i)
		{
			for(j=0;j<8;++j)
			{   
		        String piece = Board.square[i][j].name();
				// System.out.println(piece);
		        if(j==0)
				  System.out.printf("%d \t",i);
			  	   
			   if(piece.equals("Empty"))
				   System.out.printf("-- \t");	
			   else
			   {	
                 	   
			   if ( square[i][j].color==0)
			   {   
				   
                     				   
		           if(piece.equals("King"))
					 System.out.printf("bK \t");  
				   else
				   if(piece.equals("Queen"))
					 System.out.printf("bQ \t"); 
					else
				   if(piece.equals("Rook"))
					 System.out.printf("bR \t");  
				 else
				   if(piece.equals("Bishop"))
					 System.out.printf("bB \t"); 
else				 
				   if(piece.equals("Knight"))
					 System.out.printf("bKt \t");  
				 else
				   if(piece.equals("Pawn"))
					 System.out.printf("bP \t");
				  
			   }
			   
			  else
				  if ( square[i][j].color==1)
			   {       
		          
				  
				  if(piece.equals("King"))
					 System.out.printf("wK \t");  
				   else
				   if(piece.equals("Queen"))
					 System.out.printf("wQ \t"); 
					else
				   if(piece.equals("Rook"))
					 System.out.printf("wR \t");  
				 else
				   if(piece.equals("Bishop"))
					 System.out.printf("wB \t"); 
else				 
				   if(piece.equals("Knight"))
					 System.out.printf("wKt \t");  
				 else
				   if(piece.equals("Pawn"))
					 System.out.printf("wP \t");
				   
			   }
			
			}
			
			}
			System.out.println("\n\n");
		}
		System.out.println("\n----------------------------------------------------------------------");
		
			
	}
	
     
	 
	

public void Start_Game()
	{
		
			boolean valid=false;
			int i,cho=1, oldX=8,oldY=8,newX=8,newY=8,win=0;
			
			Scanner scan=new Scanner(System.in);
			display();
			while(win==0)
			{
			while(cho==1)					
			{
				
				System.out.println("Enter position of the piece you wanna move\n");
				oldX=scan.nextInt();
				oldY=scan.nextInt();
				if( square[oldX][oldY].alive==false)
				{
					System.out.println("\nNo piece present\n");
					continue;
				}
				
				if( Player1.color != square[oldX][oldY].color )
				{
					System.out.println("\nIt's not your piece\n");
					continue;
				}
				System.out.println("\nEnter new position\n");
				newX=scan.nextInt();
				newY=scan.nextInt();
				
				//checking valid move 
				if(square[oldX][oldY]==Player1.king)
					valid=Player1.king.ValidMove(newX,newY);
				else  
					if(square[oldX][oldY]==Player1.queen)
					   valid=Player1.queen.ValidMove(newX,newY);
				else 
					if(square[oldX][oldY]==Player1.rook[0] )
					   valid=Player1.rook[0].ValidMove(newX,newY);
				else
					if(square[oldX][oldY]==Player1.rook[1] )
					   valid=Player1.rook[1].ValidMove(newX,newY);
				else 
					if(square[oldX][oldY]==Player1.bishop[0]) 
					   valid=Player1.bishop[0].ValidMove(newX,newY);
				else
					if(square[oldX][oldY]== Player1.bishop[1])
					   valid=Player1.bishop[1].ValidMove(newX,newY);
				else
					if(square[oldX][oldY]==Player1.knight[0])
					{  System.out.println("yoyo");
						valid=Player1.knight[0].ValidMove(newX,newY);}
				else 
					if(square[oldX][oldY]==Player1.knight[1])
					   valid=Player1.knight[1].ValidMove(newX,newY);
				else 
				{
					for(i=0;i<8;++i)
					{	
						if(square[oldX][oldY]==Player1.pawn[i] )
							valid=Player1.pawn[i].ValidMove(newX,newY);
					}
				}
				if(valid==false)
				{
					System.out.println("Invalid move");
					continue;
				}
				else
					break;
			}
			
			
			
			square[oldX][oldY].MakeMove(newX,newY);
			display();
			
			while(cho==1)					
				
			{
				
				System.out.println("Enter position of the piece you wanna move\n");
				oldX=scan.nextInt();
				oldY=scan.nextInt();
				if( square[oldX][oldY].alive==false)
				{
					System.out.println("\nNo piece present\n");
					continue;
				}
				
				if( Player2.color != square[oldX][oldY].color )
				{
					System.out.println("\nIt's not your piece\n");
					continue;
				}
				System.out.println("\nEnter new position\n");
				newX=scan.nextInt();
				newY=scan.nextInt();
				
				
				
				
				if(square[oldX][oldY]==Player2.king)
					valid=Player2.king.ValidMove(newX,newY);
				else
				if(square[oldX][oldY]==Player2.queen)
					valid=Player2.queen.ValidMove(newX,newY);
				else 
				if(square[oldX][oldY]==Player2.rook[0] )
					valid=Player2.rook[0].ValidMove(newX,newY);
				else 
				if(square[oldX][oldY]==Player2.rook[1] )
					valid=Player2.rook[1].ValidMove(newX,newY);
				else 
				if(square[oldX][oldY]==Player2.bishop[0]) 
					valid=Player2.bishop[0].ValidMove(newX,newY);
				else 
				if(square[oldX][oldY]==Player2.bishop[1])
					valid=Player2.bishop[1].ValidMove(newX,newY);
				else 
				if(square[oldX][oldY]==Player2.knight[0])
					valid=Player2.knight[0].ValidMove(newX,newY);
				else
				if(square[oldX][oldY]==Player2.knight[1])
					valid=Player2.knight[1].ValidMove(newX,newY);
				else 
				{
					for(i=0;i<8;++i)
					{	
						if(square[oldX][oldY]==Player2.pawn[i] )
						{
							valid=Player2.pawn[i].ValidMove(newX,newY);
							break;
						}
					}
				}
				if(valid==false)
				{
					System.out.println("Invalid move");
					continue;
				}
				else
					break;
			}
			square[oldX][oldY].MakeMove(newX,newY);
				
		display();
			}
		
	}
	
	
	
	

 
 
}