/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package localExceptions;

/**
 *
 * @author rash4
 */
public class GroundFloorException extends RuntimeException{
    public GroundFloorException(){super("Ground floor must be one and only one for each rise.");}
    public GroundFloorException(String message){super(message);}
}