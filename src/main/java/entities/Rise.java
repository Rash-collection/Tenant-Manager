/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import localExceptions.GroundFloorException;

/**
 * <p>The building (body) that contains the rental-units.</p>
 * <p>
 * A visual example of the Rise structure.<br>
 * Suppose we have a rise of 4 columns × 5 floors (rows), meaning 5 floors and 4 apartments per floor.
 * </p>
 * <p>Visual 2D array as a table (floor labels, top floor first):</p>
 * <table border="3">
 *   <tr><th>Floor 5</th><td>A5</td><td>B5</td><td>C5</td><td>D5</td></tr>
 *   <tr><th>Floor 4</th><td>A4</td><td>B4</td><td>C4</td><td>D4</td></tr>
 *   <tr><th>Floor 3</th><td>A3</td><td>B3</td><td>C3</td><td>D3</td></tr>
 *   <tr><th>Floor 2</th><td>A2</td><td>B2</td><td>C2</td><td>D2</td></tr>
 *   <tr><th>Floor 1</th><td>A1</td><td>B1</td><td>C1</td><td>D1</td></tr>
 * </table>
 * <p>Notice that each floor is treated as a single row (stack) rather than a rectangular (2D)grid.</p>
 * 
 * @see     RiseHeights
 * @see     Floor
 * @see     Apartment
 * @see     Lease
 * @author rash4
 */
public class Rise {
    public Rise(Floor[] floors, String name){
        this.GF_INDEX = checkGroundLevel(floors);
        this.ROWS = floors;
    }
    /**
     * <p>Shallow copy constructor.</p>
     * @param neo the target rise object to copy.
     */
    public Rise(Rise neo, String newName){
        this(neo.ROWS, newName);
        
    }
    @annot.Status("Maybe just make a tool-like class,"
            + "that validate and constructs {@code Rise} objects.")
    public final static boolean validateFloorsArray(Floor[] floors){
        if(floors == null) throw new NullPointerException("floors array is null.");
        final int len = floors.length;
        if(len == 0) throw new IllegalArgumentException("floors array is empty.");
        for(int i = 0; i < len; i++){
            if(floors[i].TYPE == FloorType.GROUND);
        }
        
        
        return true;
    }
    /**
     * <p>checks if the floors array has any ground-level floor object.</p>
     * @param floors is the floor array to get a check.
     * @return zero if the building starts from the ground floor (no underground floors),
     *  otherwise the index of the ground floor in the array.
     * @throws GroundFloorException      if there's no ground floor in the array.
     * @throws IllegalArgumentException if the array is empty.
     * @throws NullPointerException     if the array is null.
     */
    final static int checkGroundLevel(Floor[] floors){
        if(floors == null) throw new NullPointerException("floors array is null.");
        final int len = floors.length;
        if(len == 0) throw new IllegalArgumentException("floors array is empty.");
        for(int i = 0; i < len; i++){
            if(floors[i] != null && floors[i].TYPE == FloorType.GROUND) return i;
        }
        throw new GroundFloorException("No ground level available in the array.");
    }
    public Floor get(int index){
        return this.ROWS[index];
    }
    /**
     * <p>Gets the apartment directly from the {@code Rise} object.</p>
     * @param row   the floor index.
     * @param col   the apartment index within the floor.
     * @return the {@link Apartment} at the specified floor and column
     * @throws      IndexOutOfBoundsException if either index is outside the valid range.
     * @see         Floor
     * @see         Apartment
     */
    public Apartment getUnit(int row, int col){
        return this.ROWS[row].COLS[col];
    }
    public int floorsNumber(){return this.ROWS.length;}
    final int GF_INDEX;
    final Floor ROWS[];
}