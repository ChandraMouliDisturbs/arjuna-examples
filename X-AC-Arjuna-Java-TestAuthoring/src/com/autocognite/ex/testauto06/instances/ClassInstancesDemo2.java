/*******************************************************************************
 * Copyright 2015-16 AutoCognite Testing Research Pvt Ltd
 * 
 * Website: www.AutoCognite.com
 * Email: support [at] autocognite.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.autocognite.ex.testauto06.instances;

import static com.autocognite.unitee.assertions.Assertions.assertEquals;

import com.autocognite.unitee.annotations.Instances;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;
import com.autocognite.unitee.interfaces.TestVariables;

@TestClass
@Instances( udv={"var1=a","var2=c,d"})
public class ClassInstancesDemo2{
	
	public ClassInstancesDemo2(TestVariables testClassVars) throws Exception{		
		Assertions.assertEquals(testClassVars.udv().string("Var1"), "a");
		Assertions.assertEquals(testClassVars.udv().string("Var2"), "c");
	}

	public void test1(TestVariables testMethodVars) throws Exception{	
		Assertions.assertEquals(testMethodVars.udv().string("Var1"), "a");
		Assertions.assertEquals(testMethodVars.udv().string("Var2"), "c");
		assertEquals(3,3).evaluate();
	}
	
	public void test2(TestVariables testMethodVars) throws Exception{
		Assertions.assertEquals(testMethodVars.udv().string("Var1"), "a");
		Assertions.assertEquals(testMethodVars.udv().string("Var2"), "c");
		assertEquals(1,2);
	}
	
}
