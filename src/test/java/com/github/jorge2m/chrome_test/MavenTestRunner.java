package com.github.jorge2m.chrome_test;

import org.testng.annotations.Test;
import com.github.jorge2m.chrome_test.runner.TestRunner;
import com.github.jorge2m.testmaker.domain.InputParamsBasic;

public class MavenTestRunner extends InputParamsBasic {

    @Test
    public void executeTestRunner() throws Exception {
    	var args = mapSystemParametersToArgs();
        TestRunner.main(args);
    }

}
