import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex01_sub extends JFrame{
	private JButton bt=new JButton("Ȯ��");
	private GridBagLayout gbl=new GridBagLayout();
	
	public Ex01_sub(String title){
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
	
	}
	public void init(){
		Container con=this.getContentPane(); //�۾������� ���λ��� �������
		con.setLayout(gbl);
		con.add( bt);
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x������ ���� //���ֻ���ϴ� ��� �޼ҵ�� ������ ����.
	}
}

public class Ex01 {
public static void main(String ar[]){
	Ex01_sub ex=new Ex01_sub("����");
}
}
