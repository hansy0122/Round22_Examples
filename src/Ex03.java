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
		Container con = this.getContentPane(); // 작업영역만 따로빼서 집어넣음
		con.setLayout(gl);
		jtb1.setToolTipText("1번 버튼입니다");
		jtb2.setToolTipText("2번 버튼입니다"); // 풍선도움말
		bg.add(jtb1);bg.add(jtb2);bg.add(jtb3);bg.add(jtb4);
		con.add(jtb1);
		con.add(jtb2);
		con.add(jtb3);
		jtb4.setHorizontalTextPosition(SwingConstants.CENTER);
		jtb4.setVerticalTextPosition(SwingConstants.BOTTOM);
		con.add(jtb4);
		
		jtb3.setSelectedIcon(ii1); // 선택되었을때 아이콘 변경
		jtb4.setRolloverIcon(ii1); // 마우스가 버튼위에 올라왔을때 바뀌는 icon설정
		jtb1.setMnemonic('1');
		jtb2.setMnemonic('2'); //alt 키와 함께쓰는 단축키
		jtb3.setMnemonic('3');
		jtb4.setMnemonic('4');
	}

	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x눌리면 종료 //자주사용하는
																// 기능 메소드로 정의해
																// 놓음.
	}
}

public class Ex03 {
	public static void main(String ar[]) {
		Ex03_sub ex = new Ex03_sub("제목");
	}
}
