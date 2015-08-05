package com.example.fw;

import com.example.tests.Folders;

public class FolderHelper {

	private ApplicationManager manager;

	public FolderHelper(ApplicationManager applicationManager) {
		this.manager = applicationManager;
		// TODO Auto-generated constructor stub
	}

	public Folders getFolders() {
		manager.getApplication();
	}

	public void createFolder(String string) {
		// TODO Auto-generated method stub
		
	}

}
