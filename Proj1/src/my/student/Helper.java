package my.student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priya Rao
 */
public class Helper {
    public static String decodeStatus(boolean status){
        if (status)
            return "Paused";
        else
            return "Not Paused";
    }
    
    public static boolean encodeStatus(String status){
        if (status.equals("Paused"))
            return true;
        else
            return false;
    }
}
