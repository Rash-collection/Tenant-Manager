/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>The 'contract' of the apartment that has all the information.</p>
 * @author rash4
 */
@annot.Status("PlaceHolder for now(14/03)")
public class Lease {
    public Lease(int initialPreiod){
        this.START = this.lastLog = LocalDateTime.now();
        this.HISTORY = new StringBuilder();
        
        this.setInitialPeriod(initialPreiod);
    }
    /**not necessarily needed, depends on it's components definition.*/
    @annot.Status("Tempo till the class is implemented")
    public Lease(Lease neo){
        this.lastLog = LocalDateTime.now();
        this.START = neo.START;
        this.HISTORY = new StringBuilder();
        
        
        this.setInitialPeriod(1);
    }
    protected final void setInitialPeriod(int months){
        this.firstTimeInit++;
        if(this.firstTimeInit > 0) 
            throw new UnsupportedOperationException(Lease.class.getName() +
                    ".this.setInitialPeriod(int) method is one time use."
        );
        this.append = this.START.plusMonths(months);
//        this.logs("Lease has been initialized.")
//                .logs("Lease started at :\n\t")
//                .logs(this.START.toString())
//                .logs("");
    }
    public final void appendPeriod(int months){
        this.append = this.append.plusMonths(months);
    }
    protected void logs(String msg){
        if(msg == null || msg.isBlank()) return;
        final var logs = msg.trim().split("\\s+");
        this.HISTORY.append(msg);
        final int len = logs.length;
        for(int i = 0; i < len; i++){
            
        }
    }
    protected Lease log(String msg){
        if(msg == null || msg.isBlank()) return this;
        final var logs = msg.trim().split("\\s+");
        final int len = logs.length;
        this.HISTORY
                .append("")
                .append(logs[0])
            ;
        return this;
    }
    int firstTimeInit = -1;
    final StringBuilder HISTORY;
    final LocalDateTime START;
    LocalDateTime append;
    LocalDateTime lastLog;
}