package org.mobicents.ss7.management.console;

/**
 * 
 * @author amit bhayani
 *
 */
public interface ConsoleListener {
    
    public void commandEntered(String consoleInput);
    
    public void setConsole(Console console);

}