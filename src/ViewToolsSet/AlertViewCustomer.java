package ViewToolsSet;

import android.app.AlertDialog;
import android.content.Context;
import android.view.KeyEvent;

public class AlertViewCustomer extends AlertDialog{
	 
	public AlertViewCustomer(Context context, boolean cancelable,
			OnCancelListener cancelListener) {
		super(context, cancelable, cancelListener);
		// TODO Auto-generated constructor stub
	}

	public AlertViewCustomer(Context context, int theme) {
		super(context, theme);
		// TODO Auto-generated constructor stub
	}

	protected AlertViewCustomer(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
	}

//	public boolean onKeyDown(int keyCode, KeyEvent event){
//	    	if(keyCode == KeyEvent.KEYCODE_BACK){
//	    		//Create a alert dialog when pressing back key
//	    		AlertDialog exitDialog = new AlertDialog.Builder(this).create();
//	    		exitDialog.setTitle("退出");
//	    		exitDialog.setMessage("确定要退出Quick Note么？");
//	    		exitDialog.setButton("残忍退出", listener);
//	    		exitDialog.setButton2("再想想", listener);
//	    		exitDialog.show();
//	    	}
//			return false;
//	    }

}
