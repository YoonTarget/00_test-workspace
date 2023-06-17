package com.kh.test.electronic.run;

import com.kh.test.electronic.model.vo.FoolTv;
import com.kh.test.electronic.model.vo.SmartTv;
import com.kh.test.electronic.model.vo.Tv;

public class TVRun {

	public static void main(String[] args) {
		
		Tv[] tv = new Tv[4];
		tv[0] = new SmartTv(false, 10, "자막테스트");
		tv[1] = new FoolTv(true, 50, "자막테스트");
		tv[2] = new FoolTv(false, 10, "자막테스트");
		tv[3] = new SmartTv(true, 50, "자막테스트");
		
		// 1. 해당 메소드가 오버라이딩 되어 있는 경우
		(tv[2]).showText();
		
		// 2. 해당 메소드가 FoolTv에만 있는 경우
		((FoolTv)tv[2]).showFoolTv();
		
		// 3. 해당 메소드가 SmartTv에만 있는 경우
		//((SmartTv)tv[2]).showSmartTv(); => 런타임 오류 (ClassCastException)
		
		// 4. 해당 메소드가 Tv에만 있는 경우
		((FoolTv)tv[2]).showTv();
		(tv[2]).showTv();
		
	}

}
