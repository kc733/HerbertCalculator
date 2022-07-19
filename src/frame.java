import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class frame extends JFrame implements ActionListener {
	
		frame() {
			
			//--------------- frame options ----------------------------//
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("kc733 Galleryr");
			this.setSize(500, 500);
			this.setResizable(false);
			this.setLocationRelativeTo(null); 
			this.setLayout(null);
			this.getContentPane().setBackground(new Color(0, 0, 0));
			
			// make head panel with text (main name)
			headPanel = new JPanel();
			headPanel.setBounds(15, 0, 450, 40);
			Border headBorder = BorderFactory.createEtchedBorder();
			headPanel.setBorder(headBorder);
			headPanel.setBackground(new Color(255, 255, 255));
			
			headLabel = new JLabel("kc733 Gallery");
			headLabel.setForeground(new Color(255, 201, 201));
			headLabel.setFont(new Font("Helvetica", Font.BOLD, 22));
			
			headPanel.add(headLabel);
			this.add(headPanel);
			this.setVisible(true);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
