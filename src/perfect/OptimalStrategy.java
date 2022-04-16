package src.perfect;

import src.game.StatesOfAnyGame;
import src.game.TicTacToeGame;
import src.utils.Utils;

public class Optimal_Tic_Tac_Toe extends TicTacToeGame {
    public static final int noSetting = 0;
    public static final int conditionWin  = 1;
    public static final int conditionLose = 2;
    public static final int conditionDraw = 3;
    private int[] possibleOutcomes;
    private int outcomeOfGame;

    public Optimal_Tic_Tac_Toe(){
        super(3,3,3);
        possibleOutcomes = new int[9];
        outcomeOfGame = noSetting;
    }

    public Optimal_Tic_Tac_Toe(Optimal_Tic_Tac_Toe base, int following){
        super(base,following);
        possibleOutcomes = new int[9];
        outcomeOfGame = noSetting;
    }
    
}
