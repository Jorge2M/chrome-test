package com.github.jorge2m.chrome_test.test.suite;

import java.util.Arrays;
import java.util.HashMap;

import com.github.jorge2m.chrome_test.test.testcase.tests.Search;
import com.github.jorge2m.testmaker.domain.InputParamsTM;
import com.github.jorge2m.testmaker.domain.SuiteMaker;
import com.github.jorge2m.testmaker.domain.TestRunMaker;

public class SmokeTestSuite extends SuiteMaker {

	public SmokeTestSuite(InputParamsTM iParams) {
		super(iParams);
		setParameters(new HashMap<>());
		var testRun = TestRunMaker.from(
				iParams.getSuiteName(), 
				Arrays.asList(Search.class));
		
		addTestRun(testRun);
		setThreadCount(3);
	}
}
