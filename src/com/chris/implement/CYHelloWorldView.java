package com.chris.implement;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.team.implement.ViewNameAdder;

public class CYHelloWorldView implements ViewNameAdder {
	private JFrame frame;
	private JPanel contentPanel;
	public CYHelloWorldView(){
		frame = new JFrame("Circle CI Demo");
		frame.setSize(800, 300);
		frame.setLocation(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = this.createPanel();
	}
	
	public void init(){
		frame.getContentPane().removeAll();
		frame.add(contentPanel);
		frame.setVisible(true);
	}
	
	private JPanel createPanel(){
		JPanel panel = new JPanel();
		//panel.setLayout(null);
		JLabel label = new JLabel("<html><div style=\"text-align: center;\">" + "Hello World," + "</html>");
		label.setSize(800, 150);
		label.setLocation(0,0);
		label.setFont(new Font("Serif", Font.PLAIN, 50));
		JLabel nameLabel = new JLabel(CYNameCreater.getName());
		nameLabel.setSize(800, 150);
		nameLabel.setLocation(0,150);
		nameLabel.setFont(new Font("Serif", Font.BOLD,40) );
		panel.add(label);
		panel.add(nameLabel);
		return panel;
		
	}

	@Override
	public void addNameLabel(String name) {
		JLabel label = new JLabel(name);
		label.setFont(new Font("Serif", Font.BOLD, 40));
		frame.setVisible(false);
		this.init();
		
	}

}
