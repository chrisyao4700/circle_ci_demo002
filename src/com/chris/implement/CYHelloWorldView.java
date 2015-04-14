package com.chris.implement;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.dinesh.implement.DSNameCreater;
import com.yu.implement.LYNameCreater;

public class CYHelloWorldView {
	private JFrame frame;
	private JPanel contentPanel;
	private ArrayList<JLabel> labelList;
	
	public CYHelloWorldView(){
		frame = new JFrame("Circle CI Demo");
		frame.setSize(800, 600);
		frame.setLocation(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelList = new ArrayList<JLabel>();
		contentPanel = this.createPanel();
		
		
		
	}
	
	public void init(){
		frame.getContentPane().removeAll();
		frame.add(contentPanel);
		frame.setVisible(true);
	}
	
	private JPanel createPanel(){
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel label = new JLabel("<html><div style=\"text-align: center;\">" + "Hello World  " + "</html>");
		label.setSize(500, 80);
		label.setLocation(200,0);
		label.setFont(new Font("Serif", Font.PLAIN, 50));
		
		
		panel.add(label);
		labelList.add(this.createYuanLabel());
		for(JLabel aLabel : labelList){
			panel.add(aLabel);
		}
		
		JButton buttonY = new JButton("Add Yu");
		buttonY.setSize(100, 30);
		buttonY.setLocation(30, 500);
		buttonY.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {			
				addNameLabel(LYNameCreater.getName());
			}
			
		});
		
		JButton buttonD = new JButton("Add Denish");
		buttonD.setSize(100, 30);
		buttonD.setLocation(500, 500);
		buttonD.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {				
				addNameLabel(DSNameCreater.getName());
			}
			
		});
		panel.add(buttonY);
		panel.add(buttonD);
		return panel;
		
	}
	
	private JLabel createYuanLabel(){
		JLabel nameLabel = new JLabel(CYNameCreater.getName());
		nameLabel.setSize(200, 80);
		nameLabel.setLocation(250,100);
		nameLabel.setFont(new Font("Serif", Font.BOLD,30) );
		return nameLabel;
	}

	
	private void addNameLabel(String name) {
		JLabel label = new JLabel(name);
		label.setFont(new Font("Serif", Font.BOLD, 30));
		label.setSize(300, 30);
		label.setLocation(250,(120 +labelList.size() * 50));
		contentPanel.add(label);
		labelList.add(label);
		frame.setVisible(false);
		this.init();
		
	}

}
