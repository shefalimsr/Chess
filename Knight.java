package Chess;
class Knight extends pieces
{

    Knight(int ini_X, int  ini_Y,int c)
	{ super(ini_X, ini_Y,c);  }

    
    public boolean ValidMove(int fin_X, int fin_Y)
	{System.out.println(this.a+":"+this.b);
	System.out.println(fin_X+":"+fin_Y);
               if(fin_X < 0 || fin_X > 7 || this.a < 0 || this.a > 7 || fin_Y < 0 || fin_Y > 7 || this.b <0 || this.b > 7)
            return false;
		else
        if(CanKill(fin_X, fin_Y)==false || Board.square[fin_X][fin_Y].alive==false)				
			return false;
		else
		if( Math.abs( this.a - fin_X) == 2 && Math.abs(this.b - fin_Y) == 1  )    
			return true;
			
		else 
		   if( Math.abs( this.a - fin_X) == 1 && Math.abs(this.b - fin_Y) == 2  )    
			return true;
			
		return false;
		
    }

}