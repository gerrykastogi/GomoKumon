package Player;

import java.util.*;
/**
 * Created by Gerry on 11/28/2015.
 */
public class Player {
    // attribute
    private int playerID;

    // ctor
    public Player(){
        playerID = 0;
    }

    // method
    public void setPlayerID(int _playerID){
        playerID = _playerID;
    }

    public int getPlayerID(){
        return playerID;
    }
}
