/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package localExceptions;

/**
 *
 * @author rash4
 */
public class RiseHeightException extends RuntimeException{
    public RiseHeightException(){super("Rise Floors can't be less than one.");}
    public RiseHeightException(String message){super(message);}
}