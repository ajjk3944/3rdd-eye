package com.singular.sdk.internal;

import androidx.work.s;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.SingularParamsBase;
import java.io.IOException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class BaseApi extends SingularMap implements Api {
    static final String TIMESTAMP_KEY = "__TIMESTAMP__";
    static final String TYPE_KEY = "__TYPE__";
    private static final SingularLog logger = SingularLog.getLogger("BaseApi");

    public BaseApi(String str, long j4) {
        put(TYPE_KEY, str);
        put(TIMESTAMP_KEY, String.valueOf(j4));
    }

    public static BaseApi from(String str) throws IOException, NullPointerException {
        if (str == null) {
            throw new NullPointerException("api string cannot be null");
        }
        Map<String, String> mapFromString = fromString(str);
        String str2 = mapFromString.get(TYPE_KEY);
        String str3 = mapFromString.get(TIMESTAMP_KEY);
        long j4 = !Utils.isEmptyOrNull(str3) ? Long.parseLong(str3) : -1L;
        if (Constants.API_TYPE_EVENT.equalsIgnoreCase(str2)) {
            ApiSubmitEvent apiSubmitEvent = new ApiSubmitEvent(j4);
            apiSubmitEvent.addParams(mapFromString);
            return apiSubmitEvent;
        }
        if (Constants.API_TYPE_SESSION_START.equalsIgnoreCase(str2)) {
            ApiStartSession apiStartSession = new ApiStartSession(j4);
            apiStartSession.addParams(mapFromString);
            return apiStartSession;
        }
        if (Constants.API_TYPE_GDPR_CONSENT.equalsIgnoreCase(str2)) {
            ApiGDPRConsent apiGDPRConsent = new ApiGDPRConsent(j4);
            apiGDPRConsent.addParams(mapFromString);
            return apiGDPRConsent;
        }
        if (Constants.API_TYPE_GDPR_UNDER_13.equalsIgnoreCase(str2)) {
            ApiGDPRUnder13 apiGDPRUnder13 = new ApiGDPRUnder13(j4);
            apiGDPRUnder13.addParams(mapFromString);
            return apiGDPRUnder13;
        }
        if (!Constants.API_TYPE_CUSTOM_USER_ID.equalsIgnoreCase(str2)) {
            throw new InvalidPropertiesFormatException(s.d("Unknown type = ", str2));
        }
        ApiCustomUserId apiCustomUserId = new ApiCustomUserId(j4);
        apiCustomUserId.addParams(mapFromString);
        return apiCustomUserId;
    }

    private static Map<String, String> fromString(String str) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, (String) jSONObject.get(next));
            }
            return map;
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public void addParams(Map<String, String> map) {
        if (map == null) {
            return;
        }
        putAll(map);
    }

    public Map<String, String> getParams() {
        HashMap map = new HashMap(this);
        map.remove(TYPE_KEY);
        map.remove(TIMESTAMP_KEY);
        return map;
    }

    public long getTimestamp() {
        String str = get(TIMESTAMP_KEY);
        if (Utils.isEmptyOrNull(str)) {
            return -1L;
        }
        return Long.parseLong(str);
    }

    public String getType() {
        return get(TYPE_KEY);
    }

    public String getUrl() {
        return "https://sdk-api-v1.singular.net/api/v1" + getPath();
    }

    public boolean isAdmonEvent() {
        try {
            String str = get(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY);
            if (str != null) {
                return new JSONObject(str).getBoolean(Constants.ADMON_IS_ADMON_REVENUE);
            }
            return false;
        } catch (Throwable th) {
            logger.debug("Not an admon event: " + th.getMessage());
            return false;
        }
    }

    public boolean makeRequest(SingularInstance singularInstance) throws IOException {
        if (!getParams().get(SingularParamsBase.Constants.IDENTIFIER_KEYSPACE_KEY).equalsIgnoreCase(Constants.SDID_KEY) && singularInstance.getDeviceInfo() != null && singularInstance.getDeviceInfo().sdid.exists()) {
            putAll(new SingularParamsBase().withDeviceInfo(singularInstance.getDeviceInfo()));
        }
        return SingularRequestHandler.makeRequest(singularInstance, getUrl(), getParams(), getTimestamp(), getOnApiCallback());
    }

    public String toJsonAsString() {
        return new JSONObject(this).toString();
    }
}
