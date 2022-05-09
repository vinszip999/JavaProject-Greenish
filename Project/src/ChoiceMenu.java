import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class ChoiceMenu implements ActionListener {
public class ChoiceMenu extends JFrame implements ActionListener {
   
   public ChoiceMenu() {
      // 프레임 생성
        JFrame frm = new JFrame("메뉴 고르기");
 
        // 프레임 크기 설정
        frm.setSize(450, 450);
 
        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);
 
        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // 레이아웃 설정
        frm.getContentPane().setLayout(null);
 
        // 버튼 생성
        JButton btn1 = new JButton("성장단계");
        JButton btn2 = new JButton("일지쓰기");

        
        // 성장단계 버튼 클래스 불러오기
        btn1.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            new Growth();
            frm.setVisible(false);
            
         }
      });
        
        // 일지쓰기 클래스 불러오기
        btn2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            new Journal();
            frm.setVisible(false);
         }
      });
 
        // ★ 버튼 위치와 크기 설정
        btn1.setBounds(140, 50, 150, 50);
        btn2.setBounds(140, 250, 150, 50);
//        btn1.setBounds(1200, 1300, 150, 50);
//        btn2.setBounds(1000, 1300, 150, 50);

 
        // ★ 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
 
        // 프레임이 보이도록 설정
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
   }
   
    public static void main(String[] args) {
 

    }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
   }

 
}

