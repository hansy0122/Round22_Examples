import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex04_sub extends JFrame{
	private JFileChooser jfc=new JFileChooser(".");
	
	public Ex04_sub(String title){
	super(title);
	
	this.init();
	this.start();
	
	super.setSize(300,200);
	Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
	Dimension frm=this.getSize();
	int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
	int ypos=(int)(screen.getHeight()/2-frm.getWidth()/2);
	super.setLocation(xpos, ypos);
	super.setResizable(false);
	super.setVisible(true);
	
	
	try{Thread.sleep(2000);
	}catch(InterruptedException e){}
	
	String str=JOptionPane.showInputDialog(this,"�̸�=","�Է�!",JOptionPane.QUESTION_MESSAGE);
	System.out.println("str"+str);
	
	/*int x=JOptionPane.showConfirmDialog(this,"������ �����Ͻðڽ��ϱ�?","����",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
	System.out.println(x);*/
	//JOptionPane.showMessageDialog(this, "����Դϴ�","���",JOptionPane.WARNING_MESSAGE); // �������� dialog�� ���� icon����
	
	/*try{Thread.sleep(2000);
	}catch(InterruptedException e){}
	
	Color cc=JColorChooser.showDialog(this, "������", Color.black);
	System.out.println("cc="+cc);
	
	try{Thread.sleep(2000);
	}catch(InterruptedException e){}
	
	int x=jfc.showOpenDialog(this); //jfc.showSaveDialog(this);
	System.out.println(x); //x�� �����ư Ŭ���� 0 ��� Ȥ�� xŬ���� 1
*/	}
	public void init(){
		Container con=this.getContentPane(); //�۾������� ���λ��� �������
		
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x������ ���� //���ֻ���ϴ� ��� �޼ҵ�� ������ ����.
	}
}

public class Ex04 {
public static void main(String ar[]){
	Ex04_sub ex=new Ex04_sub("����");
}
}
