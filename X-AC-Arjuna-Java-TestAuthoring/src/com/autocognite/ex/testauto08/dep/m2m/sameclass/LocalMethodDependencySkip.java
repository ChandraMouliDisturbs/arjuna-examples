package com.autocognite.ex.testauto08.dep.m2m.sameclass;

import org.apache.log4j.Logger;

import com.autocognite.batteries.config.RunConfig;
import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.Skip;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
public class LocalMethodDependencySkip {
	private static Logger logger = RunConfig.getCentralLogger();
	
	@Dependency("test2")
	public void test1() throws Exception{
		Assertions.assertEquals(1,1);
	}

	@Skip
	public void test2() throws Exception{
		Assertions.error("Fake Error");
	}
}
