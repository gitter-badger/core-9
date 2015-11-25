/** 
 * [SIMINOV FRAMEWORK]
 * Copyright [2015] [Siminov Software Solution LLP|support@siminov.com]
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

package siminov.core.database.design;

import java.util.Iterator;
import java.util.Map;

import siminov.core.exception.DatabaseException;
import siminov.core.model.DatabaseDescriptor;
import siminov.core.model.EntityDescriptor;


/**
 * Exposes methods to deal with database. 
 * It has methods to create, delete, and perform other common database management tasks.
 */
public interface IDatabase {

	/**
	   Is used to create a new table in an database.
	  	<p>
	  	Using SIMINOV there are three ways to create table in database.
	   	
	   	<pre> 
	  		<ul>
	  			<li> Describing table structure in form of ENTITY-DESCRIPTOR XML file. And creation of table will be handled by SIMINOV.
	  				<p>
SIMINOV will parse each ENTITY-DESCRIPTOR XML defined by developer and create table's in database.
	  				
Example:
	{@code

<!-- Design Of EntityDescriptor.xml -->

<entity-descriptor>

    <!-- General Properties Of Table And Class -->
    
    	<!-- Mandatory Field -->
    		<!-- NAME OF TABLE -->
    <property name="table_name">name_of_table</property>
    
    	<!-- Mandatory Field -->
    		<!-- MAPPED CLASS NAME -->
    <property name="class_name">mapped_class_name</property>
    
    
    	<!-- Optional Field -->
    <attributes>
        
	    <!-- Column Properties Required Under This Table -->
	    
			<!-- Optional Field -->
		<attribute>
		    
			    <!-- Mandatory Field -->
					<!-- COLUMN_NAME: Mandatory Field -->
   		    <property name="column_name">column_name_of_table</property>
		    			
    		    <!-- Mandatory Field -->
					<!-- VARIABLE_NAME: Mandatory Field -->
		    <property name="variable_name">class_variable_name</property>
		    		    
			    <!-- Mandatory Field -->
			<property name="type">java_variable_data_type</property>
			
				<!-- Optional Field (Default is false) -->
			<property name="primary_key">true/false</property>
			
				<!-- Optional Field (Default is false) -->
			<property name="not_null">true/false</property>
			
				<!-- Optional Field (Default is false) -->
			<property name="unique">true/false</property>
			
				<!-- Optional Field -->
			<property name="check">condition_to_be_checked (Eg: variable_name 'condition' value; variable_name > 0)</property>
			
				<!-- Optional Field -->
			<property name="default">default_value_of_column (Eg: 0.1)</property>
		
		</attribute>		

    </attributes>
		
		
		<!-- Optional Field -->
    <indexes>
        
		<!-- Index Properties -->
		<index>
		    
			    <!-- Mandatory Field -->
			    	<!-- NAME OF INDEX -->
		    <property name="name">name_of_index</property>
		    
			    <!-- Mandatory Field -->
					<!-- UNIQUE: Optional Field (Default is false) -->
		    <property name="unique">true/false</property>
		    
		    	<!-- Optional Field -->
		    		<!-- Name of the column -->
		    <property name="column">column_name_needs_to_add</property>
		    
		</index>
        
    </indexes>
    
		
	<!-- Map Relationship Properties -->
				
		<!-- Optional Field's -->	
	<relationships>
		    
	    <relationship>
	        
	        	<!-- Mandatory Field -->
	        		<!-- Type of Relationship -->
	        <property name="type">one-to-one|one-to-many|many-to-one|many-to-many</property>
	        
	        	<!-- Mandatory Field -->
	        		<!-- REFER -->
	        <property name="refer">class_variable_name</property>
	        
	        	<!-- Mandatory Field -->
	        		<!-- REFER TO -->
	        <property name="refer_to">map_to_class_name</property>
	            
	        	<!-- Optional Field -->
	        <property name="on_update">cascade/restrict/no_action/set_null/set_default</property>    
	            
	        	<!-- Optional Field -->    
	        <property name="on_delete">cascade/restrict/no_action/set_null/set_default</property>    
	            
				<!-- Optional Field (Default is false) -->
	       	<property name="load">true/false</property>	            
	        
	    </relationship>
	    
	</relationships>

</entity-descriptor>

	
	}
					</p>
	  			</li>
	  		</ul> 
	  	</pre>
	  </p>
	  
	 * @throws DatabaseException If not able to create table in SQLite.
	 */
	public void createTable() throws DatabaseException;

	/**
	 * It drop's the table from database based on entity-descriptor.
	  	<p>
			<pre> Drop the Liquor table.
	
	{@code
	
	Liquor liquor = new Liquor();
	
	try {
		liquor.dropTable();
	} catch(DatabaseException databaseException) {
		//Log It.
	}
	
	}
	
			</pre>
		</p>

	 * @throws DatabaseException If not able to drop table.
	 */
	public void dropTable() throws DatabaseException;

