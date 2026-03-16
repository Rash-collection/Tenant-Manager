/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package localUtils;

/**
 * <p>Dynamic way to self-cast.</p>
 * <p>Only safe use, is on concrete classes.</p>
 * @author rash4
 */
public interface Chainable <T> {
    /**
     * <p>Method for self casting and chaining.</p>
     * @return  object of the declared {@code (T)}of subclass-type.
     */
    default T self(){return (T)this;}
}