package org.jbake.app;

import java.io.File;
import java.net.URL;

import junit.framework.Assert;

import org.apache.commons.configuration.CompositeConfiguration;
import org.junit.Test;

public class ConfigUtilTest {

	@Test
	public void load() throws Exception {
		CompositeConfiguration config = ConfigUtil.load(new File(this.getClass().getResource("/").getFile()));
		// check default.properties values exist
		Assert.assertEquals("output", config.getString("destination.folder"));	
		
		File path = new File(this.getClass().getResource("/").getFile());
		System.out.println(path.getPath());
		for (File file : path.listFiles()) {
			System.out.println(file.getPath());
		}
		
		// check custom.properties values exist
		Assert.assertEquals("testing123", config.getString("test.property"));
	}
}
