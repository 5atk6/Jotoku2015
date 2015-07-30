//http://homepage1.nifty.com/Ike/katsunari/howto_kihon.html
public class Rule {

	GameState gs = new GameState();
	private boolean gameStateForRule[][] = new boolean[GameState.SIZE][GameState.SIZE];

	//座標(x, y)の石が囲まれているかどうかを判定するメソッド
	//ダメがあるとfalseを返す
	public boolean checkAroundStone(int color,int x, int y) {
		boolean flag;
		if (gameStateForRule[x][y]) {
			return true;
		}
		gameStateForRule[x][y] = true;
		if (GameState.gameState[x][y] == 0)
			return false;
		if(GameState.gameState[x][y] == color){
			if(x > 0){
				flag = checkAroundStone(color, x-1, y);
				if(!flag)
					return false;
			}
			
			if(y > 0){
				flag = checkAroundStone(color, x, y-1);
				if(!flag)
					return false;
			}
			
			if(x < GameState.SIZE){
				flag = checkAroundStone(color, x+1, y);
				if(!flag)
					return false;
			}
			
			if(y < GameState.SIZE){
				flag = checkAroundStone(color, x, y+1);
				if(!flag)
					return false;
			}
		}
		return true;
	}
	
	public void removeStone(int color,int x, int y){
		
	}
}
