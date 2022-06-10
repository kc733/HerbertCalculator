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

	JPanel headPanel;
	JLabel headLabel;
	JLabel imgLabel;
	ImageIcon likeIcon;
	
	JLabel stImgLabel1;
	JLabel stImgLabel2;
	ImageIcon stIcon1;
	ImageIcon stIcon2;
	
	
		frame() {
			
			//--------------- frame options ----------------------------//
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Herbert's Mage Death Calculator");
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
			
			headLabel = new JLabel("HERBERT'S MAGE DEATH CALCULATOR");
			headLabel.setForeground(new Color(255, 201, 201));
			headLabel.setFont(new Font("Helvetica", Font.BOLD, 22));
			
			// ---------------------------------- work on this 
			stImgLabel1 = new JLabel();
			stImgLabel1.setBounds(10, 0, 150, 150);
			stImgLabel1.setOpaque(true);
			stImgLabel1.setForeground(Color.white);
			// -----------------------------------------WORK
			
			
			//---------------- like image -----------------------//
			// create label for image
			imgLabel = new JLabel();
			imgLabel.setBounds(160, 60, 150, 150);
			imgLabel.setOpaque(true);
			
			// make a buffered image to resize image
			BufferedImage bufLikeImg = null;
			
			try {
				bufLikeImg = ImageIO.read(new File("C:\\Users\\herhe\\eclipse-workspace\\HerbertCalculator\\src\\like.jpg"));
			} catch (IOException e) {
			    e.printStackTrace();
			}
			
			Image dimg = bufLikeImg.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(),
			        Image.SCALE_SMOOTH);
			
			// set resized image to image icon
			likeIcon = new ImageIcon(dimg);
			imgLabel.setIcon(likeIcon);
			
			//---------------- /like image -----------------------//
			
			
			
			//-------------------------------------------- adds
			headPanel.add(headLabel);
			// this.setIconImage(likeIcon.getImage());
			this.add(imgLabel);
			this.add(headPanel);
			this.setVisible(true);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
