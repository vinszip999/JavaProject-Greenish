import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Growth extends JFrame implements ActionListener{
   private String [] green = {"씨앗단계", "새싹단계", "이파리-발화단계", "꽃-발화단계", "성장 끝단계"};
   private ImageIcon [] images = { new ImageIcon("./image/1_.png"),
         new ImageIcon("./image/2.png"),
         new ImageIcon("./image/3.png"),
         new ImageIcon("./image/4.png"),
         new ImageIcon("./image/5.png")};
   private JLabel imgLabel = new JLabel(images[0]); 
   private JComboBox<String> strCombo = new JComboBox<String>(green);

   public Growth() {
	  JButton btn = new JButton("뒤로가기");
	  btn.setBounds(800,800,120,120);
      btn.addActionListener(this);

      //gui 테마 바꾸기
      try{
			UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(null) ;
		}catch(Exception e){
//			bottomInfo.setText("ERROR : LookAndFeel setting failed");
		}
      
	  //title 이름 지정
      setTitle("성장단계 기록하기");
      
      //icon 변경
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
      setLocationRelativeTo(null); // 가운데 설정
      setVisible(true);
   }
   public static void main(String [] args) {
      new Growth();

   }
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      new ChoiceMenu();
      setVisible(false);	// 뒤에 창 안보이게 하기
     
   }
}