package com.itcast.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * 图书管理系统添加界面
 * 
 * */
@SuppressWarnings("serial")
public class InsertPage extends Page {
	private JLabel[] insertPageLabel = new JLabel[9];
	private String[] labelText = { "图书名:", "作  者:", "出版时间:", "出版社:", "单  价:", "I S B N:", "分  类:", "类容描述:", "作者简介:" };
	private int[][] labelLocation = { { 30, 30, 50, 25 }, { 300, 30, 50, 25 }, { 570, 30, 60, 25 }, { 30, 75, 50, 25 },
			{ 300, 75, 50, 25 }, { 580, 75, 40, 25 }, { 30, 130, 50, 25 }, { 140, 230, 60, 25 }, { 140, 350, 60, 25 } };
	// 建立一个输入域的对象组,分别是图书名,作者,出版时间,出版社,单价,ISBN,类容简介,作者简介
	public JTextField[] insertPageField = new JTextField[6];
	private int[][] fieldLocation = { { 80, 31, 170, 24 }, { 350, 31, 170, 24 }, { 630, 31, 170, 24 },
			{ 80, 76, 170, 24 }, { 350, 76, 170, 24 }, { 630, 76, 170, 24 } };
	@SuppressWarnings("rawtypes")
	public JComboBox bookclassComboBox = new JComboBox();
	// 实例化一个内容简介的文本输入域
	public JTextArea contentArea = new JTextArea();
	// 实例化一个作者简介的文本输入域
	public JTextArea authorsArea = new JTextArea();
	// 实例化一个添加按钮
	public JButton insertButton = new JButton("添  加");
	// 初始化图书操作子菜单的名称
	private String[] menuItemString = { "查  询", "修  改", "删  除" };

	@SuppressWarnings("unchecked")
	@Override
	public void init() {
		// TODO Auto-generated method stub
		// 调用父类初始化菜单
		super.menuInit(menuItemString);
		// 添加面板组件
		// 初始化标签
		for (int i = 0; i < insertPageLabel.length; i++) {
			insertPageLabel[i] = new JLabel(labelText[i]);
			insertPageLabel[i].setBounds(labelLocation[i][0], labelLocation[i][1], labelLocation[i][2],
					labelLocation[i][3]);
			this.add(insertPageLabel[i]);
		}
		// 初始化文本输入域
		for (int i = 0; i < insertPageField.length; i++) {
			insertPageField[i] = new JTextField();
			insertPageField[i].setBounds(fieldLocation[i][0], fieldLocation[i][1], fieldLocation[i][2],
					labelLocation[i][3]);
			this.add(insertPageField[i]);
		}
		// 初始化"所属分类标签"
		// 初始化下拉列表
		String[] comboBoxItem = { "A、 马克思主义、列宁主义、毛泽东思想、邓小平理论", "B、 哲学、宗教", "C、 社会科学总论", "D、 政治、法律", "E、 军事", "F、 经济",
				"G、 文化、科学、教育、体育", "H、 语言、文字", "I、 文学", "J、 艺术", "K、 历史、地理", "N、 自然科学总论", "O、 数理科学和化学", "P、 天文学、地球科学",
				"Q、 生物科学", "R、 医药、卫生", "S、 农业科学", "T、 工业技术", "U、 交通运输", "V、 航空、航天", "X、 环境科学、安全科学", "Z、 综合性图书" };
		for (String s : comboBoxItem) {
			bookclassComboBox.addItem(s);
		}
		bookclassComboBox.setBounds(80, 130, 400, 25);
		this.add(bookclassComboBox);
		// 初始化内容简介输入域
		contentArea.setBounds(200, 200, 500, 100);
		this.add(contentArea);
		// 初始化作者简介输入域
		authorsArea.setBounds(200, 320, 500, 100);
		this.add(authorsArea);
		// 初始化添加按钮
		insertButton.setBounds(400, 460, 80, 30);
		this.add(insertButton);
	}

	public InsertPage() {
		this.setLayout(null);
		this.setTitle("图书管理系统-图书添加界面");
		init();
		this.setResizable(false);
		this.setBounds(width, height, sizeX, sizeY);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
