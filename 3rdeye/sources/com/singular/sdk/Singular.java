package com.singular.sdk;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.SingularExceptionReporter;
import com.singular.sdk.internal.SingularGlobalProperty;
import com.singular.sdk.internal.SingularInstance;
import com.singular.sdk.internal.SingularLog;
import com.singular.sdk.internal.Utils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Singular {
    private static SingularInstance singular;
    private static final SingularLog logger = SingularLog.getLogger("Singular");
    private static boolean isInstanceAlreadyInitialized = false;
    private static Context saved_application_context = null;
    private static Boolean limitedIdentifiersEnabled = Boolean.FALSE;

    private Singular() {
    }

    public static void adRevenue(SingularAdData singularAdData) {
        try {
            if (isInitialized() && singularAdData != null && singularAdData.hasRequiredParams()) {
                eventJSON(Constants.ADMON_REVENUE_EVENT_NAME, singularAdData);
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static void clearGlobalProperties() {
        try {
            if (isInitialized()) {
                singular.clearGlobalProperties();
            }
        } catch (RuntimeException e4) {
            logger.error(Utils.formatException(e4));
        }
    }

    public static void createReferrerShortLink(String str, String str2, String str3, JSONObject jSONObject, ShortLinkHandler shortLinkHandler) {
        if (shortLinkHandler == null) {
            return;
        }
        singular.createReferrerShortLink(str, str2, str3, jSONObject, shortLinkHandler);
    }

    public static boolean customRevenue(String str, String str2, double d10, Object obj) {
        return customRevenue(str, str2, d10, obj, (Map<String, Object>) null);
    }

    public static boolean event(String str) {
        try {
            if (!isInitialized()) {
                return false;
            }
            if (!Utils.isEmptyOrNull(str)) {
                return singular.logEvent(str);
            }
            logger.error("Event name can not be null or empty");
            return false;
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
            return false;
        }
    }

    public static boolean eventJSON(String str, JSONObject jSONObject) {
        try {
            if (!isInitialized()) {
                return false;
            }
            if (!Utils.isEmptyOrNull(str)) {
                return singular.logEvent(str, jSONObject != null ? jSONObject.toString() : null);
            }
            logger.error("Event name can not be null or empty");
            return false;
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error("Exception", e4);
            return false;
        }
    }

    public static Map<String, String> getGlobalProperties() {
        try {
            if (isInitialized()) {
                return singular.getGlobalProperties();
            }
            return null;
        } catch (RuntimeException e4) {
            logger.error(Utils.formatException(e4));
            return null;
        }
    }

    public static boolean getLimitDataSharing() {
        Boolean limitDataSharing = singular.getLimitDataSharing();
        if (limitDataSharing == null) {
            return false;
        }
        return limitDataSharing.booleanValue();
    }

    public static long getSessionId() {
        try {
            if (isInitialized()) {
                return singular.getSessionId();
            }
            return -1L;
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
            return -1L;
        }
    }

    private static Object getSku(Object obj) throws Exception {
        Method declaredMethod = Utils.getDeclaredMethod(obj, "getProducts", new Class[0]);
        if (declaredMethod != null) {
            return new JSONArray(declaredMethod.invoke(obj, new Object[0]).toString());
        }
        Method declaredMethod2 = Utils.getDeclaredMethod(obj, "getSku", new Class[0]);
        if (declaredMethod2 != null) {
            return (String) declaredMethod2.invoke(obj, new Object[0]);
        }
        Method declaredMethod3 = Utils.getDeclaredMethod(obj, "getSkus", new Class[0]);
        if (declaredMethod3 != null) {
            return new JSONArray(declaredMethod3.invoke(obj, new Object[0]).toString());
        }
        return null;
    }

    public static boolean init(Context context, String str, String str2) {
        if (context == null || str == null || str2 == null) {
            return false;
        }
        return init(context, new SingularConfig(str, str2));
    }

    public static boolean isAllTrackingStopped() {
        return singular.isAllTrackingStopped();
    }

    private static boolean isInitialized() {
        if (singular != null) {
            return true;
        }
        logger.error("Singular not initialized. You must call Singular.init() ");
        return false;
    }

    public static void limitDataSharing(boolean z10) {
        singular.limitDataSharing(z10);
    }

    public static void onActivityPaused() {
        try {
            if (isInitialized()) {
                singular.onActivityPaused(Utils.getCurrentTimeMillis());
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static void onActivityResumed() {
        try {
            if (isInitialized()) {
                singular.onActivityResumed(Utils.getCurrentTimeMillis());
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    private static void reportException(Throwable th) {
        try {
            SingularExceptionReporter.getReporter(saved_application_context, limitedIdentifiersEnabled).reportException(th);
        } catch (RuntimeException unused) {
        }
    }

    public static void resumeAllTracking() {
        singular.resumeAllTracking();
    }

    public static boolean revenue(String str, double d10, Object obj) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d10, obj);
    }

    public static void setCustomUserId(String str) {
        try {
            if (isInitialized()) {
                singular.saveCustomUserId(str);
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static void setDeviceCustomUserId(String str) {
        try {
            if (isInitialized()) {
                setCustomUserId(str);
                singular.logSetDeviceCustomUserId();
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static void setFCMDeviceToken(String str) {
        try {
            if (isInitialized()) {
                singular.saveFCMDeviceToken(str);
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static void setGCMDeviceToken(String str) {
        try {
            if (isInitialized()) {
                singular.saveGCMDeviceToken(str);
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static boolean setGlobalProperty(String str, String str2, boolean z10) {
        if (Utils.isEmptyOrNull(str)) {
            return false;
        }
        try {
            if (isInitialized()) {
                return singular.setGlobalProperty(new SingularGlobalProperty(str, str2, z10));
            }
        } catch (RuntimeException e4) {
            logger.error(Utils.formatException(e4));
        }
        return false;
    }

    public static void setIMEI(String str) {
        try {
            if (isInitialized()) {
                singular.setIMEI(str);
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static void setWrapperNameAndVersion(String str, String str2) {
        try {
            Utils.setWrapperNameAndVersion(str, str2);
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static void stopAllTracking() {
        singular.stopAllTracking();
    }

    public static void trackingOptIn() {
        singular.sendTrackingOptIn();
    }

    public static void trackingUnder13() {
        singular.sendTrackingUnder13();
    }

    public static void unsetCustomUserId() {
        try {
            if (isInitialized()) {
                singular.saveCustomUserId("");
            }
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
        }
    }

    public static void unsetGlobalProperty(String str) {
        if (Utils.isEmptyOrNull(str)) {
            return;
        }
        try {
            if (isInitialized()) {
                singular.removeGlobalProperty(str);
            }
        } catch (RuntimeException e4) {
            logger.error(Utils.formatException(e4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Class] */
    public static boolean customRevenue(String str, String str2, double d10, Object obj, Map<String, Object> map) {
        String str3;
        ?? r14;
        Object sku;
        String str4;
        String str5;
        String str6;
        String str7;
        char c10;
        if (obj != null && obj.getClass().getName().equals("com.android.billingclient.api.Purchase")) {
            try {
                r14 = obj.getClass();
                sku = getSku(obj);
                str4 = (String) r14.getDeclaredMethod("getOriginalJson", new Class[0]).invoke(obj, new Object[0]);
                str5 = (String) r14.getDeclaredMethod("getSignature", new Class[0]).invoke(obj, new Object[0]);
            } catch (Throwable th) {
                th = th;
                r14 = str;
            }
            try {
                if (map != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(map);
                        jSONObject.put(Constants.REVENUE_CURRENCY_KEY, str2);
                        jSONObject.put(Constants.REVENUE_AMOUNT_KEY, d10);
                        jSONObject.put(Constants.IS_REVENUE_EVENT_KEY, true);
                        jSONObject.put(Constants.REVENUE_RECEIPT_KEY, str4);
                        jSONObject.put(Constants.REVENUE_RECEIPT_SIGNATURE, str5);
                        str7 = Constants.REVENUE_PRODUCT_SKU_KEY;
                        try {
                            jSONObject.put(str7, sku);
                            str6 = str;
                        } catch (JSONException e4) {
                            e = e4;
                            str6 = str;
                        }
                        try {
                            return eventJSON(str6, jSONObject);
                        } catch (JSONException e10) {
                            e = e10;
                            c10 = 0;
                            logger.error(Utils.formatException(e));
                            Double dValueOf = Double.valueOf(d10);
                            Object[] objArr = new Object[12];
                            objArr[c10] = Constants.REVENUE_CURRENCY_KEY;
                            objArr[1] = str2;
                            objArr[2] = Constants.REVENUE_AMOUNT_KEY;
                            objArr[3] = dValueOf;
                            objArr[4] = str7;
                            objArr[5] = sku;
                            objArr[6] = Constants.REVENUE_RECEIPT_KEY;
                            objArr[7] = str4;
                            objArr[8] = Constants.REVENUE_RECEIPT_SIGNATURE;
                            objArr[9] = str5;
                            objArr[10] = Constants.IS_REVENUE_EVENT_KEY;
                            objArr[11] = Boolean.TRUE;
                            return event(str6, objArr);
                        }
                    } catch (JSONException e11) {
                        e = e11;
                        str6 = str;
                        str7 = Constants.REVENUE_PRODUCT_SKU_KEY;
                    }
                } else {
                    str6 = str;
                    str7 = Constants.REVENUE_PRODUCT_SKU_KEY;
                    c10 = 0;
                }
                Double dValueOf2 = Double.valueOf(d10);
                Object[] objArr2 = new Object[12];
                objArr2[c10] = Constants.REVENUE_CURRENCY_KEY;
                objArr2[1] = str2;
                objArr2[2] = Constants.REVENUE_AMOUNT_KEY;
                objArr2[3] = dValueOf2;
                objArr2[4] = str7;
                objArr2[5] = sku;
                objArr2[6] = Constants.REVENUE_RECEIPT_KEY;
                objArr2[7] = str4;
                objArr2[8] = Constants.REVENUE_RECEIPT_SIGNATURE;
                objArr2[9] = str5;
                objArr2[10] = Constants.IS_REVENUE_EVENT_KEY;
                objArr2[11] = Boolean.TRUE;
                return event(str6, objArr2);
            } catch (Throwable th2) {
                th = th2;
                logger.error("customRevenue has encountered an unexpected exception. Please verify that the 'purchase' object is of type 'com.android.billingclient.api.Purchase'", th);
                str3 = r14;
                return customRevenue(str3, str2, d10, map);
            }
        }
        str3 = str;
        return customRevenue(str3, str2, d10, map);
    }

    public static boolean init(Context context, SingularConfig singularConfig) {
        if (context == null || singularConfig == null) {
            return false;
        }
        try {
            isInstanceAlreadyInitialized = singular != null;
            SingularInstance singularInstance = SingularInstance.getInstance(context, singularConfig);
            singular = singularInstance;
            if (isInstanceAlreadyInitialized) {
                singularInstance.startSessionIfOpenedWithDeeplink();
            }
            saved_application_context = context.getApplicationContext();
            limitedIdentifiersEnabled = singularConfig.limitedIdentifiresEnabled;
        } catch (IOException e4) {
            SingularLog singularLog = logger;
            singularLog.debug("Failed to init() Singular SDK");
            singularLog.error(Utils.formatException(e4));
            singular = null;
        } catch (RuntimeException e10) {
            reportException(e10);
            logger.error(Utils.formatException(e10));
        }
        return isInitialized();
    }

    public static boolean revenue(String str, double d10, Object obj, Map<String, Object> map) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d10, obj, map);
    }

    public static boolean revenue(String str, double d10) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d10);
    }

    public static boolean revenue(String str, double d10, Map<String, Object> map) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d10, map);
    }

    public static boolean revenue(String str, double d10, String str2, String str3) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d10, str2, str3);
    }

    public static boolean revenue(String str, double d10, String str2, String str3, String str4, int i, double d11) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d10, str2, str3, str4, i, d11);
    }

    public static boolean event(String str, String str2) {
        try {
            if (!isInitialized()) {
                return false;
            }
            if (Utils.isEmptyOrNull(str)) {
                logger.error("Event name can not be null or empty");
                return false;
            }
            return singular.logEvent(str, str2);
        } catch (RuntimeException e4) {
            reportException(e4);
            logger.error(Utils.formatException(e4));
            return false;
        }
    }

    public static boolean revenue(JSONObject jSONObject) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, jSONObject);
    }

    public static boolean event(String str, Object... objArr) throws JSONException {
        try {
            if (!isInitialized()) {
                return false;
            }
            if (Utils.isEmptyOrNull(str)) {
                logger.error("Event name can not be null or empty");
                return false;
            }
            if (objArr.length % 2 != 0) {
                logger.error("Extra arguments must be in even numbers.");
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < objArr.length; i += 2) {
                    jSONObject.put((String) objArr[i], objArr[i + 1]);
                }
                return eventJSON(str, jSONObject);
            } catch (JSONException e4) {
                logger.error("error in serializing extra args", e4);
                return false;
            }
        } catch (RuntimeException e10) {
            reportException(e10);
            logger.error("Exception", e10);
        }
    }

    public static boolean customRevenue(String str, String str2, double d10) {
        return event(str, Constants.REVENUE_CURRENCY_KEY, str2, Constants.REVENUE_AMOUNT_KEY, Double.valueOf(d10), Constants.IS_REVENUE_EVENT_KEY, Boolean.TRUE);
    }

    public static boolean customRevenue(String str, String str2, double d10, Map<String, Object> map) throws JSONException {
        if (map != null) {
            try {
                JSONObject jSONObject = new JSONObject(map);
                jSONObject.put(Constants.REVENUE_CURRENCY_KEY, str2);
                jSONObject.put(Constants.REVENUE_AMOUNT_KEY, d10);
                jSONObject.put(Constants.IS_REVENUE_EVENT_KEY, true);
                return eventJSON(str, jSONObject);
            } catch (JSONException e4) {
                logger.error(Utils.formatException(e4));
            }
        }
        return customRevenue(str, str2, d10);
    }

    public static boolean customRevenue(String str, String str2, double d10, String str3, String str4) {
        return event(str, Constants.REVENUE_CURRENCY_KEY, str2, Constants.REVENUE_AMOUNT_KEY, Double.valueOf(d10), Constants.REVENUE_RECEIPT_KEY, str3, Constants.REVENUE_RECEIPT_SIGNATURE, str4, Constants.IS_REVENUE_EVENT_KEY, Boolean.TRUE);
    }

    public static boolean customRevenue(String str, String str2, double d10, String str3, String str4, String str5, int i, double d11) {
        return event(str, Constants.REVENUE_CURRENCY_KEY, str2, Constants.REVENUE_AMOUNT_KEY, Double.valueOf(d10), Constants.REVENUE_PRODUCT_SKU_KEY, str3, Constants.REVENUE_PRODUCT_NAME_KEY, str4, Constants.REVENUE_PRODUCT_CATEGORY_KEY, str5, Constants.REVENUE_PRODUCT_QUANTITY_KEY, Integer.valueOf(i), Constants.REVENUE_PRODUCT_PRICE_KEY, Double.valueOf(d11), Constants.IS_REVENUE_EVENT_KEY, Boolean.TRUE);
    }

    public static boolean customRevenue(String str, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(Constants.IS_REVENUE_EVENT_KEY, true);
        } catch (JSONException e4) {
            logger.error(Utils.formatException(e4));
        }
        return eventJSON(str, jSONObject);
    }
}
