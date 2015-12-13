/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokumon;

/**
 *
 * @author X450
 */
public class detailRooms {
    private int roomId;
    private String roomName;
    private String roomMaster;
    private int numPlayers;
    
    public void setRoomId(int rId){
        roomId = rId;
    }
    
    public void setRoomName(String rName){
        roomName = rName;
    }
    
    public void setRoomMaster(String rMaster){
        roomMaster = rMaster;
    }
    
    public void setNumPlayers(int nPlayers){
        numPlayers = nPlayers;
    }
    
    public int getRoomId(){
        return roomId;
    }
    
    public String getRoomName(){
        return roomName;
    }
    
    public String getRoomMaster(){
        return roomMaster;
    }
    
    public int getNumPlayers(){
        return numPlayers;
    }
    
    public String toString(){
        return "test";
    }
    
}
