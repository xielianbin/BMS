package com.itcast.view;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class LoginImpl extends JFrame implements Login{
	private JLabel nameLabel=new JLabel("用户名:");	//用户名标签
	private JLabel passwordLabel=new JLabel("密  码:");		//用户密码标签
	public JTextField nameField=new JTextField();		//用户名输入域
	public JPasswordField passwordField=new JPasswordField();		//用户密码输入域
	public JButton login=new JButton("登 录");		//登录按钮
	public JButton register=new JButton("注 册");		//取消按钮
	Font font=new Font("宋体", 1, 15);
	public void init() {
		int x=140;	//设置组件的起始位置
		int y=110;	
		//初始化用户名标签
		nameLabel.setFont(font);
		nameLabel.setForeground(Color.gray);
		nameLabel.setBounds(x,y,70,30);
		this.add(nameLabel);
		//初始化用户名输入域
		nameField.setBounds(x+70,y,120,27);
		this.add(nameField);
		//初始化密码标签
		passwordLabel.setFont(font);
		passwordLabel.setForeground(Color.gray);
		passwordLabel.setBounds(x,y+40,70,30);
		this.add(passwordLabel);
		//初始化密码输入域
		passwordField.setBounds(x+70,y+40,120,27);
		passwordField.setEchoChar('♣');
		this.add(passwordField);
		//初始化登录按钮
		login.setBounds(x+10,y+80,80,30);
		this.add(login);
		//初始化取消按钮	
		register.setBounds(x+100,y+80,80,30);
		this.add(register);
	}
	public LoginImpl() {
		this.setLayout(null);
		init();
		this.setTitle("图书管理系统");
		this.setBounds(width,height,sizeX,sizeY);//设置窗口位置与大小
		this.setResizable(false);	//设置不可改变大小
		//this.setEnabled(false);	//设置为不可编辑,不可移动,不可关闭,不可改变
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//关闭窗口
	}
}
