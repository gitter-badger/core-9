/** 
 * [SIMINOV FRAMEWORK]
 * Copyright [2013] [Siminov Software Solution LLP|support@siminov.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package siminov.orm.database;

import siminov.orm.database.design.IDataTypeHandler;
import siminov.orm.database.design.IDatabaseImpl;
import siminov.orm.database.design.IQueryBuilder;

public class DatabaseBundle {

	private IDatabaseImpl database = null;
	private IQueryBuilder queryBuilder = null;
	private IDataTypeHandler dataTypeHandler = null;
	
	public IDatabaseImpl getDatabase() {
		return this.database;
	}
	
	public void setDatabase(IDatabaseImpl database) {
		this.database = database;
	}
	
	public IQueryBuilder getQueryBuilder() {
		return this.queryBuilder;
	}
	
	public void setQueryBuilder(IQueryBuilder queryBuilder) {
		this.queryBuilder = queryBuilder;
	}
	
	public IDataTypeHandler getDataTypeHandler() {
		return this.dataTypeHandler;
	}
	
	public void setDataTypeHandler(IDataTypeHandler dataTypeHandler) {
		this.dataTypeHandler = dataTypeHandler;
	}
	
}
