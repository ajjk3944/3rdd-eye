package com.bytedance.adsdk.ugeno.lh;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fkw;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static String ouw(String str, JSONObject jSONObject) {
        ouw ouwVar;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (ouwVar = fkw.ouw().yu) != null) {
                    return (String) ouwVar.ouw(str.substring(2, str.length() - 1)).ouw(jSONObject);
                }
                return str;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return str;
    }
}
