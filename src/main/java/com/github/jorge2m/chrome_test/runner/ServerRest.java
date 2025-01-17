package com.github.jorge2m.chrome_test.runner;

import com.github.jorge2m.chrome_test.runner.datamaker.Apps;
import com.github.jorge2m.chrome_test.runner.datamaker.Suites;
import com.github.jorge2m.testmaker.boundary.access.ServerCmdLine;
import com.github.jorge2m.testmaker.boundary.access.ServerCmdLine.ResultCmdServer;
import com.github.jorge2m.testmaker.restcontroller.ServerRestTM;

public class ServerRest {

	public static void main(String[] args) throws Exception {
		ResultCmdServer result = ServerCmdLine.parse(args);
		if (result!=null && result.isOk()) {
			var serverRest = new ServerRestTM.Builder(
					new CreatorSuiteRunTestGoogle(), Suites.class, Apps.class)
				.setWithParams(result)
				.build();
			serverRest.start();
		}
	}
}
