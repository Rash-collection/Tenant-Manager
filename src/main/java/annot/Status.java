/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package annot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Almost an all purpose annotation for a very short status description.</p>
 * @author rash4
 */
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD,
        ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, 
        ElementType.TYPE, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.CLASS)
public @interface Status {
    String value();
}