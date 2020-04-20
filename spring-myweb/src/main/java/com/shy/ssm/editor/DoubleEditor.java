package com.shy.ssm.editor;

import java.beans.PropertyEditorSupport;

/**
 * @author 石皓岩
 * @create 2020-03-05 21:30
 * 描述：
 */
//@Component	// 我们可以把他交给spring进行管理
public class DoubleEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (text == null || text.equals("")) {
			text = "0";
		}
		setValue(Double.parseDouble(text));
	}

	@Override
	public String getAsText() {
		return getValue().toString();
	}
}
