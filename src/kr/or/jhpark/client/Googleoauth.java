package kr.or.jhpark.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;


public class Googleoauth implements EntryPoint {
	public void onModuleLoad() {
		
		Button btn = new Button("GWT Google Login");
		btn.setSize("200px", "30px");
		RootPanel.get().add(btn);
	}
	
	
	class GoogleOAuthHandler implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			Googleoauth.login();
		}
		
	}
	
	public static native void login()/*-{
		$wnd.login();
	}-*/;
}
