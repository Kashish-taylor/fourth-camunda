package com.example.workflow.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.camunda.bpm.engine.variable.VariableMap;
import org.springframework.stereotype.Service;

@Service
public class CamundaService {
	    private ProcessInstantiationBuilder instance;
	    private ProcessInstanceWithVariables response;

	    public Object triggerProcess(String processKey, String employeeName) {

	        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
	        instance = engine.getRuntimeService().createProcessInstanceByKey(processKey);
	        instance.setVariable("employeeName", employeeName);
	        response = instance.executeWithVariablesInReturn();
	        VariableMap variables = response.getVariables();
	        return variables.get("getEmployee");
	    }
}
