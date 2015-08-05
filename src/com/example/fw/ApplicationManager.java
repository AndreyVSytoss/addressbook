package com.example.fw;

import java.util.Properties;


public class ApplicationManager {
	
	private static ApplicationManager singleton;
	
	private Properties props;

	private FolderHelper folderHelper;
	
	public static ApplicationManager getInstance() {
		if(singleton == null){
			singleton = new ApplicationManager();
		}
		return singleton;
	}
	
	public void setProperties(Properties props) {
		this.props = props;
	}
	
	public String getProperty(String key) {
		return props.getProperty(key);
	}

	public void stop() {
	}

	public FolderHelper getFolderHelper() {
		if (folderHelper == null) {
			folderHelper = new FolderHelper(this);
		}
		return null;
	}
}
