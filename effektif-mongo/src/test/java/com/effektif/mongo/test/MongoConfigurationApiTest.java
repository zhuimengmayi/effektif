/* Copyright (c) 2014, Effektif GmbH.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */
package com.effektif.mongo.test;

import org.junit.Test;

import com.effektif.mongo.MongoConfiguration;
import com.effektif.workflow.api.Configuration;


/**
 * @author Tom Baeyens
 */
public class MongoConfigurationApiTest {

  @SuppressWarnings("unused")
  @Test
  public void testMongoConfigurationApi() {
    // this is used to copy and paste into the wiki docs
    Configuration configuration = new MongoConfiguration()
      .server("localhost") // localhost is the default
      .databaseName("databasename")
      .authentication("username", "password", "database");
    configuration.start();
  }
}
