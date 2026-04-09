package com.singular.sdk.internal;

import B4.g;
import com.singular.sdk.internal.Api;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.SingularParamsBase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class SingularRequestHandler {
    private static final SingularLog logger = SingularLog.getLogger("SingularRequestHandler");
    static int counter = 0;
    private static final String[] POST_PAYLOAD_PARAMS_KEYS = {Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, Constants.GLOBAL_PROPERTIES_KEY, Constants.RequestBody.INSTALL_REFERRER_KEY};

    private static String appendHash(String str, String str2) {
        if (str == null) {
            return "";
        }
        String strSha1Hash = Utils.sha1Hash("?".concat(str), str2);
        logger.debug("hash = %s", strSha1Hash);
        return Utils.isEmptyOrNull(strSha1Hash) ? str : g.o(str, "&h=", strSha1Hash);
    }

    public static HttpURLConnection buildRequest(SingularInstance singularInstance, String str, Map<String, String> map, long j4) throws JSONException, IOException {
        Map<String, String> postPayloadParams = getPostPayloadParams(map);
        String strO = g.o(str, "?", appendHash(getQueryString(singularInstance, map, j4), singularInstance.getSingularConfig().secret));
        URL url = new URL(strO);
        HttpURLConnection httpsConnection = url.getProtocol().equalsIgnoreCase("https") ? getHttpsConnection(url) : getHttpConnection(url);
        setDefaultConnectionProperties(httpsConnection);
        setPayloadForRequest(httpsConnection, postPayloadParams, singularInstance.getSingularConfig().secret);
        logger.debug("__API__ %s %s", httpsConnection.getRequestMethod(), strO);
        return httpsConnection;
    }

    public static HttpURLConnection getHttpConnection(URL url) throws IOException {
        if (url != null) {
            return (HttpURLConnection) url.openConnection();
        }
        return null;
    }

    public static HttpURLConnection getHttpsConnection(URL url) throws IOException {
        if (url == null) {
            return null;
        }
        return (HttpsURLConnection) url.openConnection();
    }

    private static Map<String, String> getPostPayloadParams(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (String str : POST_PAYLOAD_PARAMS_KEYS) {
            if (map.containsKey(str)) {
                map2.put(str, map.get(str));
                map.remove(str);
            }
        }
        return map2;
    }

    private static String getQueryString(SingularInstance singularInstance, Map<String, String> map, long j4) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            map = new HashMap<>();
        }
        TreeMap treeMap = new TreeMap(map);
        treeMap.put("rt", "json");
        treeMap.put("lag", String.valueOf(Utils.lagSince(j4)));
        treeMap.put("c", Utils.getConnectionType(singularInstance.getContext()));
        if ((!treeMap.containsKey(SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY) || Utils.isEmptyOrNull((String) treeMap.get(SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY))) && !Utils.isEmptyOrNull(singularInstance.getDeviceInfo().oaid)) {
            treeMap.put(SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY, singularInstance.getDeviceInfo().oaid);
            treeMap.put(SingularParamsBase.Constants.IDENTIFIER_KEYSPACE_KEY, SingularParamsBase.Constants.OAID_KEYSPACE_VALUE);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strEncode = URLEncoder.encode((String) entry.getKey(), Constants.ENCODING);
            String str = (String) entry.getValue();
            String strEncode2 = str != null ? URLEncoder.encode(str, Constants.ENCODING) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(strEncode);
            sb.append("=");
            sb.append(strEncode2);
        }
        return sb.toString();
    }

    public static boolean makeRequest(SingularInstance singularInstance, String str, Map<String, String> map, long j4, Api.OnApiCallback onApiCallback) throws JSONException, IOException {
        long currentTimeMillis = Utils.getCurrentTimeMillis();
        int i = counter + 1;
        counter = i;
        SingularLog singularLog = logger;
        singularLog.debug("---------------------------> /%d", Integer.valueOf(i));
        singularLog.debug("url = %s", str);
        singularLog.debug("params = %s", map);
        HttpURLConnection httpURLConnectionBuildRequest = buildRequest(singularInstance, str, map, j4);
        try {
            try {
                boolean zSendRequest = sendRequest(singularInstance, onApiCallback, currentTimeMillis, i, httpURLConnectionBuildRequest);
                if (httpURLConnectionBuildRequest != null) {
                    httpURLConnectionBuildRequest.disconnect();
                }
                return zSendRequest;
            } catch (IOException e4) {
                throw e4;
            }
        } finally {
        }
    }

    private static String readResponse(HttpURLConnection httpURLConnection) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader((httpURLConnection.getContentEncoding() == null || !httpURLConnection.getContentEncoding().equals("gzip")) ? new InputStreamReader(inputStream) : new InputStreamReader(new GZIPInputStream(inputStream)));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return stringBuffer.toString();
            }
            stringBuffer.append(line);
        }
    }

    public static boolean sendRequest(SingularInstance singularInstance, Api.OnApiCallback onApiCallback, long j4, int i, HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        String response = readResponse(httpURLConnection);
        httpURLConnection.disconnect();
        long currentTimeMillis = Utils.getCurrentTimeMillis() - j4;
        SingularLog singularLog = logger;
        singularLog.debug("%d %s", Integer.valueOf(responseCode), response);
        singularLog.debug("<--------------------------- /%d - took %dms", Integer.valueOf(i), Long.valueOf(currentTimeMillis));
        return onApiCallback.handle(singularInstance, responseCode, response);
    }

    private static void setDefaultConnectionProperties(HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("User-Agent", Constants.HTTP_USER_AGENT);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
    }

    private static void setPayloadForRequest(HttpURLConnection httpURLConnection, Map<String, String> map, String str) throws JSONException, IOException {
        if (httpURLConnection == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null && map.size() > 0) {
                String string = new JSONObject(map).toString();
                String strSha1Hash = Utils.sha1Hash(string, str);
                jSONObject.put("payload", string);
                jSONObject.put("signature", strSha1Hash);
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), Constants.ENCODING);
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.close();
        } catch (IOException | JSONException e4) {
            logger.error("Error in JSON parsing or I/O ", e4);
        }
    }
}
