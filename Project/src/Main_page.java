import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ImagePanel extends JPanel{
   private Image img;
   
   public ImagePanel(Image img) {
      this.img = img;
      setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
      setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
      setLayout(null);
   }
   public void paintComponent(Graphics g) {
      g.drawImage(img, 0, 0, null);
   }
}
public class Main_page extends JFrame implements ActionListener {
   public Main_page() {
      super("푸릇");
      
      //gui 테마 변경
      try{
			UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(null) ;
		}catch(Exception e){
//			bottomInfo.setText("ERROR : LookAndFeel setting failed");
		}
      setSize(830,830);
      setLocationRelativeTo(null);
      setVisible(true);
      
      JButton btn = new JButton("시작하기"); 
      btn.setBounds(350,700,250,50);
      
      btn.addActionListener(this);
      
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image img = toolkit.getImage("./image/mi.png");
      setIconImage(img);
      
      add(btn);
      ImagePanel panel = new ImagePanel(new ImageIcon("./image/1.png").getImage());
      add(panel);
      pack();
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }
   
   
   public static void main(String[] args) {
      new Main_page();      
      
   }


   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      new ChoiceMenu();
      setVisible(false);
   }
}