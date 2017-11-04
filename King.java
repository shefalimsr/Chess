package Chess;
 class King extends pieces{

 King(int x, int y,int c) 
	{   super(x,y,c);  
 }

    
    public boolean ValidMove(int fin_X, int fin_Y)
	{System.out.println(this.a+":"+this.b);
	System.out.println(fin_X+":"+fin_Y);
	   if(fin_X < 0 || fin_X > 7 || a < 0 || a > 7 || fin_Y < 0 || fin_Y > 7 || b <0 || b > 7)
            return false;
		
	   if((Math.abs(fin_X - a) == 1) && (fin_Y == b)  || (Math.abs(fin_Y - b) == 1) && (fin_X == a) || (Math.abs(fin_X - a) == 1) && (Math.abs(fin_Y - b) == 1))
           return true;
			
		if(CanKill(fin_X,fin_Y)==true || Board.square[fin_X][fin_Y].alive==false)
			return true;
		
        
       return false; 
    }

}