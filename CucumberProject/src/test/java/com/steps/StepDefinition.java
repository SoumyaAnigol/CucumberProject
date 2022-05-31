package com.steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	int a,b,c;
	@Given("{int} and {int}")
	public void and(Integer int1, Integer int2) {
	    a=int1;
	    b=int2;
	}

	@When("i add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
	   c= a+b+10;
	}

	@Then("validate result should be {int}")
	public void validate_result_should_be(Integer res) {
	    Assert.assertEquals(c, res);
	}


}