	/**
	   Is used to drop a index on a table in database.
	  	<p>
			<pre> Create Index On Liquor table.
	
	{@code
	
	String indexName = "LIQUOR_INDEX_BASED_ON_LINK";
	Liquor liquor = new Liquor();
	
	try {
		liquor.dropIndex(indexName);
	} catch(DatabaseException databaseException) {
		//Log It.
	}
	
	}
			</pre>
		</p>

	 * @param indexName Name of a index needs to be drop.
	 * @throws DatabaseException If not able to drop index on table.
	 */
	public void dropIndex(String indexName) throws DatabaseException;
	
	/**
 	Returns all tuples based on query from mapped table for invoked class object.
 
 	<pre>
 	
Example:

{@code

Liquor[] liquors = null;
try {
	liquors = new Liquor().select().execute();
} catch(DatabaseException de) {
	//Log it.
}
 		
} 			
 	</pre>

	 	@return ISelect object.
	 	@throws DatabaseException If any error occur while getting tuples from a single table.
	 */
	public ISelect select() throws DatabaseException;

	/**
 	Returns all tuples based on manual query from mapped table for invoked class object.
 
 	<pre>
 	
Example:

{@code

String query = "SELECT * FROM LIQUOR";

Liquor[] liquors = null;
try {
	liquors = new Liquor().select(query);
} catch(DatabaseException de) {
	//Log it.
}
 		
} 			
 	</pre>

		@param query Query to get tuples from database.
	 	@return ISelect object.
	 	@throws DatabaseException If any error occur while getting tuples from a single table.
	 */
	public Object[] select(String query) throws DatabaseException;

	/**
	It adds a record to any single table in a relational database.

   	<pre>
   	
Example: Make Liquor Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

try {
	beer.save();
} catch(DatabaseException de) {
	//Log it.
}

}

    </pre>
 
   	@throws DatabaseException If any error occurs while saving tuples in database.
	 */
	public void save() throws DatabaseException;

	/**
	It updates a record to any single table in a relational database.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

try {
	beer.update();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while saving tuples in database.
	 */
	public void update() throws DatabaseException;

	/**
	It finds out whether tuple exists in table or not.
	IF NOT EXISTS:
		adds a record to any single table in a relational database.
	ELSE:
		updates a record to any single table in a relational database.

   	<pre>
   	
Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

try {
	beer.saveOrUpdate();
} catch(DatabaseException de) {
	//Log it.
}
		
}			
			
    </pre>
 
   	@throws DatabaseException If any error occurs while saving tuples in database.
 */
	public void saveOrUpdate() throws DatabaseException;

	/**
	It deletes a record from single table in a relational database.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

try {
	beer.delete();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while saving tuples in database.
	 */
	public IDelete delete() throws DatabaseException;

	/**
	Returns the count of rows based on where clause provided.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

int noOfBeers = 0;

try {
	noOfBeers = beer.count().execute();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while getting count of tuples from database.
	 */
	public ICount count() throws DatabaseException;

	/**
	Returns the average based on where clause provided.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

int noOfBeers = 0;

try {
	noOfBeers = beer.avg().execute();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while getting average from database.
	 */
	public IAverage avg() throws DatabaseException;

	/**
	Returns the sum based on where clause provided.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

int noOfBeers = 0;

try {
	noOfBeers = beer.sum().execute();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while getting sum from database.
	 */
	public ISum sum() throws DatabaseException;

	/**
	Returns the total based on where clause provided.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

int totalBeers = 0;

try {
	totalBeers = beer.avg().execute();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while getting total tuples from database.
	 */
	public ITotal total() throws DatabaseException;

	/**
	Returns the min based on where clause provided.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

int minBeers = 0;

try {
	minBeers = beer.min().execute();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while getting min from database.
	 */
	public IMin min() throws DatabaseException;

	/**
	Returns the max based on where clause provided.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

int maxBeers = 0;

try {
	maxBeers = beer.max().execute();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while getting max from database.
	 */
	public IMax max() throws DatabaseException;

	/**
	Returns the group concat based on where clause provided.

   	<pre>

Example: Make Beer Object

{@code

Liquor beer = new Liquor();
beer.setLiquorType(Liquor.LIQUOR_TYPE_BEER);
beer.setDescription(applicationContext.getString(R.string.beer_description));
beer.setHistory(applicationContext.getString(R.string.beer_history));
beer.setLink(applicationContext.getString(R.string.beer_link));
beer.setAlcholContent(applicationContext.getString(R.string.beer_alchol_content));

int groupConcatBeers = 0;

try {
	groupConcatBeers = beer.groupConcat().execute();
} catch(DatabaseException de) {
	//Log it.
}

}
    </pre>
 
   	@throws DatabaseException If any error occurs while getting group concat from database.
	 */
	public IGroupConcat groupConcat() throws DatabaseException;

