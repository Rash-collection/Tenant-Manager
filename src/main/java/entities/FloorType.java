/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package entities;

/**
 * <p>Floor type is based on it's level.</p>
 * <p>
 * there's only four floor types (Top, normal, ground and underground).<br>
 * * usually a normal building has one ground floor and maybe some normal floors.<br>
 * while the rest are optional, a building always has one {@link #GROUND}-floor and only one.<br>
 * - under the ground floor are the {@link #UNDERGROUND}-floor/s if they exist.<br>
 * - normal floors {@link #NORMAL}-floors are whatever built above the {@code ground-floor}, usually they're a repeat of each others.<br>
 * - top floors {@link #TOP}-floor/s marks the end of the tower, could be just like the {@code normal-floors} in this case better be just one top floor,<br>
 * mainly the top floor are special case, so if more than one, they must be different than the normal floors.
 * </p>
 * <table border="3">
 * <tr><th>Floor</th></tr>
 * <tr><td>Top  Floor 2 ------- (TF)2</td></tr>
 * <tr><td>Top  Floor 1 ------- (TF)1</td></tr>
 * <tr><td>---- Floor 4 ------- (NF)4</td></tr>
 * <tr><td>---- Floor 3 ------- (NF)3</td></tr>
 * <tr><td>---- Floor 2 ------- (NF)2</td></tr>
 * <tr><td>---- Floor 1 ------- (NF)1</td></tr>
 * <tr><td>Ground Floor ------- (GF)0</td></tr>
 * <tr><td>Underground Floor -1 (UF)1</td></tr>
 * <tr><td>Underground Floor -2 (UF)2</td></tr>
 * </table>
 * <p>This simple example displays how the usual tower would be like.</p>
 * @see     Floor
 * @author rash4
 */
public enum FloorType {
    UNDERGROUND,
    GROUND,
    NORMAL,
    TOP,
    ;
}