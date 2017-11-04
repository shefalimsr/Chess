package Chess;
import java.util.*;
public  abstract class pieces {
    
    public int color;
	public int a;
    public int b;
    public boolean alive;
	
	 public pieces(int x, int y,int c)
	{  
        
        this.a = x;
        this.b = y;
        this.alive=true;
		this.color=c;
		
    }
	
	
   
	public boolean ValidMove(int fin_X, int fin_Y)
	{if(fin_X < 0 || fin_X > 7 || a < 0 || a > 7 || fin_Y < 0 || fin_Y > 7 || b <0 || b > 7)
            return false;
	 return true;
	}
	
    
	
	public  boolean CanKill(int x,int y)
	{
		if(Board.square[x][y].alive==true)
		{
			if(Board.square[x][y].color==color)
			return false;							
			else
			return true;
		}
		else
			return true;							
		
	}
	
	
	public void kill(int x,int y)
	{
        Board.square[x][y].alive = false;
    }	
   

    public String name()
	{   
		return this.getClass().getSimpleName();
	}   
   
   
   
    

  public  void MakeMove(int x,int y)
	{
		if(Board.square[x][y].alive==true)
			kill(x,y);
        Board.square[x][y]  = Board.square[a][b];
		Board.square[a][b] = new Empty(a,b,-1);
		
		a=x;
		b=y;
	}

   
   

    
}