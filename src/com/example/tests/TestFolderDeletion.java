package com.example.tests;

import org.testng.annotations.Test;

import com.example.fw.Folders;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TestFolderDeletion extends TestBase{

		@Test
			public void testFolderDeletion() {
			String folder = "newfolder";
			int index = 0;
			app.getFolderHelper().createFolder(folder);
			Folders oldFolders = app.getFolderHelper().getFolders();
			app.getFolderHelper().deleteFolder(index);
			Folders newFolders = app.getFolderHelper().getFolders();
			assertThat(newFolders, equalTo(oldFolders.withoutDeleted(index)));
		}
}
