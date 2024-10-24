package com.github.jorge2m.chrome_test.test.suite;

import java.util.HashMap;

import com.github.jorge2m.chrome_test.test.factory.SearchFactory;
import com.github.jorge2m.testmaker.domain.InputParamsTM;
import com.github.jorge2m.testmaker.domain.SuiteMaker;
import com.github.jorge2m.testmaker.domain.TestRunMaker;

public class FactorySuite extends SuiteMaker {

	public FactorySuite(InputParamsTM params) {
		super(params);
		setParameters(new HashMap<>());
		var testRun = TestRunMaker.from(params.getSuiteName(), SearchFactory.class);
		addTestRun(testRun);
		setThreadCount(3);
	}
}
