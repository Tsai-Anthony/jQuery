package ui_stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverManager;
import utilities.PageManager;

public class Hooks {

	@Before("@UI or @ui")
	public void setup() {
		DriverManager.getInstance();
		PageManager.getInstance();
	}

	@After("@UI or @ui")
	public void cleanup() {
		DriverManager.teardown();
		PageManager.cleanup();
	}

}