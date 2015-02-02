/**
 * Class: SplashActivity
 * Note: 过渡界面，显示应用程序名称，版权，作者（工作室）信息以及广告
 * Author: Zhang Wenping
 * Date: 2015.1.6
 * Version: V1.0.0
 * Comments: N/A
 */
package com.example.quicknote;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        //Wait 3 seconds and turn to MainView 
        new Handler().postDelayed(new Runnable() {  
            @Override  
            public void run() {  
                Intent intent = new Intent(SplashActivity.this,  
                        MainView.class);  
                startActivity(intent);  
            }  
  
        }, 2000);
    }


    @Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
