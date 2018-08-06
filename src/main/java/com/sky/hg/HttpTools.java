package com.sky.hg;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

public class HttpTools {

	private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();//��������ʹ��䳬ʱʱ��

	//��ȡ����
	public static CloseableHttpClient getHttpClient() {

		PoolingHttpClientConnectionManager manager = new PoolingHttpClientConnectionManager();
		manager.setMaxTotal(200);
		manager.setDefaultMaxPerRoute(20);
		CloseableHttpClient httpclient = HttpClients.custom().setConnectionManager(manager).build();
		return httpclient;
	}
	
	//get�����ȡ��Ϣ
	public static String get(String uri) throws Exception {
		
		String context = null;
		HttpGet httpGet = new HttpGet(uri);
		httpGet.setConfig(requestConfig);
		CloseableHttpResponse response = getHttpClient().execute(httpGet);
		if (response.getStatusLine().getStatusCode() == 200) {
			context = EntityUtils.toString(response.getEntity());
		}
		return context;
	}
}
