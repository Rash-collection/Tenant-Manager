/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package entities;

/**
 * <p>Apartment stats always depends on the contract {@link entities.Lease} if not {@link #UNAVAILABLE}.</p>
 * <p>
 * Normally it's stats be one of the two ({@link #RENTED} or {@link #AVAILABLE}).<br>
 * <ol>
 * <li>{@link #AVAILABLE} : is the initial value, like saying ready for new {@code Lease}.</li>
 * <li>{@link #RENTED} : when the apartment's lease aka {@link Apartment#lease} is initialized.</li>
 * <li>{@link #UNAVAILABLE} : when there's a special reason that the {@code Apartment} can't have residents, like (but not limited to) broken. hence the {@code Lease} can't be initialized unless fixed. </li>
 * </ol>
 * </p>
 * @see     entities.Apartment
 * @see     entities.Lease
 * @author rash4
 */
public enum ApartmentStats {
    UNAVAILABLE,
    AVAILABLE,
    RENTED,
    ;
}