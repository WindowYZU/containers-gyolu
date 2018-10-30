/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.containers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class GlassPaneSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
        frame.setLayout(new FlowLayout());
        
        JButton button=new JButton("Test");
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
            }
        });
        
        JPanel panel=(JPanel) frame.getGlassPane();
        //1. panel setVisible true
        //2. add mouse listener to panel
        //3. e.consume
        panel.setVisible(true);
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                e.consume();
            }
            
        });
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
        ////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
