import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class ChoiceMenu implements ActionListener {
public class ChoiceMenu extends JFrame implements ActionListener {
   
   public ChoiceMenu() {
      // ������ ����
        JFrame frm = new JFrame("�޴� ����");
 
        // ������ ũ�� ����
        frm.setSize(450, 450);
 
        // �������� ȭ�� ����� ��ġ
        frm.setLocationRelativeTo(null);
 
        // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // ���̾ƿ� ����
        frm.getContentPane().setLayout(null);
 
        // ��ư ����
        JButton btn1 = new JButton("����ܰ�");
        JButton btn2 = new JButton("��������");

        
        // ����ܰ� ��ư Ŭ���� �ҷ�����
        btn1.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            new Growth();
            frm.setVisible(false);
            
         }
      });
        
        // �������� Ŭ���� �ҷ�����
        btn2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            new Journal();
            frm.setVisible(false);
         }
      });
 
        // �� ��ư ��ġ�� ũ�� ����
        btn1.setBounds(140, 50, 150, 50);
        btn2.setBounds(140, 250, 150, 50);
//        btn1.setBounds(1200, 1300, 150, 50);
//        btn2.setBounds(1000, 1300, 150, 50);

 
        // �� �����ӿ��ٰ� ��ư �߰�
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
 
        // �������� ���̵��� ����
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

