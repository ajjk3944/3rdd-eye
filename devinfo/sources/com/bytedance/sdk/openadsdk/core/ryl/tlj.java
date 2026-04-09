package com.bytedance.sdk.openadsdk.core.ryl;

import android.text.TextUtils;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj {

    /* renamed from: lh, reason: collision with root package name */
    final String f8421lh;
    final String ouw;
    final URL vt;
    private final String yu;

    private tlj(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.ouw = str2;
        this.vt = new URL(str);
        this.f8421lh = str3;
        this.yu = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlj)) {
            return false;
        }
        tlj tljVar = (tlj) obj;
        if (Objects.equals(this.ouw, tljVar.ouw) && Objects.equals(this.vt, tljVar.vt) && Objects.equals(this.f8421lh, tljVar.f8421lh)) {
            return Objects.equals(this.yu, tljVar.yu);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.ouw;
        int iHashCode = (this.vt.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.f8421lh;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.yu;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final JSONObject ouw() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", "omid");
            jSONObject.put("javascriptResourceUrl", this.vt.toString());
            if (!TextUtils.isEmpty(this.ouw)) {
                jSONObject.put("vendorKey", this.ouw);
            }
            if (!TextUtils.isEmpty(this.f8421lh)) {
                jSONObject.put("verificationParameters", this.f8421lh);
            }
            if (!TextUtils.isEmpty(this.yu)) {
                jSONObject.put("verificationNotExecuted", this.yu);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static tlj ouw(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new tlj(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static tlj ouw(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if ("omid".equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new tlj(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<tlj> ouw(JSONArray jSONArray) {
        HashSet<tlj> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                try {
                    hashSet.add(ouw(jSONArray.getJSONObject(i4)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
