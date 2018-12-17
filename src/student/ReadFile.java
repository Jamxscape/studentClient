package student;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.awt.event.WindowAdapter;
import javax.swing.JTextArea; 
class ReadFile implements ActionListener {
    private JTextArea area =new JTextArea(8,10);
    private JFrame frame = new JFrame("读取学生的信息");
    private JButton open =new JButton("打开文件");
    private JButton save = new JButton("存储文件");
    private JLabel label =new JLabel("现在没有打开这个文件");
    private JPanel butPan =new JPanel();
    public ReadFile() {
    	this.butPan.add(open);
    	this.butPan.add(save);
    	frame.setLayout(new BorderLayout(3,3));
    	frame.add(this.label,BorderLayout.NORTH);
    	frame.add(this.butPan,BorderLayout.SOUTH);
    	frame.add(new JScrollPane(this.area),BorderLayout.CENTER);
    	this.frame.setSize(330,180);
    	this.frame.setVisible(true);
    	this.frame.addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent arg0) {
    			System.exit(1);
    		}
    	});
    	this.open.addActionListener(this);
    	this.save.addActionListener(this);
    	frame.setSize(300,200);
    	frame.setVisible(true);
    }
	public void actionPerformed(ActionEvent e) {
		File file =null;
		int result =0;
		JFileChooser fileChooser=new JFileChooser();
		if(e.getSource()==this.open) {
			this.area.setText("");
			fileChooser.setApproveButtonText("确定");
			fileChooser.setDialogTitle("打开文件");
			result = fileChooser.showOpenDialog(this.frame);
		}
		if(result==JFileChooser.APPROVE_OPTION) {
			file=fileChooser.getSelectedFile();
			this.label.setText("打开的文件名称为"+file.getName());
			
		}
		else if(result == JFileChooser.CANCEL_OPTION) {
			this.label.setText("没有选择任何文件");
		}
		else if(result==JFileChooser.ERROR_OPTION) {
			this.label.setText("操作出现错误");
		}
			if(file!=null) {
				
				try {
					Scanner scan = new Scanner(
						new FileInputStream(file));
						scan.useDelimiter("\n");
						while(scan.hasNext()) {
							this.area.append(scan.next());
							this.area.append("\n");
						}
						scan.close();
					
					}catch(Exception ex) {
					this.label.setText("文件读取错误");
				   }
				}
			
				if(e.getSource()==this.save) {
					result = fileChooser.showSaveDialog(this.frame);
					if(result==JFileChooser.APPROVE_OPTION) {
						file=fileChooser.getSelectedFile();
						this.label.setText("选择的存储文件名称为："+file.getName());
					}else if(result ==JFileChooser.CANCEL_OPTION) {
						this.label.setText("操作出现错误"); 
					}
					if(file!=null) {
						try {
							PrintStream out =new PrintStream(
									new FileOutputStream(file));
							out.print(this.area.getText());
							out.close();		
						}catch(Exception ex) {
							this.label.setText("文件保存失败");
						}
					}
				}
				
	}
}
