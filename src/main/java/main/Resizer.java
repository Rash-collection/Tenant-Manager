/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

import java.awt.Dimension;

/**
 * <p>Like contract for child components, when the container fires the resize event, 
 * the children/collection fires their own resize</p>
 * 
 * @author rash4
 */
@FunctionalInterface
public interface Resizer {
    /**
     * 
     * @param size The {@code size(Dimension)} of the parent AKA {@code contentPane} in this case.
     */
    void containerResized(Dimension size);
}