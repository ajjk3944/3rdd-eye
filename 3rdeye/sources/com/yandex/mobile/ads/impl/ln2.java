package com.yandex.mobile.ads.impl;

import android.os.Build;
import com.singular.sdk.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ln2 {
    public static JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        vn2.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        vn2.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        vn2.a(jSONObject, "os", Constants.PLATFORM);
        return jSONObject;
    }
}
