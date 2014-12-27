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

/**
 * Exposes API's to provide condition on where clause to calculate group concat.
 */
public interface IGroupConcatClause {

	/**
	 * Used to specify EQUAL TO (=) condition.
	 * @param value Value for which EQUAL TO (=) condition will be applied.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat equalTo(Object value);
	
	
	/**
	 * Used to specify NOT EQUAL TO (!=) condition.
	 * @param value Value for which NOT EQUAL TO (=) condition will be applied.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat notEqualTo(Object value);
	
	/**
	 * Used to specify GREATER THAN (>) condition.
	 * @param value Value for while GREATER THAN (>) condition will be specified.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat greaterThan(Object value);
	
	/**
	 * Used to specify GREATER THAN EQUAL (>=) condition.
	 * @param value Value for which GREATER THAN EQUAL (>=) condition will be specified.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat greaterThanEqual(Object value);
	
	/**
	 * Used to specify LESS THAN (<) condition.
	 * @param value Value for which LESS THAN (<) condition will be specified.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat lessThan(Object value);
	
	/**
	 * Used to specify LESS THAN EQUAL (<=) condition.
	 * @param value Value for which LESS THAN EQUAL (<=) condition will be specified.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat lessThanEqual(Object value);
	
	/**
	 * Used to specify BETWEEN condition.
	 * @param start Start Range.
	 * @param end End Range.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat between(Object start, Object end);
	
	/**
	 * Used to specify LIKE condition.
	 * @param like LIKE condition.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat like(Object like);
	
	/**
	 * Used to specify IN condition.
	 * @param values Values for IN condition.
	 * @return IGroupConcat Interface.
	 */
	public IGroupConcat in(Object...values);

}
