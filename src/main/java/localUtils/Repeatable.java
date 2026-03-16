/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package localUtils;

/**
 * <p>Repeat able methods.</p>
 * @author rash4
 */
@FunctionalInterface
public interface Repeatable {
    /**The method to be repeated upon calling the {@link #repeat(int)} method.*/
    void repetitive();
    /**
     * <p>Repeats the {@link #repetitive()} method *times.</p>
     * @param times always positive safe, the times to repeat invoking the method.
     */
    default void repeat(int times){
        if(times == 0)return;
        else if(times < 0)times *= -1;
        if(times == 1)this.repetitive();
        for(int i = 0; i < times; i++){
            this.repetitive();
        }
    }
}