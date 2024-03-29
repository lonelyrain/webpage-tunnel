package webpagetunnel;

import com.india.arunava.console.main.ProxyRunner;
import com.india.arunava.network.httpProxy.HTTPProxyServerStarter;
import com.india.arunava.network.httpsServer.HttpsServerStarter_443;
import com.india.arunava.network.httpsServer.HttpsServerStarter_8443;

public class MainConsole {

	public MainConsole() {
		System.out.println("Running in console mode");
		runProxyServer();
	}

	private void runProxyServer() {

		System.out.println(">>> Initializing settings...");
		updateSettings();

		System.out.println(">>> Starting proxy server...");
		ProxyRunner.runServers();
		while (HTTPProxyServerStarter.started == 0
				|| HttpsServerStarter_443.started == 0
				|| HttpsServerStarter_8443.started == 0) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e1) {
			}
		}
		if (HTTPProxyServerStarter.started == 2
				|| HttpsServerStarter_443.started == 2
				|| HttpsServerStarter_8443.started == 2) {
			System.out.println(">>> Start proxy server fail, exit.");
			System.exit(1);
		}

		System.out.println(">>> Now running...");
		System.out.println(">>> Press Ctrl+C to exit. ");
	}

	private void updateSettings() {
		Common.parseFullUrl();
		Common.saveSettings();
	}

}
