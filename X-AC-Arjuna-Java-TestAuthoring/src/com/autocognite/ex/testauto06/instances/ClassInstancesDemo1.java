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

@TestClass
@Instances(5)
public class ClassInstancesDemo1{

	public void test1() throws Exception{	
		assertEquals(3,3).evaluate();
	}
	
	public void test2() throws Exception{
		assertEquals(1,2);
	}
	
}
