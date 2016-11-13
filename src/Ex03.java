import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex03_sub extends JFrame {
	private ImageIcon ii1=new ImageIcon("a.gif");
	private ImageIcon ii2=new ImageIcon("b.gif");
	private ImageIcon ii3=new ImageIcon("c.gif");
	private ImageIcon ii4=new ImageIcon("d.gif");
	private JToggleButton jtb1 = new JToggleButton("1");
	private JToggleButton jtb2 = new JToggleButton(ii2);
	private JToggleButton jtb3 = new JToggleButton("3",ii3);
	private JToggleButton jtb4 = new JToggleButton("4",ii4);
	private ButtonGroup bg=new ButtonGroup();
	
	private GridLayout gl = new GridLayout(1, 4, 5, 5);

	public Ex03_sub(String title) {
		super(title);

		this.init();
		this.start();

		super.setSize(300, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = this.getSize();
		int xpos = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2 - frm.getWidth() / 2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);

	}

	public void init() {
		Container con = this.getContentPane(); // �۾������� ���λ��� �������
		con.setLayout(gl);
		jtb1.setToolTipText("1�� ��ư�Դϴ�");
		jtb2.setToolTipText("2�� ��ư�Դϴ�"); // ǳ������
		bg.add(jtb1);bg.add(jtb2);bg.add(jtb3);bg.add(jtb4);
		con.add(jtb1);
		con.add(jtb2);
		con.add(jtb3);
		jtb4.setHorizontalTextPosition(SwingConstants.CENTER);
		jtb4.setVerticalTextPosition(SwingConstants.BOTTOM);
		con.add(jtb4);
		
		jtb3.setSelectedIcon(ii1); // ���õǾ����� ������ ����
		jtb4.setRolloverIcon(ii1); // ���콺�� ��ư���� �ö������ �ٲ�� icon����
		jtb1.setMnemonic('1');
		jtb2.setMnemonic('2'); //alt Ű�� �Բ����� ����Ű
		jtb3.setMnemonic('3');
		jtb4.setMnemonic('4');
	}

	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x������ ���� //���ֻ���ϴ�
																// ��� �޼ҵ�� ������
																// ����.
	}
}

public class Ex03 {
	public static void main(String ar[]) {
		Ex03_sub ex = new Ex03_sub("����");
	}
}
