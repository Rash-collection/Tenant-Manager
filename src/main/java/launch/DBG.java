/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package launch;

import coms.Command;
import coms.CommandTree;

/**
 *
 * @author rash4
 */
public class DBG extends coms.Console{
    DBG(){super();}
    
    @Override public void initialize(){
        super.initialize(true);
        super.setCommands(new CMR(this).createCommands());
    }
    class CMR extends coms.Commanding{
        CMR(DBG dbg){super(dbg);}
        CMR createCommands(){
            final var help  = new CommandTree();
            final var exit  = new Command(arg->{System.exit(0);  return true;});
            final var clear = new Command(arg->{DBG.this.clear();return true;});
            help.setDirectCom(  new Command(super::getHelp));
            help.setCom("full", new Command(super::fullHelpList));
            this    .addCommand(help,  "help")
                    .addCommand(clear, "clear")
                    .addCommand(exit,  "exit")
                    ;
            return this;
        }
    }
}