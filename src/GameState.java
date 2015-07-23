
public class GameState {
	public GameState() {
		// TODO Auto-generated constructor stub
	}
	
	static final int SIZE = 9;
	public static int gameState[][] = new int[SIZE][SIZE];
	final int BLACK = 1, WHITE = -1;
	public static int countStone = 0;
	
	public void resetBoard(){
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				gameState[i][j] = 0;
			}
		}
	}
	public void changeGameState(int x, int y) {
		if(countStone%2==1)
			gameState[x][y] = BLACK;
		else
			gameState[x][y] = WHITE;
		countStone++;
	}
}
