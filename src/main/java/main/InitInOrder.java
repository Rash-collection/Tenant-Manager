/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

/**
 *
 * @author rash4
 */
@FunctionalInterface
public interface InitInOrder extends Initializer{
    default void initializing(){
        javax.swing.SwingUtilities.invokeLater(this::initialize);
    }
}