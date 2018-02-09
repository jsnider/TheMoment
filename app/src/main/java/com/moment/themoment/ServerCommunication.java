package com.moment.themoment;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ServerCommunication {
    /**
     * Method to send JSON to the server, unless you have added a "type" to your JSON then you
     * should use another function that does this for you.
     * @param json
     * @return
     */
    public <T> void SendToServer(final String json) {
        //TODO send json to server
        return;
    }

    /**
     * Send a request to the server and depending on whatCase to different PHP files. Returns json
     * @param json
     * @param whatCase
     * @return json
     */
    private String requestFromServer(final String json, Integer whatCase){
        //TODO request server for response
        return null;
    }

    /**
     * Save a player to the database. Should return ID to the user that should be updated on the
     * to keep track in the communication
     * @param player
     * @return ID
     */
    public Integer SavePlayerToDB(Player player){
        //TODO convert param to JSON and run sendTOServer
        return 0;
    }

    /**
     * When creating a room you should save in the database to be able to start the session and
     * so that people can enter the room, returns id number for room
     * @param room
     * @return ID
     */
    public Integer SaveRoomToDB(Room room) {
        //TODO convert param to JSON and run sendTOServer
        return 0;
    }

    /**
     * Tries to add player to the room, will return room if succeeding.
     * @param player
     * @param roomID
     * @return
     */
    public <T> void JoinRoomInServer(Player player, Integer roomID){
        //TODO convert param to JSON and run sendTOServer
        return;
    }

    /**
     * Sends claim to server, will return true or false depending on if sent.
     * @param player
     * @param room
     * @param claim
     * @return
     */
    public Boolean SendClaimToServer(Player player, Room room, Claim claim){
        //TODO convert param to JSON and run sendTOServer
        return false;
    }

}