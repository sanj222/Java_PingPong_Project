import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{
    GameFrame()
    {
        setTitle("Ping Pong Game");
        //setLayout(null); nullifying the default settings
        getContentPane().setBackground(Color.black); //setting bg color
        GamePanel panel=new GamePanel(); //creating new game panel
        add(panel); //adding the panel to the frame
        //setSize(1000,555); //setting size
        //setFocusable(true);
        pack(); //used when we are having a panel to have same size of the frame as panel
        setResizable(false); //doesnt allow to change the size of frame
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        GameFrame obj=new GameFrame(); //creating new frame

    }


}
