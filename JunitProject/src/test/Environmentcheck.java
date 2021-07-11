package test;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class Environmentcheck implements ExecutionCondition {

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		
		
		 String env = "Custom";
	        
	        
	        if ("dev".equalsIgnoreCase(env)) {
	            return ConditionEvaluationResult
	              .disabled("Test disabled on dev environment");
	        }
	        
	        return ConditionEvaluationResult.enabled(
	          "Test enabled on QA environment");
	}
	
	

}
