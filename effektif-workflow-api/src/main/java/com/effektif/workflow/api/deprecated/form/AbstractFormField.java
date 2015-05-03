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
package com.effektif.workflow.api.deprecated.form;

import com.effektif.workflow.api.types.DataType;
import com.effektif.workflow.api.workflow.Extensible;


/**
 * @author Tom Baeyens
 */
public class AbstractFormField extends Extensible {
  
  protected String id;
  
  protected String name;
  // TODO Map<String,String> nameI18n;
  
  protected DataType type;
  protected Boolean readOnly;
  protected Boolean required;

  public AbstractFormField() {
  }
  
  /** shallow copy constructor */
  public AbstractFormField(AbstractFormField other) {
    this.id = other.id;
    this.name = other.name;
    this.type = other.type;
    this.readOnly = other.readOnly;
    this.required = other.required;
  }
  
//  @Override
//  public void readJson(JsonReader r) {
//    id = r.readString("id");
//    name = r.readString("name");
//    type = r.readObject("type");
//    readOnly = r.readBoolean("readOnly");
//    required = r.readBoolean("required");
//    super.readJson(r);
//  }
//
//  @Override
//  public void writeJson(JsonWriter w) {
//    w.writeString("id", id);
//    w.writeString("name", name);
//    w.writeWritable("type", type);
//    w.writeBoolean("readOnly", readOnly);
//    w.writeBoolean("required", required);
//    super.writeJson(w);
//  }

  public String getId() {
    return this.id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public AbstractFormField id(String id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public AbstractFormField name(String name) {
    this.name = name;
    return this;
  }

  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }
  /** sets readonly to true in a fluent api style */
  public AbstractFormField readOnly() {
    this.readOnly = true;
    return this;
  }
  public boolean isReadOnly() {
    return Boolean.TRUE.equals(readOnly);
  }
  
  public Boolean getRequired() {
    return this.required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }
  /** sets required to true in a fluent api style */
  public AbstractFormField required() {
    this.required = true;
    return this;
  }
  public boolean isRequired() {
    return Boolean.TRUE.equals(required);
  }
  
  /** The type is retrieved from the variable or expression 
   * and is passed here for form rendering.  Types don't have 
   * to be specified when creating workflows. */
  public DataType getType() {
    return this.type;
  }
  /** The type is retrieved from the variable or expression 
   * and is passed here for form rendering.  Types don't have 
   * to be specified when creating workflows. */
  public void setType(DataType type) {
    this.type = type;
  }
}