	/**
	 * Returns database descriptor object based on the POJO class called.

	 <pre>
Example:

	{@code
	try {
		DatabaseDescriptor databaseDescriptor = new Liquor().getDatabaseDescriptor();
	} catch(DatabaseException databaseException) {
		//Log It.
	}
	
	}
	</pre>
	
	 * @return Database Descriptor Object.
	 * @throws DatabaseException If any error occur while getting database descriptor object.
	 */
	public DatabaseDescriptor getDatabaseDescriptor() throws DatabaseException;

	/**
 	Returns the actual entity descriptor object mapped for invoked class object.
 
 	<pre>
 	
Example:
{@code
 			
EntityDescriptor entityDescriptor = null;
try {
	entityDescriptor = new Liquor().getEntityDescriptor();
} catch(DatabaseException de) {
	//Log it.
}

} 			
		
 	</pre>
 	
 	@return EntityDescriptor Object
 	@throws DatabaseException If entity descriptor object not mapped for invoked class object.
	 */
	public EntityDescriptor getEntityDescriptor() throws DatabaseException;

	/**
 	Returns the mapped table name for invoked class object.
 
 	<pre>

Example:

{@code

String tableName = null;
try {
	tableName = new Liquor().getTableName();
} catch(DatabaseException de) {
	//Log it.
}

}
 			
 	</pre>
 
 	@return Mapped Table name.
 	@throws DatabaseException If no mapped table found for invoked class object.
	 */
	public String getTableName() throws DatabaseException;

	/**
 	Returns all column names of mapped table.
 	
 	<pre>

Example:

{@code

Iterator<String> columnNames = null;
try {
	columnNames = new Liquor().getColumnNames();
} catch(DatabaseException de) {
	//Log it.
}
 		
} 			
 	</pre>
 	
 	@return All column names of mapped table.
 	@throws DatabaseException If no mapped table found for invoked class object.
	 */
	public Iterator<String> getColumnNames() throws DatabaseException;

	/**
 	Returns all column values in the same order of column names for invoked class object.
 	
 	<pre>

Example:
{@code

Map<String, Object> values = null;
try {
	values = new Liquor().getColumnValues();
} catch(DatabaseException de) {
	//Log it.
}

}	
 	</pre>
 	
 	@return All column values for invoked object.
 	@throws DatabaseException If no mapped table found for invoked class object.
	 */
	public Map<String, Object> getColumnValues() throws DatabaseException;

	/**
 	Returns all columns with there data types for invoked class object.

 	<pre>

Example:

{@code

Map<String, String> columnTypes = null;
try {
	columnTypes = new Liquor().getColumnTypes();
} catch(DatabaseException de) {
	//Log it.
}	

} 		
 	</pre>
 	
 	@return All columns with there data types.
 	@throws DatabaseException If no mapped table found for invoked class object.
	 */
	public Map<String, String> getColumnTypes() throws DatabaseException;

	/**
 	Returns all primary keys of mapped table for invoked class object.
 	
 	<pre>

Example:
 		
{@code

Iterator<String> primaryKeys = null;
try {
	primaryKeys = new Liquor().getPrimeryKeys();
} catch(DatabaseException de) {
	//Log it.
}

} 	
 	</pre>
 
 	@return All primary keys.
 	@throws DatabaseException If not mapped table found for invoked class object.
	 */
	public Iterator<String> getPrimaryKeys() throws DatabaseException;

	/**
 	Returns all mandatory fields which are associated with mapped table for invoked class object.
 
 	<pre>

Example:
 			
{@code

Iterator<String> mandatoryFields = null;
try {
	mandatoryFields = new Liquor().getMandatoryFields();
} catch(DatabaseException de) {
	//Log it.
}

} 			
 	</pre>
 
 	@return All mandatory fields for mapped table.
 	@throws DatabaseException If no mapped table found for invoked class object.
	 */
	public Iterator<String> getMandatoryFields() throws DatabaseException;

	/**
 	Returns all unique fields which are associated with mapped table for invoked class object.
 
 	<pre>

Example:
 			
{@code
 			
Iterator<String> uniqueFields = null;
try {
	uniqueFields = new Liquor().getUniqueFields();
} catch(DatabaseException de) {
	//Log it.
}
 		
} 			
 	</pre>
 
 	@return All unique fields for mapped table.
 	@throws DatabaseException If no mapped table found for invoked class object.
	 */
	public Iterator<String> getUniqueFields() throws DatabaseException;

	/**
 	Returns all foreign keys of mapped table for invoked class object.
 
 	<pre>
 		
Example:
 			
{@code
 			
Iterator<String> foreignKeys = null;
try {
	foreignKeys = new Liquor().getForeignKeys();
} catch(DatabaseException de) {
	//Log it.
}

} 			
 		
 	</pre>
 
 	@return All foreign keys of mapped table.
 	@throws DatabaseException If no mapped table found for invoked class object.
 */
	public Iterator<String> getForeignKeys() throws DatabaseException;
}