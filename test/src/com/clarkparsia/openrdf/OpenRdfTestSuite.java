/*
 * Copyright (c) 2009-2012 Clark & Parsia, LLC. <http://www.clarkparsia.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clarkparsia.openrdf;

import com.clarkparsia.openrdf.query.sparql.TestQueryUtils;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import com.clarkparsia.openrdf.query.sparql.TestRendering;
import com.clarkparsia.openrdf.rio.jsonld.TestJSONLD;

/**
 * <p>Master test suite</p>
 *
 * @author Michael Grove
 * @since	0.4
 * @version	0.9
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestGraphs.class, TestExtRepository.class, TestRendering.class, TestJSONLD.class, TestQueryUtils.class,
					  TestImmutableGraph.class, TestSetGraph.class, TestContextAware.class, ConstrainedGraphTests.class,
					  TestExtGraph.class, FunctionalGraphTests.class, IOGraphTests.class })
public class OpenRdfTestSuite {

}
