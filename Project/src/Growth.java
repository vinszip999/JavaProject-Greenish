import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Growth extends JFrame implements ActionListener{
   private String [] green = {"���Ѵܰ�", "���ϴܰ�", "���ĸ�-��ȭ�ܰ�", "��-��ȭ�ܰ�", "���� ���ܰ�"};
   private ImageIcon [] images = { new ImageIcon("./image/1_.png"),
         new ImageIcon("./image/2.png"),
         new ImageIcon("./image/3.png"),
         new ImageIcon("./image/4.png"),
         new ImageIcon("./image/5.png")};
   private JLabel imgLabel = new JLabel(images[0]); 
   private JComboBox<String> strCombo = new JComboBox<String>(green);

   public Growth() {
	  JButton btn = new JButton("�ڷΰ���");
	  btn.setBounds(800,800,120,120);
      btn.addActionListener(this);

      //gui �׸� �ٲٱ�
      try{
			UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//LookAndFeel Windows ��Ÿ�� ����
			SwingUtilities.updateComponentTreeUI(null) ;
		}catch(Exception e){
//			bottomInfo.setText("ERROR : LookAndFeel setting failed");
		}
      
	  //title �̸� ����
      setTitle("����ܰ� ����ϱ�");
      
      //icon ����
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image img = toolkit.getImage("./image/mi.png");
      setIconImage(img);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.add(strCombo);
      c.add(imgLabel);
      add(btn);
      

      strCombo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JComboBox<String> cb = (JComboBox<String>)e.getSource();
            int index = cb.getSelectedIndex();
            imgLabel.setIcon(images[index]);
         }
      });
      setSize(950, 910);
      setLocationRelativeTo(null); // ��� ����
      setVisible(true);
   }
   public static void main(String [] args) {
      new Growth();

   }
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      new ChoiceMenu();
      setVisible(false);	// �ڿ� â �Ⱥ��̰� �ϱ�
     
   }
}