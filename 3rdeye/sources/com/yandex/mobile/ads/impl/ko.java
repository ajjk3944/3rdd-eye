package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.SingularParamsBase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class ko {
    public static byte[] a(byte[] bArr) {
        if (s82.f32899a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(s82.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(StringUtils.COMMA);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(jSONObject2.getString(SingularParamsBase.Constants.IDENTIFIER_KEYSPACE_KEY).replace('-', '+').replace('_', '/'));
                sb.append("\",\"kid\":\"");
                sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return s82.c(sb.toString());
        } catch (JSONException e4) {
            rs0.a("ClearKeyUtil", "Failed to adjust response data: ".concat(s82.a(bArr)), e4);
            return bArr;
        }
    }
}
