package Chess;
class Pawn extends pieces
{
	
	int fst_time ;
 Pawn(int ini_X, int ini_Y, int c)
 {   super(ini_X,ini_Y,c);
    
	   alive=true;
	   fst_time=1;
 
 }

    
    public boolean ValidMove(int fin_X, int fin_Y) 
	{System.out.println(this.a+":"+this.b);
	System.out.println(fin_X+":"+fin_Y);
               if(fin_X < 0 || fin_X > 7 || a < 0 || a > 7 || fin_Y < 0 || fin_Y > 7 || b <0 || b > 7)
            return false;
		
		else 
		  
	if(this.color=='0')		
		{
			
			
			if( fst_time == 1 )		
			{
				if(fin_X== a+2 && fin_Y== b && Board.square[a+2][b].alive==false)
				{	if(Board.square[a+1][b].alive==true)
					  return false;
				    else
					  return true;
				}
				
				else 
					if(fin_X== a+1 && fin_Y== b && Board.square[a+1][b].alive==false)
							return true;
					if(CanKill(fin_X,fin_Y)==true)		
				{
					if(fin_X==a+1 && (fin_Y==b+1 || fin_Y==b-1))
						return true;
					else 
						return false;
				}
				else
					return false;
			}
			
			
			
			else
			{
				if(fin_X==a+1 && fin_Y==b)
					return true;
				else
					if(CanKill(fin_X,fin_Y)==true)
				{
					if(fin_X==a+1 && (fin_Y==b+1 || fin_Y==b-1))
						return true;
					else
						return false;
				}
				else	
					return false;
			}
		}
		
		
		else	  			  //white
		{
			if(fst_time == 1 )
			{
				if(fin_X== a-2 && fin_Y== b && Board.square[a-2][b].alive==false)
				{	if(Board.square[a-1][b].alive==true)
					  return false;
				    else
					  return true;
				}
				
				else 
					if(fin_X== a-1 && fin_Y== b && Board.square[a-1][b].alive==false)
						return true;
				else
					if(CanKill(fin_X,fin_Y)==true)		
				{
					if(fin_X==a-1 && (fin_Y==b-1 || fin_Y==b-1))
						return true;
					else 
						return false;
				}
				else
					return false;
			}
			else
			{
				if(fin_X==a-1 && fin_Y==b)
					return true;
				else 
					if(CanKill(fin_X,fin_Y)==true)
				{
					if(fin_X==a-1 && (fin_Y==b+1 || fin_Y==b-1))
						return true;
					else
						return false;
				}
				else	
					return false;
			}
		}
	
	}
}