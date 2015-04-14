package com.team.implement;

import com.chris.implement.CYHelloWorldView;
import com.yu.implement.LYNameCreater;

public class CYCircleStart {
	public static void main(String[] args){
		CYHelloWorldView cyhwv = new CYHelloWorldView();
		cyhwv.init();
		ViewNameAdder vna = cyhwv;
		vna.addNameLabel(LYNameCreater.getName());
		vna.addNameLabel(LYNameCreater.getName());
		
	}

}
