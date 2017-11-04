package Chess;
class Queen extends pieces
{
	
    Queen(int ini_X,int ini_Y,int c)
	{
		super(ini_X,ini_Y,c);
		
		
	}

   
    public boolean ValidMove( int fin_X, int fin_Y) 
	{System.out.println(this.a+":"+this.b);
	System.out.println(fin_X+":"+fin_Y);
       int diff,i,j;
			diff=Math.abs(a - fin_X) ;
		       
	   if(fin_X < 0 || fin_X > 7 || a < 0 || a > 7 || fin_Y < 0 || fin_Y > 7 || b <0 || b > 7)
            return false;
		
		else
			
		if(b==fin_Y)										//vertical 
		{
			if(fin_X>a)
			{
				for(i=a+1;i<fin_X;i++)
				{
					if(Board.square[i][b].alive==true)
						
						return false;
				}
			}
			else 
				if(fin_X < a)
			{
				for(i=a-1;i>fin_X;i--)
				{
					if(Board.square[i][b].alive==true)
						return false;
				}
			}
			if(CanKill(fin_X,fin_Y)==true   || Board.square[fin_X][fin_Y].alive==false) 
				return true;
			else 
				return false;
		}
			
		else if(a==fin_X)					//horizontal
		{
			if(fin_Y>b)						
			{
				for(i=b+1;i<fin_Y;i++)			//fwd leap
				{	
					if(Board.square[a][i].alive==true)
						return false;
				}
			}
			else if(fin_Y<b)				
			{
				for(i=b-1;i>fin_Y;i--)
				{
					if(Board.square[a][i].alive==true) //bkwd leap
						return false;
				}
			}
			
			if(CanKill(fin_X,fin_Y)==true || Board.square[fin_X][fin_Y].alive==false)
				return true;
			else 
				return false;
		}
		
	else
	  if(a<fin_X)						//forward dioganal
		{
			if( Math.abs(b - fin_Y) != diff)  //position not dioganal 
				return false;
				
				
			if(fin_Y>b)
			{
				for(i=a+1,j=b+1;i<fin_X && j<fin_Y;i++,j++)		//right dioganal leap
				{
					if(Board.square[i][j].alive==true )
						return false;
				}
			}
			else
			{	
				for(i=a+1,j=b-1;i<fin_X &&j>fin_Y;i++,j--)		//left dioganal leap
				{
					if(Board.square[i][j].alive==true)
						return false;
				}	
			}
			
			if(CanKill(fin_X,fin_Y)==true)
				return true;
		}
		
		
		
		else 
		if(fin_X<a)												//backward 
		{
			
			if( Math.abs(b - fin_Y) != diff)  //position not dioganal 
				return false;
				
			
			if(fin_Y>b)
			{
				for(i=a-1,j=b+1;i>fin_X && j<fin_Y;i--,j++)		//right dioganal leap
				{
					if(Board.square[i][j].alive==true)
						return false;
				}
			}
			else
			{
				for(i=a-1,j=b-1;i>fin_X &&j>fin_Y;i--,j--)		//left dioganal leap
				{
					if(Board.square[i][j].alive==true)
						return false;
				}
			}
			if(CanKill(fin_X,fin_Y)==true)
				return true;
		}
		else
			return false;

     return false;   
    }


	
	
}