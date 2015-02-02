/**
 * Class: MainView
 * Note: 主界面
 * Author: Zhang Wenping
 * Date: 2015.1.7
 * Version: V1.0.0
 * Comments: N/A
 */
package com.example.quicknote;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.ImageButton;

public class EditView extends Activity implements OnClickListener{

	ImageButton imgButton1;
	ImageButton imgButton2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.editview_acitivity);
		imgButton1 = (ImageButton) findViewById(R.id.edit_menu_btn);
		imgButton1.setOnClickListener((android.view.View.OnClickListener) this);
	}
	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}
	
}
