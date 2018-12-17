package student;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Point;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import java.awt.FlowLayout; 
public class windows {
	public void windowClosing(WindowEvent arg0) {
		System.exit(1);
	}
	public static JTable table=new JTable(100,10);
	public static JScrollPane scr;
	public static int n=0;
	public static Vector<Serializable> row =new Vector<Serializable>();//添加行向量数据
	public static Vector<Serializable> row2 =new Vector<Serializable>();//添加行向量数据
	public static Vector<Serializable> row3 =new Vector<Serializable>();//添加行向量数据
	public static Vector<Serializable> row4 =new Vector<Serializable>();//添加行向量数据
	public static Vector<Serializable> row5 =new Vector<Serializable>();//添加行向量数据
	public static Vector<Serializable> row6 =new Vector<Serializable>();//添加行向量数据
	public static Vector<Serializable> row7 =new Vector<Serializable>();//添加行向量数据
	public static Vector<Serializable> row8 =new Vector<Serializable>();//添加行向量数据
	public static Vector<Serializable> row9 =new Vector<Serializable>();//添加行向量数据
	//public static Vector row10 =new Vector();//添加行向量数据
	public static Vector<Serializable> row1 =new Vector<Serializable>();//添加行向量数据
	public static Vector<Vector<Serializable>> data = new Vector<Vector<Serializable>>();//添加行向量
	public static Student[] student=new Student[10];
	public static DefaultTableModel model = null;  
	public static void main(String[] args) {
		for(int j=0;j<10;j++) {
			student[j]=new Student();
		}
		JFrame f=new JFrame("学生管理系统");
		//f.setLayout(new GridLayout(3,1,19,20));//布局管理器
		f.setLayout(null);//使用绝对定位
		JButton button1,button2=null;
		f.setBackground(Color.white);
		Point p=new Point(200,200);
		f.setLocation(p);
		f.setSize(500,200);
	     Font font = new Font("宋体", Font.BOLD,12);//
	     JLabel title=new JLabel("选择学生管理系统的类型");
	     title.setFont(font);
	     title.setBounds(170,5,150,20);
		 button1 = new JButton("导入文件");
			 button1.setFont(font);//设置字体的格式
			 button1.setBounds(70,70,100,50);
				button2 = new JButton("创建新文件");
				 button2.setFont(font);//设置字体的格式
				 button2.setBounds(270,70,100,50);
			     f.add(title);
				 f.add(button1);//add button
				 f.add(button2);//add button
				 f.setVisible(true);
				 button1.addActionListener(new ActionListener() {    
			         public void actionPerformed(ActionEvent e) {
			        	 f.setVisible(false);
			        	new ReadFile();
			         }
				 }); 
				 button2.addActionListener(new ActionListener() {    
			         public void actionPerformed(ActionEvent e) {    
			           f.setVisible(false);
			           JFrame f2=new JFrame("学生管理创建系统");
			           Container contentPane=f2.getContentPane(); 
			           contentPane.setLayout(new FlowLayout());
			   		f2.setLocation(p);
			   		JButton buttonAdd,buttonDel,buttonRe,buttonID,buttonCPlus,buttonJava,buttonSQ,buttonPru,buttonFind,buttonTxt=null;
			   		buttonAdd = new JButton("添加");
			   		buttonDel = new JButton("删除");
			   		buttonRe = new JButton("成绩排名");
			   		buttonID=new JButton("学号排名");
			   		buttonCPlus=new JButton("C++排名");
			   		buttonJava=new JButton("Java排名");
			   		buttonSQ=new JButton("数据结构排名");
			   		buttonPru=new JButton("生成Excel文档");
			   		buttonTxt=new JButton("生成TXT文档");
			   		buttonFind=new JButton("通过学号查找");
			   		Font font2 = new Font("宋体", Font.BOLD,12);
			   		buttonAdd.setFont(font2);//设置字体的格式
			   		buttonDel.setFont(font2);//设置字体的格式
			   		buttonRe.setFont(font2);//设置字体的格式
			   		buttonID.setFont(font2);//设置字体的格式
			   		buttonCPlus.setFont(font2);//设置字体的格式
			   		buttonJava.setFont(font2);//设置字体的格式
			   		buttonSQ.setFont(font2);//设置字体的格式
			   		buttonPru.setFont(font2);//设置字体的格式
			   		buttonTxt.setFont(font2);//设置字体的格式
			   		buttonFind.setFont(font2);//设置字体的格式
			   		buttonTxt.setFont(font2);//设置字体的格式
			   		JTextField Find=new JTextField(5);
			   	    contentPane.add(buttonAdd);
			   	    contentPane.add(buttonDel);
			   	    contentPane.add(buttonRe);
			    	contentPane.add(buttonID);
			    	contentPane.add(buttonCPlus);
			    	contentPane.add(buttonJava);
			    	contentPane.add(buttonSQ);
			    	contentPane.add(buttonPru);
			    	contentPane.add(buttonTxt);
			    	/*row.add("20170000");row.add("Jack");row.add("man");row.add("18");row.add("2017级");
			    	row.add("3班");row.add("89");row.add("78");row.add("98");row.add("300");*/
			    	
			    	//data.add(row);
			    	Vector<String> colum= new Vector<String>();//添加列
			    	colum.add("学号");colum.add("姓名");colum.add("性别");colum.add("年龄");colum.add("年级");
			    	colum.add("班级");colum.add("C++");colum.add("Java");colum.add("数据结构");colum.add("总分");
			    	model= new DefaultTableModel(data, colum);
			    	table = new JTable(model);//设置为不可编辑
			    	scr = new JScrollPane(table);
					//table.setBounds(100,100,40,50);
			    	contentPane.add(buttonFind);
			    	contentPane.add(Find);
			    	f2.add(scr);
			    	
			    	f2.setSize(500,500);
			        f2.setVisible(true);  
			        buttonFind.addActionListener(new ActionListener() {
		            	 @SuppressWarnings("unchecked")
						public void actionPerformed(ActionEvent e2) { 
		            		 int FindID=Integer.parseInt(Find.getText());
		            		 Vector<Serializable> row10 =new Vector<Serializable>();//添加行向量数据
		            		 Vector<Vector<Serializable>> data1 = new Vector<Vector<Serializable>>();//添加行向量
		            		 DefaultTableModel model1 = null;
		            		 JTable table1=new JTable(1,10);
		            		 JScrollPane scr1=null;
		            		 JFrame Find=null;
		            		 int tempport=0;
		            		 int h1=0;
		            		 for(int h=0;h<n;h++){
		            			 if(FindID==student[h].getID()){
		            				 row10.add(student[h].getID());
				 			         row10.add(student[h].getName());
				 			   	     row10.add(student[h].getSex());
				 			   	     row10.add(student[h].getAge());
				 			         row10.add(student[h].getGrade());
				 			         row10.add(student[h].getClassName());
				 			         row10.add(student[h].getCPlusmark());
				 			         row10.add(student[h].getJavamark());
				 			         row10.add(student[h].getSQmark());
				 			         row10.add(student[h].getSum());
				 			         data1.add((Vector<Serializable>) row10.clone());
				 			         model1= new DefaultTableModel(data1, colum);
							    	 table1 = new JTable(model1);//设置为不可编辑
							    	 scr1 = new JScrollPane(table1);
							    	h1=h;
							    	 tempport++;
							    	 break;
		            			 }
		            		 }
		            		 if(tempport==1){
		            			 Find=new JFrame(student[h1].getName()+"的成绩表");
						    	 Find.add(scr1);
						    	 Find.setLocation(p);
						    	 Find.setSize(500,60);
						    	 Find.setVisible(true);  
		            		 }
		            		 else JOptionPane.showMessageDialog(null, "无此学生信息");
		            	 }
			        });
			        buttonTxt.addActionListener(new ActionListener() {
		            	 public void actionPerformed(ActionEvent e2) { 
		            		 File file=new File("学生管理系统.txt"); 
		                	 
							try {
								PrintWriter output = new PrintWriter(file);
							
		                	 output.print("学号"+"   ");output.print("姓名"+"  ");
		                	 output.print("性别"+"   ");output.print("年龄"+"   ");
		                	 output.print("年级"+"   ");output.print("班级"+"   ");
		                	 output.print("C++"+"   ");output.print("Java"+"   ");
		                	 output.print("数据结构"+"   ");output.println("总分"+"   ");
		                	 for(int x=0;x<n;x++){
		                	 output.println(student[x].getID()+"   "+student[x].getName()+"   "+student[x].getSex()
		                			 +"   "+student[x].getAge()+"   "+student[x].getGrade()
		                			 +"   "+student[x].getClassName()+"   "+student[x].getCPlusmark()
		                			 +"   "+student[x].getJavamark()+"   "+student[x].getSQmark()+"   "+student[x].getSum());}
		                	 output.close();
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		            	 }
			        });
			        buttonPru.addActionListener(new ActionListener() {
		            	 public void actionPerformed(ActionEvent e2) { 
		            		 File file=new File("学生管理系统.xls");
		            		 PrintWriter output;
		            		 //System.out.println(file.exists());
		            		 
		            		 try { 
		            		          output = new PrintWriter(file);

		                		  
		                	            // 打开文件 
		                			 //output = new PrintWriter(file); 
		                	            WritableWorkbook book = Workbook.createWorkbook(file);  
		                	            // 生成名为“sheet1”的工作表，参数0表示这是第一页  
		                	            WritableSheet sheet = book.createSheet("First Sheet",0);
										
											Label a1 = new Label(0,0,"学号");sheet.addCell(a1);
											Label a2 = new Label(1,0,"姓名");sheet.addCell(a2);
											Label a3 = new Label(2,0,"性别");sheet.addCell(a3);
											Label a4 = new Label(3,0,"年龄");sheet.addCell(a4);
											Label a5 = new Label(4,0,"年级");sheet.addCell(a5);
											Label a6 = new Label(5,0,"班级");sheet.addCell(a6);
											Label a7 = new Label(6,0,"C++");sheet.addCell(a7);
											Label a8 = new Label(7,0,"Java");sheet.addCell(a8);
											Label a9 = new Label(8,0,"数据结构");sheet.addCell(a9);
											Label a10 = new Label(9,0,"总分");sheet.addCell(a10);
											
		                	            for(int i=1;i<=n;i++)
		                	            {
		   
		                	            		Label b1 = new Label(0,i,student[i-1].getID()+"");sheet.addCell(b1);
		                	            		Label b2 = new Label(1,i,student[i-1].getName());sheet.addCell(b2);
												Label b3 = new Label(2,i,student[i-1].getSex());sheet.addCell(b3);
												Label b4 = new Label(3,i,student[i-1].getAge()+"");sheet.addCell(b4);
												Label b5 = new Label(4,i,student[i-1].getGrade());sheet.addCell(b5);
												Label b6 = new Label(5,i,student[i-1].getClassName());sheet.addCell(b6);
												Label b7 = new Label(6,i,student[i-1].getCPlusmark()+"");sheet.addCell(b7);
												Label b8 = new Label(7,i,student[i-1].getJavamark()+"");sheet.addCell(b8);
												Label b9 = new Label(8,i,student[i-1].getSQmark()+"");sheet.addCell(b9);
												Label b10 = new Label(9,i,student[i-1].getSum()+"");sheet.addCell(b10);
		                	            }
		                	            	book.write();
		                	                book.close();
		                	                output.close();
		                	        } catch (Exception e){
		                	        	e.printStackTrace();
		                	        }
									   
		           
		                	 
		            	 }
			        });
			             buttonAdd.addActionListener(new ActionListener() {
			            	 public void actionPerformed(ActionEvent e2) { 
			            		 JFrame f2add=new JFrame("添加学生信息");
			            		 f2add.setLocation(p);
			            		 Container contentPane=f2add.getContentPane(); 
						         contentPane.setLayout(new FlowLayout());
			            		 f2add.setLayout(new GridLayout(10,1));
			            		 JLabel StuID=new JLabel("学号");
			            		 JLabel Name=new JLabel("姓名");
			            		 JLabel Sex =new JLabel("性别");
			            		 JLabel Age= new JLabel("年龄");
			            		 JLabel Class=new JLabel("年级");
			            		 JLabel Gradge=new JLabel("班级");
			            		 JLabel CPlus= new JLabel("C++");
			            		 JLabel Javaclass= new JLabel("Java");
			            		 JLabel SQ= new JLabel("数据结构");
			            		 JButton buttonConfirm,buttonCancel=null;
			            		 buttonConfirm = new JButton("确定");
			            		 buttonCancel = new JButton("取消");
			            		 JTextField text1=new JTextField(5);
			            		 JTextField text2=new JTextField(5);
			            		 JTextField sex2=new JTextField(5);
			            		 JTextField Age2=new JTextField(5);
			            		 JTextField class1=new JTextField(5);
			            		 JTextField class2=new JTextField(5);
			            		 JTextField CPlus0=new JTextField(5);
			            		 JTextField Java0=new JTextField(5);
			            		 JTextField SQ0=new JTextField(5);
			            		 contentPane.add(StuID);
			            		 contentPane.add(text1);
			            		 contentPane.add(Name);
			            		 contentPane.add(text2);
			            		 contentPane.add(Sex);
			            		 contentPane.add(sex2);
			            		 contentPane.add(Age);
			            		 contentPane.add(Age2);
			            		 contentPane.add(Class);
			            		 contentPane.add(class1);
			            		 contentPane.add(Gradge);
			            		 contentPane.add(class2);
			            		 contentPane.add(CPlus);
			            		 contentPane.add(CPlus0);
			            		 contentPane.add(Javaclass);
			            		 contentPane.add(Java0);
			            		 contentPane.add(SQ);
			            		 contentPane.add(SQ0);
			            		 contentPane.add(buttonConfirm);
			            		 contentPane.add(buttonCancel);
			            		 f2add.setSize(200,300);
			            		 f2add.setVisible(true); 
			            		 buttonConfirm.addActionListener(new ActionListener() {
									@SuppressWarnings("unchecked")
									public void actionPerformed(ActionEvent e3) { 
										String str1=text1.getText();
										String str2=text2.getText();
										String str3=sex2.getText();
										String str4=Age2.getText();
										String str5=class1.getText();
										String str6=class2.getText();
										String str7=CPlus0.getText();
										String str8=Java0.getText();
										String str9=SQ0.getText();
										if(null == str1 || "".equals(str1)|| null == str2 || "".equals(str2)||
												null == str3 || "".equals(str3)||null == str4 || "".equals(str4)||null == str5 || "".equals(str5)||
												null == str6 || "".equals(str6)||null == str7 || "".equals(str7)||null == str8 || "".equals(str8)||
												null == str9 || "".equals(str9))
											{JOptionPane.showMessageDialog(null, "学生信息不完整！");}
										
										else{ student[n].setID(Integer.parseInt(text1.getText()));
			 			       	 student[n].setName(text2.getText());
			 			   	     student[n].setSex(sex2.getText());
			 			   	     student[n].setAge(Integer.parseInt(Age2.getText()));
			 			   	     student[n].setGrade(class1.getText());
			 			   	     student[n].setClassName(class2.getText());
			 			   	     student[n].setCPlusmark(Integer.parseInt(CPlus0.getText()));
			 			   	     student[n].setJavamark(Integer.parseInt(Java0.getText()));
			 			         student[n].setSQmark(Integer.parseInt(SQ0.getText()));
			 			        // row.removeAllElements();
			 			         if(n==0) {
			 			        row.add(student[n].getID());
			 			         row.add(student[n].getName());
			 			   	     row.add(student[n].getSex());
			 			   	     row.add(student[n].getAge());
			 			         row.add(student[n].getGrade());
			 			         row.add(student[n].getClassName());
			 			         row.add(student[n].getCPlusmark());
			 			         row.add(student[n].getJavamark());
			 			         row.add(student[n].getSQmark());
			 			         row.add(student[n].getSum());
			 			        data.add((Vector<Serializable>) row.clone());
			 			         }
			 			         else if(n==1) {
			 			         row1.add(student[n].getID());
			 			         row1.add(student[n].getName());
			 			   	     row1.add(student[n].getSex());
			 			   	     row1.add(student[n].getAge());
			 			         row1.add(student[n].getGrade());
			 			         row1.add(student[n].getClassName());
			 			         row1.add(student[n].getCPlusmark());
			 			         row1.add(student[n].getJavamark());
			 			         row1.add(student[n].getSQmark());
			 			         row1.add(student[n].getSum());
			 			        data.add((Vector<Serializable>) row1.clone());
			 			        }
			 			            else if(n==2) {
			 			            	row2.add(student[n].getID());
					 			         row2.add(student[n].getName());
					 			   	     row2.add(student[n].getSex());
					 			   	     row2.add(student[n].getAge());
					 			         row2.add(student[n].getGrade());
					 			         row2.add(student[n].getClassName());
					 			         row2.add(student[n].getCPlusmark());
					 			         row2.add(student[n].getJavamark());
					 			         row2.add(student[n].getSQmark());
					 			         row2.add(student[n].getSum());
					 			        data.add((Vector<Serializable>) row2.clone());
			 			            }
			 			                else if(n==3) {
			 			                	row3.add(student[n].getID());
						 			         row3.add(student[n].getName());
						 			   	     row3.add(student[n].getSex());
						 			   	     row3.add(student[n].getAge());
						 			         row3.add(student[n].getGrade());
						 			         row3.add(student[n].getClassName());
						 			         row3.add(student[n].getCPlusmark());
						 			         row3.add(student[n].getJavamark());
						 			         row3.add(student[n].getSQmark());
						 			         row3.add(student[n].getSum());
						 			        data.add((Vector<Serializable>) row3.clone());
			 			                }
			 			        	       else if(n==4) {
			 			        	    	  row4.add(student[n].getID());
			 			 			         row4.add(student[n].getName());
			 			 			   	     row4.add(student[n].getSex());
			 			 			   	     row4.add(student[n].getAge());
			 			 			         row4.add(student[n].getGrade());
			 			 			         row4.add(student[n].getClassName());
			 			 			         row4.add(student[n].getCPlusmark());
			 			 			         row4.add(student[n].getJavamark());
			 			 			         row4.add(student[n].getSQmark());
			 			 			         row4.add(student[n].getSum());
			 			 			        data.add((Vector<Serializable>) row4.clone());
			 			        	       }
					 			              else if(n==5) {
					 			            	 row5.add(student[n].getID());
							 			         row5.add(student[n].getName());
							 			   	     row5.add(student[n].getSex());
							 			   	     row5.add(student[n].getAge());
							 			         row5.add(student[n].getGrade());
							 			         row5.add(student[n].getClassName());
							 			         row5.add(student[n].getCPlusmark());
							 			         row5.add(student[n].getJavamark());
							 			         row5.add(student[n].getSQmark());
							 			         row5.add(student[n].getSum());
							 			        data.add((Vector<Serializable>) row5.clone());
					 			              }
					 			                else if(n==6) {
					 			                	row6.add(student[n].getID());
								 			         row6.add(student[n].getName());
								 			   	     row6.add(student[n].getSex());
								 			   	     row6.add(student[n].getAge());
								 			         row6.add(student[n].getGrade());
								 			         row6.add(student[n].getClassName());
								 			         row6.add(student[n].getCPlusmark());
								 			         row6.add(student[n].getJavamark());
								 			         row6.add(student[n].getSQmark());
								 			         row6.add(student[n].getSum());
								 			        data.add((Vector<Serializable>) row6.clone());
					 			                }
					 			        	       else if(n==7) {
					 			        	    	  row7.add(student[n].getID());
					 			 			         row7.add(student[n].getName());
					 			 			   	     row7.add(student[n].getSex());
					 			 			   	     row7.add(student[n].getAge());
					 			 			         row7.add(student[n].getGrade());
					 			 			         row7.add(student[n].getClassName());
					 			 			         row7.add(student[n].getCPlusmark());
					 			 			         row7.add(student[n].getJavamark());
					 			 			         row7.add(student[n].getSQmark());
					 			 			         row7.add(student[n].getSum());
					 			 			        data.add((Vector<Serializable>) row7.clone());
					 			        	       }
							 			              else if(n==8) {
							 			            	 row8.add(student[n].getID());
									 			         row8.add(student[n].getName());
									 			   	     row8.add(student[n].getSex());
									 			   	     row8.add(student[n].getAge());
									 			         row8.add(student[n].getGrade());
									 			         row8.add(student[n].getClassName());
									 			         row8.add(student[n].getCPlusmark());
									 			         row8.add(student[n].getJavamark());
									 			         row8.add(student[n].getSQmark());
									 			         row8.add(student[n].getSum());
									 			        data.add((Vector<Serializable>) row8.clone());
							 			              }
							 			                 else if(n==9) {
							 			                	row9.add(student[n].getID());
										 			         row9.add(student[n].getName());
										 			   	     row9.add(student[n].getSex());
										 			   	     row9.add(student[n].getAge());
										 			         row9.add(student[n].getGrade());
										 			         row9.add(student[n].getClassName());
										 			         row9.add(student[n].getCPlusmark());
										 			         row9.add(student[n].getJavamark());
										 			         row9.add(student[n].getSQmark());
										 			         row9.add(student[n].getSum());
										 			        data.add((Vector<Serializable>) row9.clone());
							 			                 }
			 			   	     n++;
			 			    model=new DefaultTableModel(data, colum);
			 			   	     f2add.setVisible(false);
			 			         table.setModel(model);//设置为不可编辑
			 			   	     f2.setVisible(true);
										}
			            	 }
									 
					            	
			             });
			            		 buttonCancel.addActionListener(new ActionListener() {
					            	 public void actionPerformed(ActionEvent e1) { 
					            		 f2add.setVisible(false); 
					            	 }
				            	 });//取消键关闭
			            	 }
			             });
			            		buttonDel.addActionListener(new ActionListener(){//添加事件  
			            	            @SuppressWarnings("unchecked")
										public void actionPerformed(ActionEvent e){  
			            	                int selectedRow = table.getSelectedRow();//获得选中行的索引  
			            	                if(selectedRow!=-1)  //存在选中行  
			            	                {  
			            	                    model.removeRow(selectedRow);  //删除行 
			            	                    if(selectedRow==1){row.removeAllElements();
			            	                    data.add((Vector<Serializable>) row.clone());
			            	                    }
			            	                    else if(selectedRow==2){row1.removeAllElements();data.add((Vector<Serializable>) row1.clone());}
			            	                    else if(selectedRow==3){row2.removeAllElements();data.add((Vector<Serializable>) row2.clone());}
			            	                    else if(selectedRow==4){row3.removeAllElements();data.add((Vector<Serializable>) row3.clone());}
			            	                    else if(selectedRow==5){row4.removeAllElements();data.add((Vector<Serializable>) row4.clone());}
			            	                    else if(selectedRow==6){row5.removeAllElements();data.add((Vector<Serializable>) row5.clone());}
			            	                    else if(selectedRow==7){row6.removeAllElements();data.add((Vector<Serializable>) row6.clone());}
			            	                    else if(selectedRow==8){row7.removeAllElements();data.add((Vector<Serializable>) row7.clone());}
			            	                    else if(selectedRow==9){row8.removeAllElements();data.add((Vector<Serializable>) row8.clone());}
			            	                    else if(selectedRow==10){row9.removeAllElements();data.add((Vector<Serializable>) row9.clone());}
			            	                    for(int y=selectedRow+1;y<n;y++){
			            	                    	student[y-1]=student[y];}
			            	                    n--;
			            	                }  
			            	                model=new DefaultTableModel(data, colum);
			            	                table.setModel(model);//设置为不可编辑
			            	            }  
			            	        }); 
			            		buttonRe.addActionListener(new ActionListener() {
					            	 @SuppressWarnings("unchecked")
									public void actionPerformed(ActionEvent e1) { 
					            		 row.removeAllElements();
					            		 row1.removeAllElements();
					            		 row2.removeAllElements();
					            		 row3.removeAllElements();
					            		 row4.removeAllElements();
					            		 row5.removeAllElements();
					            		 row6.removeAllElements();
					            		 row7.removeAllElements();
					            		 row8.removeAllElements();
					            		 row9.removeAllElements();
					            		 data.removeAllElements();
					            		 model=new DefaultTableModel(data, colum);
					 			         table.setModel(model);//设置为不可编辑
					            		 int j,k,i1;
					            		 Student t;
					            		    for(j=0;j<n-1;j++)
					            		    {
					            		        k=j;
					            		        for(i1=j+1;i1<n;i1++)
					            		            if(student[i1].summark>student[k].summark)
					            		                k=i1;
					            		        if(k!=j)
					            		        {
					            		            t=student[j];
					            		            student[j]=student[k];
					            		            student[k]=t;
					            		        }
					            		    }
					            		 
					            		 for(int i=0;i<n;i++) {
					            			 if(i==0) {
								 			        row.add(student[i].getID());
								 			         row.add(student[i].getName());
								 			   	     row.add(student[i].getSex());
								 			   	     row.add(student[i].getAge());
								 			         row.add(student[i].getGrade());
								 			         row.add(student[i].getClassName());
								 			         row.add(student[i].getCPlusmark());
								 			         row.add(student[i].getJavamark());
								 			         row.add(student[i].getSQmark());
								 			         row.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row.clone());
								 			         }
								 			         else if(i==1) {
								 			         row1.add(student[i].getID());
								 			         row1.add(student[i].getName());
								 			   	     row1.add(student[i].getSex());
								 			   	     row1.add(student[i].getAge());
								 			         row1.add(student[i].getGrade());
								 			         row1.add(student[i].getClassName());
								 			         row1.add(student[i].getCPlusmark());
								 			         row1.add(student[i].getJavamark());
								 			         row1.add(student[i].getSQmark());
								 			         row1.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row1.clone());
								 			        }
								 			            else if(i==2) {
								 			            	row2.add(student[i].getID());
										 			         row2.add(student[i].getName());
										 			   	     row2.add(student[i].getSex());
										 			   	     row2.add(student[i].getAge());
										 			         row2.add(student[i].getGrade());
										 			         row2.add(student[i].getClassName());
										 			         row2.add(student[i].getCPlusmark());
										 			         row2.add(student[i].getJavamark());
										 			         row2.add(student[i].getSQmark());
										 			         row2.add(student[i].getSum());
										 			        data.add((Vector<Serializable>) row2.clone());
								 			            }
								 			                else if(i==3) {
								 			                	row3.add(student[i].getID());
											 			         row3.add(student[i].getName());
											 			   	     row3.add(student[i].getSex());
											 			   	     row3.add(student[i].getAge());
											 			         row3.add(student[i].getGrade());
											 			         row3.add(student[i].getClassName());
											 			         row3.add(student[i].getCPlusmark());
											 			         row3.add(student[i].getJavamark());
											 			         row3.add(student[i].getSQmark());
											 			         row3.add(student[i].getSum());
											 			        data.add((Vector<Serializable>) row3.clone());
								 			                }
								 			        	       else if(i==4) {
								 			        	    	  row4.add(student[i].getID());
								 			 			         row4.add(student[i].getName());
								 			 			   	     row4.add(student[i].getSex());
								 			 			   	     row4.add(student[i].getAge());
								 			 			         row4.add(student[i].getGrade());
								 			 			         row4.add(student[i].getClassName());
								 			 			         row4.add(student[i].getCPlusmark());
								 			 			         row4.add(student[i].getJavamark());
								 			 			         row4.add(student[i].getSQmark());
								 			 			         row4.add(student[i].getSum());
								 			 			        data.add((Vector<Serializable>) row4.clone());
								 			        	       }
										 			              else if(i==5) {
										 			            	 row5.add(student[i].getID());
												 			         row5.add(student[i].getName());
												 			   	     row5.add(student[i].getSex());
												 			   	     row5.add(student[i].getAge());
												 			         row5.add(student[i].getGrade());
												 			         row5.add(student[i].getClassName());
												 			         row5.add(student[i].getCPlusmark());
												 			         row5.add(student[i].getJavamark());
												 			         row5.add(student[i].getSQmark());
												 			         row5.add(student[i].getSum());
												 			        data.add((Vector<Serializable>) row5.clone());
										 			              }
										 			                else if(i==6) {
										 			                	row6.add(student[i].getID());
													 			         row6.add(student[i].getName());
													 			   	     row6.add(student[i].getSex());
													 			   	     row6.add(student[i].getAge());
													 			         row6.add(student[i].getGrade());
													 			         row6.add(student[i].getClassName());
													 			         row6.add(student[i].getCPlusmark());
													 			         row6.add(student[i].getJavamark());
													 			         row6.add(student[i].getSQmark());
													 			         row6.add(student[i].getSum());
													 			        data.add((Vector<Serializable>) row6.clone());
										 			                }
										 			        	       else if(i==7) {
										 			        	    	  row7.add(student[i].getID());
										 			 			         row7.add(student[i].getName());
										 			 			   	     row7.add(student[i].getSex());
										 			 			   	     row7.add(student[i].getAge());
										 			 			         row7.add(student[i].getGrade());
										 			 			         row7.add(student[i].getClassName());
										 			 			         row7.add(student[i].getCPlusmark());
										 			 			         row7.add(student[i].getJavamark());
										 			 			         row7.add(student[i].getSQmark());
										 			 			         row7.add(student[i].getSum());
										 			 			        data.add((Vector<Serializable>) row7.clone());
										 			        	       }
												 			              else if(i==8) {
												 			            	 row8.add(student[i].getID());
														 			         row8.add(student[i].getName());
														 			   	     row8.add(student[i].getSex());
														 			   	     row8.add(student[i].getAge());
														 			         row8.add(student[i].getGrade());
														 			         row8.add(student[i].getClassName());
														 			         row8.add(student[i].getCPlusmark());
														 			         row8.add(student[i].getJavamark());
														 			         row8.add(student[i].getSQmark());
														 			         row8.add(student[i].getSum());
														 			        data.add((Vector<Serializable>) row8.clone());
												 			              }
												 			                 else if(i==9) {
												 			                	row9.add(student[i].getID());
															 			         row9.add(student[i].getName());
															 			   	     row9.add(student[i].getSex());
															 			   	     row9.add(student[i].getAge());
															 			         row9.add(student[i].getGrade());
															 			         row9.add(student[i].getClassName());
															 			         row9.add(student[i].getCPlusmark());
															 			         row9.add(student[i].getJavamark());
															 			         row9.add(student[i].getSQmark());
															 			         row9.add(student[i].getSum());
															 			        data.add((Vector<Serializable>) row9.clone());
												 			                 }
					            			 model=new DefaultTableModel(data, colum);
						 			         table.setModel(model);//设置为不可编辑
					            		 }
					            	 } 
			            		});
			            	
			             //创建删除学生信息按钮
			            		buttonID.addActionListener(new ActionListener() {
					            	 @SuppressWarnings("unchecked")
									public void actionPerformed(ActionEvent e1) { 
					            		 row.removeAllElements();
					            		 row1.removeAllElements();
					            		 row2.removeAllElements();
					            		 row3.removeAllElements();
					            		 row4.removeAllElements();
					            		 row5.removeAllElements();
					            		 row6.removeAllElements();
					            		 row7.removeAllElements();
					            		 row8.removeAllElements();
					            		 row9.removeAllElements();
					            		 data.removeAllElements();
					            		 model=new DefaultTableModel(data, colum);
					 			         table.setModel(model);//设置为不可编辑
					            		 int j,k,i1;
					            		 Student t;
					            		    for(j=0;j<n-1;j++)
					            		    {
					            		        k=j;
					            		        for(i1=j+1;i1<n;i1++)
					            		            if(student[i1].getID()<student[k].getID())
					            		                k=i1;
					            		        if(k!=j)
					            		        {
					            		            t=student[j];
					            		            student[j]=student[k];
					            		            student[k]=t;
					            		        }
					            		    }
					            		 
					            		 for(int i=0;i<n;i++) {
					            			 if(i==0) {
								 			        row.add(student[i].getID());
								 			         row.add(student[i].getName());
								 			   	     row.add(student[i].getSex());
								 			   	     row.add(student[i].getAge());
								 			         row.add(student[i].getGrade());
								 			         row.add(student[i].getClassName());
								 			         row.add(student[i].getCPlusmark());
								 			         row.add(student[i].getJavamark());
								 			         row.add(student[i].getSQmark());
								 			         row.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row.clone());
								 			         }
								 			         else if(i==1) {
								 			         row1.add(student[i].getID());
								 			         row1.add(student[i].getName());
								 			   	     row1.add(student[i].getSex());
								 			   	     row1.add(student[i].getAge());
								 			         row1.add(student[i].getGrade());
								 			         row1.add(student[i].getClassName());
								 			         row1.add(student[i].getCPlusmark());
								 			         row1.add(student[i].getJavamark());
								 			         row1.add(student[i].getSQmark());
								 			         row1.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row1.clone());
								 			        }
								 			            else if(i==2) {
								 			            	row2.add(student[i].getID());
										 			         row2.add(student[i].getName());
										 			   	     row2.add(student[i].getSex());
										 			   	     row2.add(student[i].getAge());
										 			         row2.add(student[i].getGrade());
										 			         row2.add(student[i].getClassName());
										 			         row2.add(student[i].getCPlusmark());
										 			         row2.add(student[i].getJavamark());
										 			         row2.add(student[i].getSQmark());
										 			         row2.add(student[i].getSum());
										 			        data.add((Vector<Serializable>) row2.clone());
								 			            }
								 			                else if(i==3) {
								 			                	row3.add(student[i].getID());
											 			         row3.add(student[i].getName());
											 			   	     row3.add(student[i].getSex());
											 			   	     row3.add(student[i].getAge());
											 			         row3.add(student[i].getGrade());
											 			         row3.add(student[i].getClassName());
											 			         row3.add(student[i].getCPlusmark());
											 			         row3.add(student[i].getJavamark());
											 			         row3.add(student[i].getSQmark());
											 			         row3.add(student[i].getSum());
											 			        data.add((Vector<Serializable>) row3.clone());
								 			                }
								 			        	       else if(i==4) {
								 			        	    	  row4.add(student[i].getID());
								 			 			         row4.add(student[i].getName());
								 			 			   	     row4.add(student[i].getSex());
								 			 			   	     row4.add(student[i].getAge());
								 			 			         row4.add(student[i].getGrade());
								 			 			         row4.add(student[i].getClassName());
								 			 			         row4.add(student[i].getCPlusmark());
								 			 			         row4.add(student[i].getJavamark());
								 			 			         row4.add(student[i].getSQmark());
								 			 			         row4.add(student[i].getSum());
								 			 			        data.add((Vector<Serializable>) row4.clone());
								 			        	       }
										 			              else if(i==5) {
										 			            	 row5.add(student[i].getID());
												 			         row5.add(student[i].getName());
												 			   	     row5.add(student[i].getSex());
												 			   	     row5.add(student[i].getAge());
												 			         row5.add(student[i].getGrade());
												 			         row5.add(student[i].getClassName());
												 			         row5.add(student[i].getCPlusmark());
												 			         row5.add(student[i].getJavamark());
												 			         row5.add(student[i].getSQmark());
												 			         row5.add(student[i].getSum());
												 			        data.add((Vector<Serializable>) row5.clone());
										 			              }
										 			                else if(i==6) {
										 			                	row6.add(student[i].getID());
													 			         row6.add(student[i].getName());
													 			   	     row6.add(student[i].getSex());
													 			   	     row6.add(student[i].getAge());
													 			         row6.add(student[i].getGrade());
													 			         row6.add(student[i].getClassName());
													 			         row6.add(student[i].getCPlusmark());
													 			         row6.add(student[i].getJavamark());
													 			         row6.add(student[i].getSQmark());
													 			         row6.add(student[i].getSum());
													 			        data.add((Vector<Serializable>) row6.clone());
										 			                }
										 			        	       else if(i==7) {
										 			        	    	  row7.add(student[i].getID());
										 			 			         row7.add(student[i].getName());
										 			 			   	     row7.add(student[i].getSex());
										 			 			   	     row7.add(student[i].getAge());
										 			 			         row7.add(student[i].getGrade());
										 			 			         row7.add(student[i].getClassName());
										 			 			         row7.add(student[i].getCPlusmark());
										 			 			         row7.add(student[i].getJavamark());
										 			 			         row7.add(student[i].getSQmark());
										 			 			         row7.add(student[i].getSum());
										 			 			        data.add((Vector<Serializable>) row7.clone());
										 			        	       }
												 			              else if(i==8) {
												 			            	 row8.add(student[i].getID());
														 			         row8.add(student[i].getName());
														 			   	     row8.add(student[i].getSex());
														 			   	     row8.add(student[i].getAge());
														 			         row8.add(student[i].getGrade());
														 			         row8.add(student[i].getClassName());
														 			         row8.add(student[i].getCPlusmark());
														 			         row8.add(student[i].getJavamark());
														 			         row8.add(student[i].getSQmark());
														 			         row8.add(student[i].getSum());
														 			        data.add((Vector<Serializable>) row8.clone());
												 			              }
												 			                 else if(i==9) {
												 			                	row9.add(student[i].getID());
															 			         row9.add(student[i].getName());
															 			   	     row9.add(student[i].getSex());
															 			   	     row9.add(student[i].getAge());
															 			         row9.add(student[i].getGrade());
															 			         row9.add(student[i].getClassName());
															 			         row9.add(student[i].getCPlusmark());
															 			         row9.add(student[i].getJavamark());
															 			         row9.add(student[i].getSQmark());
															 			         row9.add(student[i].getSum());
															 			        data.add((Vector<Serializable>) row9.clone());
												 			                 }
					            			 model=new DefaultTableModel(data, colum);
						 			         table.setModel(model);//设置为不可编辑
					            		 }
					            	 } 
			            		});
			            		buttonCPlus.addActionListener(new ActionListener() {
					            	 @SuppressWarnings("unchecked")
									public void actionPerformed(ActionEvent e1) { 
					            		 row.removeAllElements();
					            		 row1.removeAllElements();
					            		 row2.removeAllElements();
					            		 row3.removeAllElements();
					            		 row4.removeAllElements();
					            		 row5.removeAllElements();
					            		 row6.removeAllElements();
					            		 row7.removeAllElements();
					            		 row8.removeAllElements();
					            		 row9.removeAllElements();
					            		 data.removeAllElements();
					            		 model=new DefaultTableModel(data, colum);
					 			         table.setModel(model);//设置为不可编辑
					            		 int j,k,i1;
					            		 Student t;
					            		    for(j=0;j<n-1;j++)
					            		    {
					            		        k=j;
					            		        for(i1=j+1;i1<n;i1++)
					            		            if(student[i1].getCPlusmark()>student[k].getCPlusmark())
					            		                k=i1;
					            		        if(k!=j)
					            		        {
					            		            t=student[j];
					            		            student[j]=student[k];
					            		            student[k]=t;
					            		        }
					            		    }
					            		 
					            		 for(int i=0;i<n;i++) {
					            			 if(i==0) {
								 			        row.add(student[i].getID());
								 			         row.add(student[i].getName());
								 			   	     row.add(student[i].getSex());
								 			   	     row.add(student[i].getAge());
								 			         row.add(student[i].getGrade());
								 			         row.add(student[i].getClassName());
								 			         row.add(student[i].getCPlusmark());
								 			         row.add(student[i].getJavamark());
								 			         row.add(student[i].getSQmark());
								 			         row.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row.clone());
								 			         }
								 			         else if(i==1) {
								 			         row1.add(student[i].getID());
								 			         row1.add(student[i].getName());
								 			   	     row1.add(student[i].getSex());
								 			   	     row1.add(student[i].getAge());
								 			         row1.add(student[i].getGrade());
								 			         row1.add(student[i].getClassName());
								 			         row1.add(student[i].getCPlusmark());
								 			         row1.add(student[i].getJavamark());
								 			         row1.add(student[i].getSQmark());
								 			         row1.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row1.clone());
								 			        }
								 			            else if(i==2) {
								 			            	row2.add(student[i].getID());
										 			         row2.add(student[i].getName());
										 			   	     row2.add(student[i].getSex());
										 			   	     row2.add(student[i].getAge());
										 			         row2.add(student[i].getGrade());
										 			         row2.add(student[i].getClassName());
										 			         row2.add(student[i].getCPlusmark());
										 			         row2.add(student[i].getJavamark());
										 			         row2.add(student[i].getSQmark());
										 			         row2.add(student[i].getSum());
										 			        data.add((Vector<Serializable>) row2.clone());
								 			            }
								 			                else if(i==3) {
								 			                	row3.add(student[i].getID());
											 			         row3.add(student[i].getName());
											 			   	     row3.add(student[i].getSex());
											 			   	     row3.add(student[i].getAge());
											 			         row3.add(student[i].getGrade());
											 			         row3.add(student[i].getClassName());
											 			         row3.add(student[i].getCPlusmark());
											 			         row3.add(student[i].getJavamark());
											 			         row3.add(student[i].getSQmark());
											 			         row3.add(student[i].getSum());
											 			        data.add((Vector<Serializable>) row3.clone());
								 			                }
								 			        	       else if(i==4) {
								 			        	    	  row4.add(student[i].getID());
								 			 			         row4.add(student[i].getName());
								 			 			   	     row4.add(student[i].getSex());
								 			 			   	     row4.add(student[i].getAge());
								 			 			         row4.add(student[i].getGrade());
								 			 			         row4.add(student[i].getClassName());
								 			 			         row4.add(student[i].getCPlusmark());
								 			 			         row4.add(student[i].getJavamark());
								 			 			         row4.add(student[i].getSQmark());
								 			 			         row4.add(student[i].getSum());
								 			 			        data.add((Vector<Serializable>) row4.clone());
								 			        	       }
										 			              else if(i==5) {
										 			            	 row5.add(student[i].getID());
												 			         row5.add(student[i].getName());
												 			   	     row5.add(student[i].getSex());
												 			   	     row5.add(student[i].getAge());
												 			         row5.add(student[i].getGrade());
												 			         row5.add(student[i].getClassName());
												 			         row5.add(student[i].getCPlusmark());
												 			         row5.add(student[i].getJavamark());
												 			         row5.add(student[i].getSQmark());
												 			         row5.add(student[i].getSum());
												 			        data.add((Vector<Serializable>) row5.clone());
										 			              }
										 			                else if(i==6) {
										 			                	row6.add(student[i].getID());
													 			         row6.add(student[i].getName());
													 			   	     row6.add(student[i].getSex());
													 			   	     row6.add(student[i].getAge());
													 			         row6.add(student[i].getGrade());
													 			         row6.add(student[i].getClassName());
													 			         row6.add(student[i].getCPlusmark());
													 			         row6.add(student[i].getJavamark());
													 			         row6.add(student[i].getSQmark());
													 			         row6.add(student[i].getSum());
													 			        data.add((Vector<Serializable>) row6.clone());
										 			                }
										 			        	       else if(i==7) {
										 			        	    	  row7.add(student[i].getID());
										 			 			         row7.add(student[i].getName());
										 			 			   	     row7.add(student[i].getSex());
										 			 			   	     row7.add(student[i].getAge());
										 			 			         row7.add(student[i].getGrade());
										 			 			         row7.add(student[i].getClassName());
										 			 			         row7.add(student[i].getCPlusmark());
										 			 			         row7.add(student[i].getJavamark());
										 			 			         row7.add(student[i].getSQmark());
										 			 			         row7.add(student[i].getSum());
										 			 			        data.add((Vector<Serializable>) row7.clone());
										 			        	       }
												 			              else if(i==8) {
												 			            	 row8.add(student[i].getID());
														 			         row8.add(student[i].getName());
														 			   	     row8.add(student[i].getSex());
														 			   	     row8.add(student[i].getAge());
														 			         row8.add(student[i].getGrade());
														 			         row8.add(student[i].getClassName());
														 			         row8.add(student[i].getCPlusmark());
														 			         row8.add(student[i].getJavamark());
														 			         row8.add(student[i].getSQmark());
														 			         row8.add(student[i].getSum());
														 			        data.add((Vector<Serializable>) row8.clone());
												 			              }
												 			                 else if(i==9) {
												 			                	row9.add(student[i].getID());
															 			         row9.add(student[i].getName());
															 			   	     row9.add(student[i].getSex());
															 			   	     row9.add(student[i].getAge());
															 			         row9.add(student[i].getGrade());
															 			         row9.add(student[i].getClassName());
															 			         row9.add(student[i].getCPlusmark());
															 			         row9.add(student[i].getJavamark());
															 			         row9.add(student[i].getSQmark());
															 			         row9.add(student[i].getSum());
															 			        data.add((Vector<Serializable>) row9.clone());
												 			                 }
					            			 model=new DefaultTableModel(data, colum);
						 			         table.setModel(model);//设置为不可编辑
					            		 }
					            	 } 
			            		});
			            		buttonJava.addActionListener(new ActionListener() {
					            	 @SuppressWarnings("unchecked")
									public void actionPerformed(ActionEvent e1) { 
					            		 row.removeAllElements();
					            		 row1.removeAllElements();
					            		 row2.removeAllElements();
					            		 row3.removeAllElements();
					            		 row4.removeAllElements();
					            		 row5.removeAllElements();
					            		 row6.removeAllElements();
					            		 row7.removeAllElements();
					            		 row8.removeAllElements();
					            		 row9.removeAllElements();
					            		 data.removeAllElements();
					            		 model=new DefaultTableModel(data, colum);
					 			         table.setModel(model);//设置为不可编辑
					            		 int j,k,i1;
					            		 Student t;
					            		    for(j=0;j<n-1;j++)
					            		    {
					            		        k=j;
					            		        for(i1=j+1;i1<n;i1++)
					            		            if(student[i1].getJavamark()>student[k].getJavamark())
					            		                k=i1;
					            		        if(k!=j)
					            		        {
					            		            t=student[j];
					            		            student[j]=student[k];
					            		            student[k]=t;
					            		        }
					            		    }
					            		 
					            		 for(int i=0;i<n;i++) {
					            			 if(i==0) {
								 			        row.add(student[i].getID());
								 			         row.add(student[i].getName());
								 			   	     row.add(student[i].getSex());
								 			   	     row.add(student[i].getAge());
								 			         row.add(student[i].getGrade());
								 			         row.add(student[i].getClassName());
								 			         row.add(student[i].getCPlusmark());
								 			         row.add(student[i].getJavamark());
								 			         row.add(student[i].getSQmark());
								 			         row.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row.clone());
								 			         }
								 			         else if(i==1) {
								 			         row1.add(student[i].getID());
								 			         row1.add(student[i].getName());
								 			   	     row1.add(student[i].getSex());
								 			   	     row1.add(student[i].getAge());
								 			         row1.add(student[i].getGrade());
								 			         row1.add(student[i].getClassName());
								 			         row1.add(student[i].getCPlusmark());
								 			         row1.add(student[i].getJavamark());
								 			         row1.add(student[i].getSQmark());
								 			         row1.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row1.clone());
								 			        }
								 			            else if(i==2) {
								 			            	row2.add(student[i].getID());
										 			         row2.add(student[i].getName());
										 			   	     row2.add(student[i].getSex());
										 			   	     row2.add(student[i].getAge());
										 			         row2.add(student[i].getGrade());
										 			         row2.add(student[i].getClassName());
										 			         row2.add(student[i].getCPlusmark());
										 			         row2.add(student[i].getJavamark());
										 			         row2.add(student[i].getSQmark());
										 			         row2.add(student[i].getSum());
										 			        data.add((Vector<Serializable>) row2.clone());
								 			            }
								 			                else if(i==3) {
								 			                	row3.add(student[i].getID());
											 			         row3.add(student[i].getName());
											 			   	     row3.add(student[i].getSex());
											 			   	     row3.add(student[i].getAge());
											 			         row3.add(student[i].getGrade());
											 			         row3.add(student[i].getClassName());
											 			         row3.add(student[i].getCPlusmark());
											 			         row3.add(student[i].getJavamark());
											 			         row3.add(student[i].getSQmark());
											 			         row3.add(student[i].getSum());
											 			        data.add((Vector<Serializable>) row3.clone());
								 			                }
								 			        	       else if(i==4) {
								 			        	    	  row4.add(student[i].getID());
								 			 			         row4.add(student[i].getName());
								 			 			   	     row4.add(student[i].getSex());
								 			 			   	     row4.add(student[i].getAge());
								 			 			         row4.add(student[i].getGrade());
								 			 			         row4.add(student[i].getClassName());
								 			 			         row4.add(student[i].getCPlusmark());
								 			 			         row4.add(student[i].getJavamark());
								 			 			         row4.add(student[i].getSQmark());
								 			 			         row4.add(student[i].getSum());
								 			 			        data.add((Vector<Serializable>) row4.clone());
								 			        	       }
										 			              else if(i==5) {
										 			            	 row5.add(student[i].getID());
												 			         row5.add(student[i].getName());
												 			   	     row5.add(student[i].getSex());
												 			   	     row5.add(student[i].getAge());
												 			         row5.add(student[i].getGrade());
												 			         row5.add(student[i].getClassName());
												 			         row5.add(student[i].getCPlusmark());
												 			         row5.add(student[i].getJavamark());
												 			         row5.add(student[i].getSQmark());
												 			         row5.add(student[i].getSum());
												 			        data.add((Vector<Serializable>) row5.clone());
										 			              }
										 			                else if(i==6) {
										 			                	row6.add(student[i].getID());
													 			         row6.add(student[i].getName());
													 			   	     row6.add(student[i].getSex());
													 			   	     row6.add(student[i].getAge());
													 			         row6.add(student[i].getGrade());
													 			         row6.add(student[i].getClassName());
													 			         row6.add(student[i].getCPlusmark());
													 			         row6.add(student[i].getJavamark());
													 			         row6.add(student[i].getSQmark());
													 			         row6.add(student[i].getSum());
													 			        data.add((Vector<Serializable>) row6.clone());
										 			                }
										 			        	       else if(i==7) {
										 			        	    	  row7.add(student[i].getID());
										 			 			         row7.add(student[i].getName());
										 			 			   	     row7.add(student[i].getSex());
										 			 			   	     row7.add(student[i].getAge());
										 			 			         row7.add(student[i].getGrade());
										 			 			         row7.add(student[i].getClassName());
										 			 			         row7.add(student[i].getCPlusmark());
										 			 			         row7.add(student[i].getJavamark());
										 			 			         row7.add(student[i].getSQmark());
										 			 			         row7.add(student[i].getSum());
										 			 			        data.add((Vector<Serializable>) row7.clone());
										 			        	       }
												 			              else if(i==8) {
												 			            	 row8.add(student[i].getID());
														 			         row8.add(student[i].getName());
														 			   	     row8.add(student[i].getSex());
														 			   	     row8.add(student[i].getAge());
														 			         row8.add(student[i].getGrade());
														 			         row8.add(student[i].getClassName());
														 			         row8.add(student[i].getCPlusmark());
														 			         row8.add(student[i].getJavamark());
														 			         row8.add(student[i].getSQmark());
														 			         row8.add(student[i].getSum());
														 			        data.add((Vector<Serializable>) row8.clone());
												 			              }
												 			                 else if(i==9) {
												 			                	row9.add(student[i].getID());
															 			         row9.add(student[i].getName());
															 			   	     row9.add(student[i].getSex());
															 			   	     row9.add(student[i].getAge());
															 			         row9.add(student[i].getGrade());
															 			         row9.add(student[i].getClassName());
															 			         row9.add(student[i].getCPlusmark());
															 			         row9.add(student[i].getJavamark());
															 			         row9.add(student[i].getSQmark());
															 			         row9.add(student[i].getSum());
															 			        data.add((Vector<Serializable>) row9.clone());
												 			                 }
					            			 model=new DefaultTableModel(data, colum);
						 			         table.setModel(model);//设置为不可编辑
					            		 }
					            	 } 
			            		});
			            		buttonSQ.addActionListener(new ActionListener() {
					            	 @SuppressWarnings("unchecked")
									public void actionPerformed(ActionEvent e1) { 
					            		 row.removeAllElements();
					            		 row1.removeAllElements();
					            		 row2.removeAllElements();
					            		 row3.removeAllElements();
					            		 row4.removeAllElements();
					            		 row5.removeAllElements();
					            		 row6.removeAllElements();
					            		 row7.removeAllElements();
					            		 row8.removeAllElements();
					            		 row9.removeAllElements();
					            		 data.removeAllElements();
					            		 model=new DefaultTableModel(data, colum);
					 			         table.setModel(model);//设置为不可编辑
					            		 int j,k,i1;
					            		 Student t;
					            		    for(j=0;j<n-1;j++)
					            		    {
					            		        k=j;
					            		        for(i1=j+1;i1<n;i1++)
					            		            if(student[i1].getSQmark()>student[k].getSQmark())
					            		                k=i1;
					            		        if(k!=j)
					            		        {
					            		            t=student[j];
					            		            student[j]=student[k];
					            		            student[k]=t;
					            		        }
					            		    }
					            		 
					            		 for(int i=0;i<n;i++) {
					            			 if(i==0) {
								 			        row.add(student[i].getID());
								 			         row.add(student[i].getName());
								 			   	     row.add(student[i].getSex());
								 			   	     row.add(student[i].getAge());
								 			         row.add(student[i].getGrade());
								 			         row.add(student[i].getClassName());
								 			         row.add(student[i].getCPlusmark());
								 			         row.add(student[i].getJavamark());
								 			         row.add(student[i].getSQmark());
								 			         row.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row.clone());
								 			         }
								 			         else if(i==1) {
								 			         row1.add(student[i].getID());
								 			         row1.add(student[i].getName());
								 			   	     row1.add(student[i].getSex());
								 			   	     row1.add(student[i].getAge());
								 			         row1.add(student[i].getGrade());
								 			         row1.add(student[i].getClassName());
								 			         row1.add(student[i].getCPlusmark());
								 			         row1.add(student[i].getJavamark());
								 			         row1.add(student[i].getSQmark());
								 			         row1.add(student[i].getSum());
								 			        data.add((Vector<Serializable>) row1.clone());
								 			        }
								 			            else if(i==2) {
								 			            	row2.add(student[i].getID());
										 			         row2.add(student[i].getName());
										 			   	     row2.add(student[i].getSex());
										 			   	     row2.add(student[i].getAge());
										 			         row2.add(student[i].getGrade());
										 			         row2.add(student[i].getClassName());
										 			         row2.add(student[i].getCPlusmark());
										 			         row2.add(student[i].getJavamark());
										 			         row2.add(student[i].getSQmark());
										 			         row2.add(student[i].getSum());
										 			        data.add((Vector<Serializable>) row2.clone());
								 			            }
								 			                else if(i==3) {
								 			                	row3.add(student[i].getID());
											 			         row3.add(student[i].getName());
											 			   	     row3.add(student[i].getSex());
											 			   	     row3.add(student[i].getAge());
											 			         row3.add(student[i].getGrade());
											 			         row3.add(student[i].getClassName());
											 			         row3.add(student[i].getCPlusmark());
											 			         row3.add(student[i].getJavamark());
											 			         row3.add(student[i].getSQmark());
											 			         row3.add(student[i].getSum());
											 			        data.add((Vector<Serializable>) row3.clone());
								 			                }
								 			        	       else if(i==4) {
								 			        	    	  row4.add(student[i].getID());
								 			 			         row4.add(student[i].getName());
								 			 			   	     row4.add(student[i].getSex());
								 			 			   	     row4.add(student[i].getAge());
								 			 			         row4.add(student[i].getGrade());
								 			 			         row4.add(student[i].getClassName());
								 			 			         row4.add(student[i].getCPlusmark());
								 			 			         row4.add(student[i].getJavamark());
								 			 			         row4.add(student[i].getSQmark());
								 			 			         row4.add(student[i].getSum());
								 			 			        data.add((Vector<Serializable>) row4.clone());
								 			        	       }
										 			              else if(i==5) {
										 			            	 row5.add(student[i].getID());
												 			         row5.add(student[i].getName());
												 			   	     row5.add(student[i].getSex());
												 			   	     row5.add(student[i].getAge());
												 			         row5.add(student[i].getGrade());
												 			         row5.add(student[i].getClassName());
												 			         row5.add(student[i].getCPlusmark());
												 			         row5.add(student[i].getJavamark());
												 			         row5.add(student[i].getSQmark());
												 			         row5.add(student[i].getSum());
												 			        data.add((Vector<Serializable>) row5.clone());
										 			              }
										 			                else if(i==6) {
										 			                	row6.add(student[i].getID());
													 			         row6.add(student[i].getName());
													 			   	     row6.add(student[i].getSex());
													 			   	     row6.add(student[i].getAge());
													 			         row6.add(student[i].getGrade());
													 			         row6.add(student[i].getClassName());
													 			         row6.add(student[i].getCPlusmark());
													 			         row6.add(student[i].getJavamark());
													 			         row6.add(student[i].getSQmark());
													 			         row6.add(student[i].getSum());
													 			        data.add((Vector<Serializable>) row6.clone());
										 			                }
										 			        	       else if(i==7) {
										 			        	    	  row7.add(student[i].getID());
										 			 			         row7.add(student[i].getName());
										 			 			   	     row7.add(student[i].getSex());
										 			 			   	     row7.add(student[i].getAge());
										 			 			         row7.add(student[i].getGrade());
										 			 			         row7.add(student[i].getClassName());
										 			 			         row7.add(student[i].getCPlusmark());
										 			 			         row7.add(student[i].getJavamark());
										 			 			         row7.add(student[i].getSQmark());
										 			 			         row7.add(student[i].getSum());
										 			 			        data.add((Vector<Serializable>) row7.clone());
										 			        	       }
												 			              else if(i==8) {
												 			            	 row8.add(student[i].getID());
														 			         row8.add(student[i].getName());
														 			   	     row8.add(student[i].getSex());
														 			   	     row8.add(student[i].getAge());
														 			         row8.add(student[i].getGrade());
														 			         row8.add(student[i].getClassName());
														 			         row8.add(student[i].getCPlusmark());
														 			         row8.add(student[i].getJavamark());
														 			         row8.add(student[i].getSQmark());
														 			         row8.add(student[i].getSum());
														 			        data.add((Vector<Serializable>) row8.clone());
												 			              }
												 			                 else if(i==9) {
												 			                	row9.add(student[i].getID());
															 			         row9.add(student[i].getName());
															 			   	     row9.add(student[i].getSex());
															 			   	     row9.add(student[i].getAge());
															 			         row9.add(student[i].getGrade());
															 			         row9.add(student[i].getClassName());
															 			         row9.add(student[i].getCPlusmark());
															 			         row9.add(student[i].getJavamark());
															 			         row9.add(student[i].getSQmark());
															 			         row9.add(student[i].getSum());
															 			        data.add((Vector<Serializable>) row9.clone());
												 			                 }
					            			 model=new DefaultTableModel(data, colum);
						 			         table.setModel(model);//设置为不可编辑
					            		 }
					            	 } 
			            		});
			         }
			       });    
					
				
	}
}
