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
package com.autocognite.ex.ddt07.dataref;

import com.autocognite.batteries.databroker.DataReference;
import com.autocognite.batteries.databroker.ReadOnlyDataRecord;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.annotations.ddt.FileDataReference;
import com.autocognite.unitee.assertions.Assertions;
import com.autocognite.unitee.interfaces.TestVariables;

@FileDataReference("dataref.xls")
@TestClass
public class ClassLevelDataReferenceExample{
	private DataReference dataRef = null;
	
	public ClassLevelDataReferenceExample(TestVariables classTestVars) throws Exception{
		ReadOnlyDataRecord dataRec = classTestVars.dataRef("dataref").getRecord("Bronze");
		Assertions.assertEquals(dataRec.value("user").asString(), "B1");
	}

	public void testEx(TestVariables testMethodVars) throws Exception{	
		ReadOnlyDataRecord dataRec = testMethodVars.dataRef("dataref").getRecord("Bronze");
		Assertions.assertEquals(dataRec.value("user").asString(), "B1");
	}
}
