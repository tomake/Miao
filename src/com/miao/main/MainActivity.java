package com.miao.main;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends TabActivity {
	TabHost tabHost;           //����ѡ�
	RadioGroup radioGroup;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		tabHost=getTabHost();
		tabHost.addTab(tabHost.newTabSpec("singleChat").setIndicator("single").setContent(new Intent(this,com.miao.singlechat.SingleChat.class)));
		tabHost.addTab(tabHost.newTabSpec("roomChat").setIndicator("room").setContent(new Intent(this,com.miao.roomchat.RoomChat.class)));
		//tabHost.addTab(tabHost.newTabSpec("mainWindow").setIndicator("main").setContent(new Intent(this,MainWindow.class)));
		tabHost.addTab(tabHost.newTabSpec("me").setIndicator("me").setContent(new Intent(this,com.miao.me.Me.class)));
		tabHost.addTab(tabHost.newTabSpec("zoom").setIndicator("zoom").setContent(new Intent(this,com.miao.zoom.Zoom.class)));
		
		tabHost.setCurrentTab(0);
		radioGroup=(RadioGroup)findViewById(R.id.rg_main);
		radioGroup.setOnCheckedChangeListener(tabChangeListener);
		
	}
	
	public void ReStart(){
		this.ReStart();	
	}
	
	
	private OnCheckedChangeListener tabChangeListener=new  OnCheckedChangeListener(){
		@Override 
		public void onCheckedChanged(RadioGroup group,int checkedId){
			switch(checkedId){
//			case R.id.rb_main:
//				tabHost.setCurrentTabByTag("mainWindow");
//				break;
			case R.id.rb_privateChat:
				
				tabHost.setCurrentTabByTag("singleChat");
				break;
			case R.id.rb_roomChat:
				tabHost.setCurrentTabByTag("roomChat");
				break;
			case R.id.rb_me:
				tabHost.setCurrentTabByTag("me");
				break;
			case R.id.rb_zoom:
				tabHost.setCurrentTabByTag("zoom");
				break;
			default:break;
				
			}
		}
	};
		
////			public TabHost.TabSpec newTabSpec (String tag)
//	//
////			��ȡһ���µ�TabHost.TabSpec������������ǰtabhost
////			tag   �����ѡ���ǩ(tag)
//			
////			public void addTab (TabHost.TabSpec tabSpec)
////			����һ��ѡ�
////			tabSpec    ָ����������ָʾ��������.


//	        
//			
//		}
//		
//		public void ReStart(){
//			this.ReStart();	
//		}
//		
//		//�ײ��˵�������
//		private OnCheckedChangeListener checkedChangeListener = new OnCheckedChangeListener() {
//
//			@Override
//			public void onCheckedChanged(RadioGroup group, int checkedId) {
//				switch (checkedId) {
//				case R.id.dongtai:
//					tabHost.setCurrentTabByTag("dongtai");
//					break;
//				case R.id.wanshang:
//
//					tabHost.setCurrentTabByTag("wanshang");
////					Intent intent=new Intent();
////					intent.setClass(MainActivity.this, CityList.class);
////					startActivity(intent);
//					break;
//				case R.id.shangcheng:
//					tabHost.setCurrentTabByTag("shangCheng");
//					String url="http://mall.mgw.cc";
//					Uri u = Uri.parse(url);  
//					Intent it = new Intent();
//					it.setAction(Intent.ACTION_VIEW);
//					it.setData(u);  
//					MainActivity.this.startActivity(it); 
//					break;
//	           case R.id.me:
//	        	   tabHost.setCurrentTabByTag("me");
//	        	   break;
//
//				default:
//					break;
//				}
//			}
//		};

		
	

	
}
