package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private a f8375a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f8376b;

    /* renamed from: c, reason: collision with root package name */
    private String f8377c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private w7() {
    }

    public static w7 a(p8 p8Var, w7 w7Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (w7Var == null) {
            try {
                w7Var = new w7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                kVar.D().a("VastNonVideoResource", th);
                return null;
            }
        }
        if (w7Var.f8376b == null && !StringUtils.isValidString(w7Var.f8377c)) {
            String strA = a(p8Var, "StaticResource");
            if (URLUtil.isValidUrl(strA)) {
                w7Var.f8376b = Uri.parse(strA);
                w7Var.f8375a = a.STATIC;
                return w7Var;
            }
            String strA2 = a(p8Var, "IFrameResource");
            if (StringUtils.isValidString(strA2)) {
                w7Var.f8375a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    w7Var.f8376b = Uri.parse(strA2);
                    return w7Var;
                }
                w7Var.f8377c = strA2;
                return w7Var;
            }
            String strA3 = a(p8Var, "HTMLResource");
            if (StringUtils.isValidString(strA3)) {
                w7Var.f8375a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    w7Var.f8376b = Uri.parse(strA3);
                    return w7Var;
                }
                w7Var.f8377c = strA3;
            }
        }
        return w7Var;
    }

    public String b() {
        return this.f8377c;
    }

    public Uri c() {
        return this.f8376b;
    }

    public a d() {
        return this.f8375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        if (this.f8375a != w7Var.f8375a) {
            return false;
        }
        Uri uri = this.f8376b;
        if (uri == null ? w7Var.f8376b != null : !uri.equals(w7Var.f8376b)) {
            return false;
        }
        String str = this.f8377c;
        String str2 = w7Var.f8377c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f8375a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f8376b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f8377c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f8375a + ", resourceUri=" + this.f8376b + ", resourceContents='" + this.f8377c + "'}";
    }

    private static String a(p8 p8Var, String str) {
        p8 p8VarC = p8Var.c(str);
        if (p8VarC != null) {
            return p8VarC.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f8376b = uri;
    }

    public void a(String str) {
        this.f8377c = str;
    }

    public static w7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, HandleInvocationsFromAdViewer.KEY_AD_TYPE, null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        w7 w7Var = new w7();
        w7Var.f8375a = aVarValueOf;
        w7Var.f8376b = uri;
        w7Var.f8377c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return w7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f8375a;
        JsonUtils.putString(jSONObject, HandleInvocationsFromAdViewer.KEY_AD_TYPE, aVar == null ? null : aVar.toString());
        Uri uri = this.f8376b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f8377c);
        return jSONObject;
    }
}
