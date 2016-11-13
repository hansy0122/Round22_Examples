import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex05_sub extends JFrame{
	private BorderLayout bl=new BorderLayout();
	
	private JDesktopPane pane=new JDesktopPane();
	
	private JInternalFrame jif1=new JInternalFrame("1��",true,true,true,true);
	private JInternalFrame jif2=new JInternalFrame("2��",true,true,true,true);
	private JInternalFrame jif3=new JInternalFrame("3��",true,true,true,true);
	
	public Ex05_sub(String title){
	super(title);
	
	this.init();
	this.start();
	
	super.setSize(400,400);
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
			con.setLayout(bl);
			jif1.setBounds(0,0,200,150);
			jif2.setBounds(20,20,200,150);
			jif3.setBounds(40,40,200,150);
			pane.add(jif1);
			pane.add(jif2);
			pane.add(jif3);
			jif1.setVisible(true);
			jif2.setVisible(true);
			jif3.setVisible(true);
			con.add("Center", pane);
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x������ ���� //���ֻ���ϴ� ��� �޼ҵ�� ������ ����.
	}
}

public class Ex05 {
public static void main(String ar[]){
	Ex05_sub ex=new Ex05_sub("����");
}
}


