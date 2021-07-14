package com.example.workflow.controller;

import com.example.workflow.service.CamundaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
    private CamundaService camundaService;

    @GetMapping("/process-instance/{processKey}/{employeeName}")
    public Object getCamunda(@PathVariable String processKey, @PathVariable String employeeName) {
        return camundaService.triggerProcess(processKey, employeeName);
    }
}
