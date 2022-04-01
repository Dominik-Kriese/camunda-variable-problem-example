package org.camunda.bpm.getstarted.loanapproval.del;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CreateVariablesDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        var numberOfVariables = 1500;
        var numberOfProcesses = 400;

        List<String> instances = new ArrayList<>();
        for (int i = 0; i < numberOfProcesses; i++) {
            instances.add("" + i);
        }
        delegateExecution.setVariable("instances", instances);
        for (int i = 0; i < numberOfVariables; i++) {
            delegateExecution.setVariable("var" + i, "val" + i);
        }
    }
}
