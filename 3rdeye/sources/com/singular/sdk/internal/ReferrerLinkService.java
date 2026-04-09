package com.singular.sdk.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.singular.sdk.ShortLinkHandler;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ReferrerLinkService {
    private static final SingularLog logger = SingularLog.getLogger("ReferrerLinkService");
    private static String REFERRER_BASE_URL = "https://sdk-api-v1.singular.net/api/v1/shorten_link";

    private static String appendParamToUrl(String str, String str2, String str3) {
        try {
            if (str.contains("?")) {
                return str + "&" + str2 + "=" + URLEncoder.encode(str3, Constants.ENCODING);
            }
            return str + "?" + str2 + "=" + URLEncoder.encode(str3, Constants.ENCODING);
        } catch (UnsupportedEncodingException e4) {
            logger.debug("Error in encoding ", e4);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection buildRequest(String str, Map<String, String> map) throws Exception {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setRequestProperty("User-Agent", Constants.HTTP_USER_AGENT);
        httpsURLConnection.setRequestProperty("Content-Type", "application/json");
        httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        JSONObject jSONObject = new JSONObject(map);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream(), Constants.ENCODING);
        outputStreamWriter.write(jSONObject.toString());
        outputStreamWriter.close();
        return httpsURLConnection;
    }

    public static void sendReferrerRequest(String str, final ShortLinkHandler shortLinkHandler) {
        try {
            String str2 = "?a=" + SingularInstance.getInstance().getSingularConfig().apiKey;
            final String str3 = REFERRER_BASE_URL + (str2 + "&h=" + Utils.sha1Hash(str2, SingularInstance.getInstance().getSingularConfig().secret));
            final HashMap map = new HashMap();
            map.put(Constants.REFERRER_LINK_REQ_BODY_KEY, str);
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.ReferrerLinkService.1
                @Override // java.lang.Runnable
                public void run() {
                    HttpURLConnection httpURLConnectionBuildRequest = null;
                    try {
                        httpURLConnectionBuildRequest = ReferrerLinkService.buildRequest(str3, map);
                        httpURLConnectionBuildRequest.connect();
                        int responseCode = httpURLConnectionBuildRequest.getResponseCode();
                        if (responseCode == 200) {
                            StringBuffer stringBuffer = new StringBuffer();
                            InputStream inputStream = httpURLConnectionBuildRequest.getInputStream();
                            BufferedReader bufferedReader = new BufferedReader((httpURLConnectionBuildRequest.getContentEncoding() == null || !httpURLConnectionBuildRequest.getContentEncoding().equals("gzip")) ? new InputStreamReader(inputStream) : new InputStreamReader(new GZIPInputStream(inputStream)));
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    stringBuffer.append(line);
                                }
                            }
                            shortLinkHandler.onSuccess(new JSONObject(stringBuffer.toString()).getString(Constants.REFERRER_LINK_RES_BODY_KEY));
                        } else {
                            shortLinkHandler.onError("Error sending request: error code - " + responseCode);
                        }
                    } catch (Throwable th) {
                        shortLinkHandler.onError("Error sending request");
                        ReferrerLinkService.logger.debug("Error in I/O ", th);
                    }
                    if (httpURLConnectionBuildRequest != null) {
                        httpURLConnectionBuildRequest.disconnect();
                    }
                }
            });
        } catch (Throwable th) {
            logger.debug("Error: ", th.getMessage());
            shortLinkHandler.onError("Error sending request");
        }
    }

    public static String unifyParamsToUrl(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
        if (str2 != null) {
            jSONObject2.put(Constants.REFERRER_LINK_REQ_BODY_URL_QUERY_PARAM_KEY_REF_NAME, str2);
            str = appendParamToUrl(str, Constants.REFERRER_LINK_REQ_BODY_URL_QUERY_PARAM_KEY_REF_NAME, str2);
        }
        if (str3 != null) {
            jSONObject2.put(Constants.REFERRER_LINK_REQ_BODY_URL_QUERY_PARAM_KEY_REF_ID, str3);
            str = appendParamToUrl(str, Constants.REFERRER_LINK_REQ_BODY_URL_QUERY_PARAM_KEY_REF_ID, str3);
        }
        String string = jSONObject2.toString();
        return string.length() > 0 ? appendParamToUrl(str, Constants.QUERY_DEEPLINK_PASSTHROUGH, string) : str;
    }

    public static boolean validateRequest(String str, String str2, String str3, JSONObject jSONObject) {
        try {
            URL url = new URL(str);
            if (url.getProtocol() == null || url.getProtocol().trim().equals("") || url.getHost() == null || url.getHost().trim().equals("")) {
                logger.debug("ReferrerLinksService - Invalid url foramt: " + str);
                return false;
            }
            if (str2 != null && str2.length() > 256) {
                logger.debug("ReferrerLinksService - refName exceeds size");
                return false;
            }
            if (str3 == null || str3.length() <= 256) {
                return true;
            }
            logger.debug("ReferrerLinksService - refId exceeds size");
            return false;
        } catch (MalformedURLException e4) {
            logger.error("Error in forming URL ", e4);
            return false;
        }
    }
}
