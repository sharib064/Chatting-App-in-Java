/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.Icon;
/**
 *
 * @author S
 */

public class menuButton extends JButton{
    private Icon iconSimple;
    private Icon iconSelected;

    public Icon getIconSimple() {
        return iconSimple;
    }

    public void setIconSimple(Icon iconSimple) {
        this.iconSimple = iconSimple;
    }

    public Icon getIconSelected() {
        return iconSelected;
    }

    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }
    public menuButton(){
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }   
@Override
    public void setSelected(boolean b) {
        super.setSelected(b); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if(b){
            setIcon(iconSelected);
        }
        else{
            setIcon(iconSimple);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if(isSelected()){
            g.setColor(new Color(102,102,102));
            g.fillRect(0,getHeight()-2 ,getWidth(), getHeight());
        }
    }
    
}
