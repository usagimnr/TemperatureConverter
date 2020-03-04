/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

/**
 *
 * @author usagi
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TempConverter extends JFrame{
    JLabel GUIConvert, mainLabel, returnLabel;
    JTextField textTemp;
    JButton calculateBtn;
    TempConverter(){
        super("Fahrenheit to Celsius Temperature Convertor");
        
        GUIConvert = new JLabel("Fahrenheit to Celsius Temperature Converter", SwingConstants.CENTER);
        GUIConvert.setForeground(Color.red);
        mainLabel = new JLabel("Fahrenheit temperature:");
        textTemp = new JTextField("", 8);
        returnLabel = new JLabel("Celsius Temperature");
        calculateBtn = new JButton("Convert");
        
        add(GUIConvert, BorderLayout.NORTH);
        add(mainLabel, BorderLayout.WEST);
        add(textTemp, BorderLayout.CENTER);
        add(returnLabel, BorderLayout.EAST);
        add(calculateBtn, BorderLayout.SOUTH);
        
        calculateBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double tempF, tempC;
                tempF = Double.parseDouble(textTemp.getText());
                tempC = (5.0/9.0)*(tempF-32);
                returnLabel.setText((String.format("%.1f %s", tempC, "degree Celsius.")));
            }
        });
        
        setSize(350, 110);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TempConverter();
    }
    
}
