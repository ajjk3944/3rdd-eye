package com.singular.sdk.internal;

import B4.g;
import N7.G8;
import android.net.Uri;
import com.singular.sdk.internal.GeneralHttpServiceBase;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class GeneralHttpService extends GeneralHttpServiceBase {
    private static final String BASE_URL = "https://sdk-api-v1.singular.net/api/v1";
    private final SingularLog logger;

    public GeneralHttpService() {
        super("https://sdk-api-v1.singular.net/api/v1");
        this.logger = SingularLog.getLogger("GeneralHttpService");
    }

    private HttpURLConnection buildRequest(String str, Map<String, String> map) {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestProperty("User-Agent", Constants.HTTP_USER_AGENT);
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            try {
                JSONObject jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream(), Constants.ENCODING);
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.close();
                return httpsURLConnection;
            } catch (Throwable th) {
                this.logger.error("Error in JSON Serialization ", th);
                this.logger.error(Utils.formatException(th));
                return null;
            }
        } catch (Throwable th2) {
            this.logger.error(Utils.formatException(th2));
            return null;
        }
    }

    @Override // com.singular.sdk.internal.GeneralHttpServiceBase
    public void sendRequest(final String str, final Map<String, String> map, final Map<String, String> map2, final GeneralHttpServiceBase.CompletionHandler completionHandler) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.GeneralHttpService.1
            @Override // java.lang.Runnable
            public void run() {
                GeneralHttpService.this.sendSynchronousRequest(str, map, map2, completionHandler);
            }
        });
    }

    public void sendSynchronousRequest(String str, Map<String, String> map, Map<String, String> map2, GeneralHttpServiceBase.CompletionHandler completionHandler) {
        HttpURLConnection httpURLConnectionBuildRequest;
        String string = "?a=" + SingularInstance.getInstance().getSingularConfig().apiKey;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                StringBuilder sbV = G8.v(string, "&");
                sbV.append(Uri.encode(entry.getKey()));
                sbV.append("=");
                sbV.append(Uri.encode(entry.getValue()));
                string = sbV.toString();
            }
        }
        try {
            httpURLConnectionBuildRequest = buildRequest(getBaseUrl() + str + g.o(string, "&h=", Utils.sha1Hash(string, SingularInstance.getInstance().getSingularConfig().secret)), map2);
            try {
                if (httpURLConnectionBuildRequest == null) {
                    completionHandler.onFailure("Error sending request: connection is null");
                    this.logger.error("Error sending request: connection is null");
                    if (httpURLConnectionBuildRequest != null) {
                        return;
                    } else {
                        return;
                    }
                }
                httpURLConnectionBuildRequest.connect();
                int responseCode = httpURLConnectionBuildRequest.getResponseCode();
                StringBuffer stringBuffer = new StringBuffer();
                InputStream inputStream = httpURLConnectionBuildRequest.getInputStream();
                BufferedReader bufferedReader = new BufferedReader((httpURLConnectionBuildRequest.getContentEncoding() == null || !httpURLConnectionBuildRequest.getContentEncoding().equals("gzip")) ? new InputStreamReader(inputStream) : new InputStreamReader(new GZIPInputStream(inputStream)));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        completionHandler.onSuccess(stringBuffer.toString(), responseCode);
                        httpURLConnectionBuildRequest.disconnect();
                        return;
                    }
                    stringBuffer.append(line);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    completionHandler.onFailure("Error sending request: message - " + th.getMessage());
                    this.logger.error(Utils.formatException(th));
                    if (httpURLConnectionBuildRequest != null) {
                        httpURLConnectionBuildRequest.disconnect();
                    }
                } finally {
                    if (httpURLConnectionBuildRequest != null) {
                        httpURLConnectionBuildRequest.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionBuildRequest = null;
        }
    }
}
