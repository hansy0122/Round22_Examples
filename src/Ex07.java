import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex07_sub extends JFrame{
	
	private BorderLayout bl=new BorderLayout();
	
	private JToolBar jtb=new JToolBar();
	private JButton jbt1=new JButton("1��");
	private JButton jbt2=new JButton(new ImageIcon("a.gif"));
	private JButton jbt3=new JButton("3��");
	
	private JTabbedPane jtp=new JTabbedPane();
	private JButton jbt4=new JButton("4��");	
	private JButton jbt5=new JButton("5��");
	private JButton jbt6=new JButton("6��");
	private JPanel jp1=new JPanel();
	private JPanel jp2=new JPanel();
	private JPanel jp3=new JPanel();
	
	
	public Ex07_sub(String title){
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
		jtb.add(jbt1);
		jtb.addSeparator();
		jtb.add(jbt2);
		jtb.addSeparator();
		jtb.add(jbt3);
		con.add("North", jtb);
		jp1.setBackground(Color.red);
		jp2.setBackground(Color.BLUE);
		jp3.setBackground(Color.green);
		jtp.addTab("1���г�", jp1);
		jtp.addTab("2���г�",jp2);
		jtp.addTab("3���г�", jp3);
	
		con.add("Center",jtp);
		
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x������ ���� //���ֻ���ϴ� ��� �޼ҵ�� ������ ����.
	}
}

public class Ex07 {
public static void main(String ar[]){
	Ex07_sub ex=new Ex07_sub("����");
}
}


