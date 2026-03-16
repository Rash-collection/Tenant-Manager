/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import localExceptions.RiseHeightException;

/**
 * <p>The Rise-height (tower) low, mid, high and skyscraper.</p>
 * <ol>Terms :
 * <li>Low: 1~4 xfloors.</li>
 * <li>Mid: 5~12 xfloors.</li>
 * <li>High: 13+ xfloors. depends on the Skyscraper's height definition.</li>
 * <li>Skyscraper: 40+ xfloors. depends on the City.</li>
 * </ol>
 * @see     Rise
 * @author rash4
 */
public enum RiseHeights {
    /**when a zero or negative value, for error handling.*/
    NULL,
    /**(1 - 4)x floors.*/
    LOW_RISE,
    /**(5 - 12)x floors.*/
    MID_RISE,
    /**
     * (13 - 39)x floors.
     * @see     #SKYSCRAPER_MIN_HEIGHT
     */
    HIGH_RISE,
    /**
     * (40+?)x floors.
     * @see     #SKYSCRAPER_MIN_HEIGHT
     */
    SKYSCRAPER
    ;
    /**
     * <p>Global utility method mainly to-auto define the RiseHeight in the constructor or on it's initialize-method!</p>
     * @param floors    the floors number.
     * @return          the RiseHeight value.
     */
    public static RiseHeights riseDefinition(int floors){
        if(floors < 1) throw new RiseHeightException("floor " +
                floors + " must never be less than one.");
        else if(floors < 5) return LOW_RISE;
        else if(floors < 13) return MID_RISE;
        else if(floors < SKYSCRAPER_MIN_HEIGHT) 
            return HIGH_RISE;
        else return SKYSCRAPER;
    }
    /**As the naming, it decides where the {@link #HIGH_RISE} maximum stops and where the {@link #SKYSCRAPER} starts.*/
    private final static int SKYSCRAPER_MIN_HEIGHT = 40;
}