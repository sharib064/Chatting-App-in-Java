/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Jframe;

/**
 *
 * @author S
 */

public class PublicEvent {
    private static PublicEvent instance;

    private EventChat eventchat;
    public static PublicEvent getInstance(){
        if(instance==null){
            instance=new PublicEvent();
        }
        return instance;
    }
    /**
     * @param args the command line arguments
     */
    private PublicEvent(){
        
    }
    public void addEventChat(EventChat event){
        this.eventchat=event;
    }

    public EventChat getEventchat() {
        return eventchat;
    }
}
