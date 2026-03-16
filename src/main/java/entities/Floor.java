/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 * <p>The represent the row of the residential building.</p>
 * 
 * @see     FloorType
 * @see     Apartment
 * @author rash4
 */
public class Floor {
    public Floor(FloorType type, Apartment[] apartments){
        this.COLS = apartments;
        this.TYPE = type;
    }
    /**
     * <p>Shallow copy constructor.</p>
     * @param neo the target floor object to copy.
     */
    public Floor(Floor neo){
        this.COLS = neo.COLS;
        this.TYPE = neo.TYPE;
        
    }
    public int unitsNumber(){return this.COLS.length;}
    final Apartment COLS[];
    final FloorType TYPE;
}