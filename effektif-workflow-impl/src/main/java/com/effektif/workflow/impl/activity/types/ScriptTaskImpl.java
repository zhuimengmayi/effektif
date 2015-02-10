/* Copyright 2014 Effektif GmbH.
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
package com.effektif.workflow.impl.activity.types;

import java.util.Map;

import com.effektif.workflow.api.activities.ScriptTask;
import com.effektif.workflow.impl.WorkflowParser;
import com.effektif.workflow.impl.activity.AbstractActivityType;
import com.effektif.workflow.impl.script.ScriptImpl;
import com.effektif.workflow.impl.script.ScriptService;
import com.effektif.workflow.impl.workflow.ActivityImpl;
import com.effektif.workflow.impl.workflowinstance.ActivityInstanceImpl;


public class ScriptTaskImpl extends AbstractActivityType<ScriptTask> {

  protected ScriptService scriptService;
  public Map<String, String> mappings;
  public ScriptImpl script;
  
  public ScriptTaskImpl() {
    super(ScriptTask.class);
  }

  @Override
  public void parse(ActivityImpl activityImpl, ScriptTask scriptTask, WorkflowParser parser) {
    super.parse(activityImpl, scriptTask, parser);
    this.scriptService = parser.getConfiguration(ScriptService.class);
    this.script = scriptService.compile(scriptTask.getScript(), parser);
  }

  @Override
  public void execute(ActivityInstanceImpl activityInstance) {
    if (script!=null) {
      script.evaluate(activityInstance);
    }
    activityInstance.onwards();
  }
  
  @Override
  public boolean isAsync(ActivityInstanceImpl activityInstance) {
    return true;
  }
}