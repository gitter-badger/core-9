﻿///
/// [SIMINOV FRAMEWORK - CORE]
/// Copyright [2014-2016] [Siminov Software Solution LLP|support@siminov.com]
///
/// Licensed under the Apache License, Version 2.0 (the "License");
/// you may not use this file except in compliance with the License.
/// You may obtain a copy of the License at
///
///     http://www.apache.org/licenses/LICENSE-2.0
///
/// Unless required by applicable law or agreed to in writing, software
/// distributed under the License is distributed on an "AS IS" BASIS,
/// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/// See the License for the specific language governing permissions and
/// limitations under the License.


using Siminov.Core.Database.Design;
using Siminov.Core.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Siminov.Core.Database
{

    /// <summary>
    /// It is used to provide condition between where clause.
    /// </summary>
    public class TotalImpl : ITotal
    {

        private EntityDescriptor entityDescriptor = null;
        private Object referObject = null;


        private String column = null;
        private String[] columns = new String[] { };

        private TotalClauseImpl where = null;
        private String whereClause = null;

        private String[] orderBy = null;
        private String whichOrderBy = null;

        private String[] groupBy;

        private TotalClauseImpl having = null;
        private String havingClause = null;

        private int limit;

        private bool distinct = false;

        private String delimiter = null;

        /// <summary>
        /// Where Constructor
        /// </summary>
        public TotalImpl()
        {

        }

        /// <summary>
        /// Where Constructor
        /// </summary>
        /// <param name="entityDescriptor">Entity Descriptor instance</param>
        public TotalImpl(EntityDescriptor entityDescriptor)
        {
            this.entityDescriptor = entityDescriptor;
        }

        /// <summary>
        /// Where Constructor
        /// </summary>
        /// <param name="entityDescriptor">Entity Descriptor instance</param>
        /// <param name="referObject">Refered Object instance</param>
        public TotalImpl(EntityDescriptor entityDescriptor, Object referObject)
        {
            this.entityDescriptor = entityDescriptor;
            this.referObject = referObject;
        }

        /// <summary>
        /// Used to specify DISTINCT condition.
        /// </summary>
        /// <returns>Where instance object</returns>
        public ITotal Distinct()
        {
            this.distinct = true;
            return this;
        }

        /// <summary>
        /// Column name of which condition will be specified.
        /// </summary>
        /// <param name="column">Name of column</param>
        /// <returns>Clause instance object</returns>
        public ITotalClause Where(String column)
        {

            where = new TotalClauseImpl(this);
            where.AddCol(column);

            return where;
        }

        /// <summary>
        /// Used to provide manually created Where clause, instead of using API's.
        /// </summary>
        /// <param name="whereClause">Manually created where clause</param>
        /// <returns>Where instance object</returns>
        public ITotal WhereClause(String whereClause)
        {
            this.whereClause = whereClause;
            return this;
        }

        /// <summary>
        /// Used to specify AND condition between where clause.
        /// </summary>
        /// <param name="column">Name of column on which condition need to be specified.</param>
        /// <returns>Clause instance object</returns>
        public ITotalClause And(String column)
        {
            this.where.And(column);
            return this.where;
        }

        /// <summary>
        /// Used to specify OR condition between where clause.
        /// </summary>
        /// <param name="column">Name of column on which condition need to be specified</param>
        /// <returns>Clause instance object</returns>
        public ITotalClause Or(String column)
        {
            this.where.Or(column);
            return this.where;
        }


        /// <summary>
        /// Used to specify ORDER BY keyword to sort the result-set.
        /// </summary>
        /// <param name="columns">Name of columns which need to be sorted</param>
        /// <returns>Where instance object</returns>
        public ITotal OrderBy(String[] columns)
        {
            this.orderBy = columns;
            return this;
        }

        /// <summary>
        /// Used to specify ORDER BY ASC keyword to sort the result-set in ascending order.
        /// </summary>
        /// <param name="columns">Name of columns which need to be sorted</param>
        /// <returns>Where instance object</returns>
        public ITotal AscendingOrderBy(String[] columns)
        {
            this.orderBy = columns;
            this.whichOrderBy = TotalClauseImpl.ASC_ORDER_BY;

            return this;
        }

        /// <summary>
        /// Used to specify ORDER BY DESC keyword to sort the result-set in descending order.
        /// </summary>
        /// <param name="columns">Name of columns which need to be sorted</param>
        /// <returns>Where instance object</returns>
        public ITotal DescendingOrderBy(String[] columns)
        {
            this.orderBy = columns;
            this.whichOrderBy = TotalClauseImpl.DESC_ORDER_BY;

            return this;
        }

        /// <summary>
        /// Used to specify the range of data need to fetch from table.
        /// </summary>
        /// <param name="limit">LIMIT of data</param>
        /// <returns>Where instance object</returns>
        public ITotal Limit(int limit)
        {
            this.limit = limit;
            return this;
        }

        /// <summary>
        /// Used to specify GROUP BY statement in conjunction with the aggregate functions to group the result-set by one or more columns.
        /// </summary>
        /// <param name="columns">Name of columns</param>
        /// <returns>Where instance object</returns>
        public ITotal GroupBy(String[] columns)
        {
            this.groupBy = columns;
            return this;
        }

        /// <summary>
        /// Used to specify HAVING clause to SQL because the WHERE keyword could not be used with aggregate functions.
        /// </summary>
        /// <param name="column">Name of column on which condition need to be applied</param>
        /// <returns>Clause instance object</returns>
        public ITotalClause Having(String column)
        {

            having = new TotalClauseImpl(this);
            having.AddCol(column);

            return having;
        }

        /// <summary>
        /// Used to provide manually created Where clause, instead of using API's.
        /// </summary>
        /// <param name="havingClause">Where clause</param>
        /// <returns>Where instance object</returns>
        public ITotal HavingClause(String havingClause)
        {
            this.havingClause = havingClause;
            return this;
        }

        public ITotal Column(String column)
        {
            this.column = column;
            return this;
        }

        /// <summary>
        /// Used to provide name of columns only for which data will be fetched.
        /// </summary>
        /// <param name="columns">Name of columns</param>
        /// <returns>Where instance object</returns>
        public ITotal Columns(String[] columns)
        {
            this.columns = columns;
            return this;
        }

        /// <summary>
        /// Used to provide name of column for which average will be calculated.
        /// </summary>
        /// <param name="delimiter">Name of Delimiter</param>
        /// <returns>Where instance object</returns>
        public ITotal Delimiter(String delimiter)
        {
            this.delimiter = delimiter;
            return this;
        }

        /// <summary>
        /// Used to get total, this method should be called in last to calculate total.
        /// </summary>
        /// <returns>Total</returns>
        public double Execute()
        {

            String where = "";
            if (this.whereClause != null && this.whereClause.Length > 0)
            {
                where = this.whereClause;
            }
            else
            {
                if (this.where != null)
                {
                    where = this.where.ToString();
                }
            }

            String having = "";
            if (this.havingClause != null && this.havingClause.Length > 0)
            {
                having = this.havingClause;
            }
            else
            {
                if (this.having != null)
                {
                    having = this.having.ToString();
                }
            }

            if (this.columns == null)
            {
                this.columns = new String[] { };
            }

            if (this.orderBy == null)
            {
                this.orderBy = new String[] { };
            }

            if (this.groupBy == null)
            {
                this.groupBy = new String[] { };
            }

            String limit = null;
            if (this.limit != 0)
            {
                limit = this.limit.ToString();
            }


            return DatabaseHelper.Total(entityDescriptor, column, where, groupBy.ToList().GetEnumerator(), having);
        }
    }
}
