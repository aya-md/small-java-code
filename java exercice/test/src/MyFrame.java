import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
public MyFrame(){
		this.setVisible(true);
		this.setSize(600,420);
		this.setTitle("my first frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("src/Les 100 plus belles photos non photoshopées.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(45,200,134));
}
}