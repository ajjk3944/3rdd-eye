package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class pd {
    private static final Map<String, pd> vt = new HashMap();
    public SharedPreferences ouw;

    private pd(String str, Context context) {
        if (context != null) {
            this.ouw = context.getSharedPreferences(str, 0);
        }
    }

    public static pd ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, pd> map = vt;
        pd pdVar = map.get(str);
        if (pdVar != null) {
            return pdVar;
        }
        synchronized (pd.class) {
            if (pdVar == null) {
                try {
                    pdVar = new pd(str, com.bytedance.sdk.openadsdk.core.zih.ouw());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map.put(str, pdVar);
        }
        return pdVar;
    }

    public final String ouw(String str, String str2) {
        try {
            return this.ouw.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
