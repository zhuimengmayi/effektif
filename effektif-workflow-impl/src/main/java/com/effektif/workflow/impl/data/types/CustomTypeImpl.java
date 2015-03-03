/*
 * Copyright 2014 Effektif GmbH.
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
 * limitations under the License.
 */
package com.effektif.workflow.impl.data.types;

import java.util.Map;

import com.effektif.workflow.api.Configuration;


/** idea for now.  @see custom type store
 * 
 * @author Tom Baeyens
 */
public class CustomTypeImpl extends ObjectTypeImpl<CustomType> {

  public CustomTypeImpl(Configuration configuration) {
    super(new CustomType(), Map.class, configuration);
  }
  
  public CustomTypeImpl(CustomType customType, Configuration configuration) {
    super(customType, Map.class, configuration);
  }

  protected void initializeFields(Configuration configuration) {
//    List<ObjectField> fieldsApi = typeApi.getFields();
//    if (fieldsApi!=null) {
//      for (ObjectField fieldApi: fieldsApi) {
//        ObjectFieldImpl fieldImpl = createField(configuration, valueClass, fieldApi);
//        field(fieldImpl);
//      }
//    }
  }

}
