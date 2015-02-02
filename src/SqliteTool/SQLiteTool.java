/**
 * Class: SQLiteTool
 * Note: 数据库工具类：创建数据库，以及增删改查这些数据库操作方法将会写入到这个类中
 * Author: Zhang Wenping
 * Date: 2015.1.7
 * Version: V1.0.0
 * Comments: N/A
 */
package SqliteTool;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteTool extends SQLiteOpenHelper{
	public SQLiteTool(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		System.out.println("创建一个数据库");
		arg0.execSQL("CREATE TABLE IF NOT EXISTS INVESTMENT_INFO("+"ID INTEGER PRIMARY KEY,"+"PLATFORM TEXT,"+"WEBSITE TEXT,"+"INVESTMENT TEXT,"+"RETURN_CASH_OTHERS TEXT,"+"BUY_DATE TEXT,"+"RETURN_CASH_DAY TEXT,"+"LOOP_DAY TEXT,"+"EXPECT_EARNINGS TEXT,"+"STATUS TEXT,"+"WELFARE TEXT,"+"RECOMMENDATION_WELFARE TEXT,"+"INTEREST TEXT,"+"EXPERIENCE_INTEREST TEXT,"+"INVESTMENT_REWARD TEXT,"+"RETURN_CASH_SELF TEXT,"+"TELEPHONE_CHARGE TEXT,"+"POUNDAGE TEXT,"+"WITHDRAW_DEPOSIT TEXT,"+"SPARE_MONEY TEXT,"+"EARNING_YIELD_RATE TEXT,"+"ANNUAL_YIELD_RATE TEXT,"+"ACCOUNT_COUNT TEXT,"+"BANK TEXT,"+"MONEY TEXT,"+"BILL_DATE TEXT,"+"REPAYMENT_DATE TEXT,"+")");
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		System.out.println("upgrade a database");
		
	}

}
