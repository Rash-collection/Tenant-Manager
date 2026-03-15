/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package annot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>If not a long description the a FAST note.</p>
 * @author rash4
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, 
    ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.TYPE, 
    ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
public @interface Notes {
    String value();
}