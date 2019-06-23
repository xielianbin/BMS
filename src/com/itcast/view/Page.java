package com.itcast.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.itcast.utils.FrameCenterUtil;

@SuppressWarnings("serial")
public abstract class Page extends JFrame {
	int sizeX = 900;
	int sizeY = 600;
	int width = new FrameCenterUtil().getCenterX(sizeX);
	int height = new FrameCenterUtil().getCenterY(sizeY);

	void init() {
	};
	void init(String[][] tableBody) {};
	protected JMenuBar menuBar = new JMenuBar();
	protected JMenu quitMenu = new JMenu("快捷菜单");
	public JMenuItem[] quitMenuItem=new JMenuItem[2];
	protected JMenu operationMenu = new JMenu("图书操作");
	public JMenuItem[] operationMenuItem = new JMenuItem[3];
	protected JMenu setMenu = new JMenu("系统设置");
	public JMenuItem[] setMenuItem=new JMenuItem[2];
	protected JMenu helpMenu = new JMenu("帮助");
	//初始化子菜单栏
	public void menuItemInit(String[] menuItemString) {// 初始化快捷菜单子菜单
		String[] quitMenuString = { "关于", "退出" };
		for (int i = 0; i < quitMenuItem.length; i++) {
			quitMenuItem[i] = new JMenuItem(quitMenuString[i]);
			quitMenu.add(quitMenuItem[i]);
		}
		// 初始化图书操作子菜单
		for (int i = 0; i < operationMenuItem.length; i++) {
			operationMenuItem[i] = new JMenuItem(menuItemString[i]);
			operationMenu.add(operationMenuItem[i]);
		}
		// 初始化系统设置子菜单
		String[] setMenuString = { "修改用户名", "修改用户密码" };
		for (int i = 0; i < setMenuItem.length; i++) {
			setMenuItem[i] = new JMenuItem(setMenuString[i]);
			setMenu.add(setMenuItem[i]);
		}};
	// 初始化菜单栏
	public void menuInit(String[] menuItemString) {
		// 添加菜单组件
		menuBar.add(quitMenu);
		menuBar.add(operationMenu);
		menuBar.add(setMenu);
		menuBar.add(helpMenu);
		menuItemInit(menuItemString);
		this.setJMenuBar(menuBar);
	}
}
