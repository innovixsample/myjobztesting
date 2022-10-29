package com.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@Before
public void beforeScenari() {
System.out.println("Scenario starts.......");
}

@After
public void afterScenario() {
System.out.println("..........Scenario ends");
}
}
