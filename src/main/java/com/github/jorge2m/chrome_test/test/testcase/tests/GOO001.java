package com.github.jorge2m.chrome_test.test.testcase.tests;

import java.io.Serializable;

import com.github.jorge2m.chrome_test.test.testcase.TestBase;
import com.github.jorge2m.chrome_test.test.testcase.steps.BingSteps;
import com.github.jorge2m.chrome_test.test.testcase.steps.GoogleSteps;

public class GOO001 extends TestBase implements Serializable {
	
	private static final long serialVersionUID = 7458665307721500197L;

	private final GoogleSteps googleSteps = new GoogleSteps();
	private final BingSteps bingSteps = new BingSteps();
	
	private final String textToSearch;
	
	public GOO001(String textToSearch) {
		this.textToSearch = textToSearch;
	}
	
	@Override
	public void execute() throws Exception {
		googleSteps.goToGoogle();
		float numResultsGoogle = googleSteps.search(textToSearch);
		bingSteps.goToBing();
		float numResultsBing = bingSteps.search(textToSearch);

		googleSteps.checkMoreResulstsInGoogle(numResultsGoogle, numResultsBing);
	}
	
}
