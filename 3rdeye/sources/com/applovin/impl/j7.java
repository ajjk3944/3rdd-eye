package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private a f19608a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f19609b;

    /* renamed from: c, reason: collision with root package name */
    private String f19610c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private j7() {
    }

    public static j7 a(c8 c8Var, j7 j7Var, com.applovin.impl.sdk.k kVar) {
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (j7Var == null) {
            try {
                j7Var = new j7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                kVar.E().a("VastNonVideoResource", th);
                return null;
            }
        }
        if (j7Var.f19609b == null && !StringUtils.isValidString(j7Var.f19610c)) {
            String strA = a(c8Var, "StaticResource");
            if (URLUtil.isValidUrl(strA)) {
                j7Var.f19609b = Uri.parse(strA);
                j7Var.f19608a = a.STATIC;
                return j7Var;
            }
            String strA2 = a(c8Var, "IFrameResource");
            if (StringUtils.isValidString(strA2)) {
                j7Var.f19608a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    j7Var.f19609b = Uri.parse(strA2);
                    return j7Var;
                }
                j7Var.f19610c = strA2;
                return j7Var;
            }
            String strA3 = a(c8Var, "HTMLResource");
            if (StringUtils.isValidString(strA3)) {
                j7Var.f19608a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    j7Var.f19609b = Uri.parse(strA3);
                    return j7Var;
                }
                j7Var.f19610c = strA3;
            }
        }
        return j7Var;
    }

    public String b() {
        return this.f19610c;
    }

    public Uri c() {
        return this.f19609b;
    }

    public a d() {
        return this.f19608a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        if (this.f19608a != j7Var.f19608a) {
            return false;
        }
        Uri uri = this.f19609b;
        if (uri == null ? j7Var.f19609b != null : !uri.equals(j7Var.f19609b)) {
            return false;
        }
        String str = this.f19610c;
        String str2 = j7Var.f19610c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f19608a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f19609b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f19610c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastNonVideoResource{type=");
        sb.append(this.f19608a);
        sb.append(", resourceUri=");
        sb.append(this.f19609b);
        sb.append(", resourceContents='");
        return B4.f.c(sb, this.f19610c, "'}");
    }

    private static String a(c8 c8Var, String str) {
        c8 c8VarC = c8Var.c(str);
        if (c8VarC != null) {
            return c8VarC.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f19609b = uri;
    }

    public void a(String str) {
        this.f19610c = str;
    }

    public static j7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        j7 j7Var = new j7();
        j7Var.f19608a = aVarValueOf;
        j7Var.f19609b = uri;
        j7Var.f19610c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return j7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f19608a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f19609b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f19610c);
        return jSONObject;
    }
}
