import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex06_sub extends JFrame{
	
	private JTree tree=new JTree();
	private JTextArea jta=new JTextArea();
	
	private JSplitPane jsp=new JSplitPane();
	
	private BorderLayout bl=new BorderLayout();
	
	public Ex06_sub(String title){
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
		con.setLayout(bl);
		jsp.setLeftComponent(tree);
		jsp.setRightComponent(jta);
		con.add("Center", jsp);
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x������ ���� //���ֻ���ϴ� ��� �޼ҵ�� ������ ����.
	}
}

public class Ex06 {
public static void main(String ar[]){
	Ex06_sub ex=new Ex06_sub("����");
}
}


