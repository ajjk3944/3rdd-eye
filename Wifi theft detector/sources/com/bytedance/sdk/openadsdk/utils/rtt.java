package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class rtt {
    private static final Map<String, rtt> emc = new HashMap();
    private SharedPreferences ypw;

    private rtt(String str, Context context) {
        if (context != null) {
            this.ypw = context.getSharedPreferences(str, 0);
        }
    }

    public static rtt emc(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, rtt> map = emc;
        rtt rttVar = map.get(str);
        if (rttVar != null) {
            return rttVar;
        }
        synchronized (rtt.class) {
            if (rttVar == null) {
                try {
                    rttVar = new rtt(str, com.bytedance.sdk.openadsdk.core.aa.emc());
                } catch (Throwable th) {
                    throw th;
                }
            }
            map.put(str, rttVar);
        }
        return rttVar;
    }

    public String emc(String str, String str2) {
        try {
            return this.ypw.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void emc(String str) {
        try {
            this.ypw.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
