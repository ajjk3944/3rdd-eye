package com.yandex.mobile.ads.impl;

import com.applovin.sdk.AppLovinEventParameters;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lp1 {
    public static ae a(ip1.b reportType, Map reportData, String str, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        try {
            int iOrdinal = reportType.ordinal();
            if (iOrdinal == 0) {
                return new ae(be.f25244e, c(str, reportData));
            }
            if (iOrdinal == 4) {
                return new ae(be.f25243d, a(str, reportData));
            }
            if (iOrdinal == 8) {
                return new ae(be.f25242c, a(reportData));
            }
            if (iOrdinal == 21) {
                return new ae(be.f25245f, a(reportData, c4108f4, str));
            }
            if (iOrdinal == 26) {
                return new ae(be.f25246g, b(str, reportData));
            }
            if (iOrdinal != 37) {
                return null;
            }
            return new ae(be.f25247h, d(str, reportData));
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    private static JSONObject b(String str, Map map) throws JSONException {
        Object lowerCase;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get(Constants.ADMON_AD_TYPE);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(Constants.ADMON_AD_TYPE, obj);
        Object obj2 = map.get("block_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        Object obj4 = map.get("ad_id");
        if (obj4 != null) {
            jSONObject.put("banner_id", obj4);
        }
        return jSONObject;
    }

    private static JSONObject c(String str, Map map) throws JSONException {
        Object lowerCase;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get(Constants.ADMON_AD_TYPE);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(Constants.ADMON_AD_TYPE, obj);
        Object obj2 = map.get("block_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        Object obj4 = map.get("ad_id");
        if (obj4 != null) {
            jSONObject.put("banner_id", obj4);
        }
        return jSONObject;
    }

    private static JSONObject d(String str, Map map) throws JSONException {
        Object lowerCase;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get(Constants.ADMON_AD_TYPE);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(Constants.ADMON_AD_TYPE, obj);
        Object obj2 = map.get("block_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        return jSONObject;
    }

    private static JSONObject a(String str, Map map) throws JSONException {
        Object lowerCase;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get(Constants.ADMON_AD_TYPE);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(Constants.ADMON_AD_TYPE, obj);
        Object obj2 = map.get("block_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        return jSONObject;
    }

    private static JSONObject a(Map map, C4108f4 c4108f4, String str) throws JSONException {
        Object lowerCase;
        Object objOptString;
        Object objOptString2;
        Object objOptString3;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get(Constants.ADMON_AD_TYPE);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(Constants.ADMON_AD_TYPE, obj);
        Object obj2 = map.get("block_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        Object obj4 = map.get("ad_id");
        if (obj4 != null) {
            jSONObject.put("banner_id", obj4);
        }
        JSONObject jSONObject2 = null;
        String strC = c4108f4 != null ? c4108f4.c() : null;
        if (strC != null) {
            try {
                jSONObject2 = new JSONObject(strC);
            } catch (Throwable unused) {
                int i = fp0.f27419b;
            }
        }
        if (jSONObject2 == null || (objOptString = jSONObject2.optString("revenue")) == null) {
            objOptString = JSONObject.NULL;
        }
        jSONObject.put(Constants.ADMON_REVENUE, objOptString);
        if (jSONObject2 == null || (objOptString2 = jSONObject2.optString(AppLovinEventParameters.REVENUE_CURRENCY)) == null) {
            objOptString2 = JSONObject.NULL;
        }
        jSONObject.put(AppLovinEventParameters.REVENUE_CURRENCY, objOptString2);
        if (jSONObject2 == null || (objOptString3 = jSONObject2.optString("precision")) == null) {
            objOptString3 = JSONObject.NULL;
        }
        jSONObject.put("precision", objOptString3);
        return jSONObject;
    }

    private static JSONObject a(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get(Constants.ADMON_AD_TYPE);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(Constants.ADMON_AD_TYPE, obj);
        Object obj2 = map.get("block_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        return jSONObject;
    }
}
