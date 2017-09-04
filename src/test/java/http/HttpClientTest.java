package http;

import constants.Constants;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertTrue;

public class HttpClientTest {

	@Test
	public void testGetMethod() throws Exception {
		HttpClient client = new HttpClient();
		String ans = client.makeGetRequest("https://freegeoip.net/json/");
		assertTrue(ans.length() > 0);
	}

	@Test
	public void testPutMethod() throws Exception {
		HttpClient client = new HttpClient();
		String data = "{\n" +
				"    \"dragon\": {\n" +
				"        \"scaleThickness\": 10,\n" +
				"        \"clawSharpness\": 5,\n" +
				"        \"wingStrength\": 4,\n" +
				"        \"fireBreath\": 1\n" +
				"    }\n" +
				"}";
		String ans = client.makePostRequest(Constants.getGameSolutionUrl(483159), data);
		assertTrue(ans.length() > 0);
	}
}