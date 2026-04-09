package com.applovin.impl;

import N7.B8;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.singular.sdk.internal.Constants;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2125j {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19541a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19542b;

    /* renamed from: com.applovin.impl.j$a */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a, reason: collision with root package name */
        private final String f19547a;

        a(String str) {
            this.f19547a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f19547a;
        }
    }

    public C2125j(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f19542b = str;
        this.f19541a = kVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f19542b.substring(d().length()), 0), Constants.ENCODING));
                this.f19541a.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return jSONObject;
                }
                this.f19541a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e4) {
                this.f19541a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f19541a.O().a("AdToken", "Unable to decode token '" + this.f19542b + "' into JSON", e4);
                }
                this.f19541a.E().a("AdToken", "decodeFullAdResponseStr", e4);
                return null;
            }
        } catch (UnsupportedEncodingException e10) {
            this.f19541a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f19541a.O().a("AdToken", B4.f.c(new StringBuilder("Unable to process ad response from token '"), this.f19542b, "'"), e10);
            }
            this.f19541a.E().a("AdToken", "decodeFullAdResponse", e10);
            return null;
        }
    }

    public String b() {
        return this.f19542b;
    }

    public a c() {
        return a(l4.f20067y0) != null ? a.REGULAR : a(l4.f20075z0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(l4.f20067y0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(l4.f20075z0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2125j)) {
            return false;
        }
        String str = this.f19542b;
        String str2 = ((C2125j) obj).f19542b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f19542b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbK = B8.k("AdToken{id=", StringUtils.prefixToIndex(32, this.f19542b), ", type=");
        sbK.append(c());
        sbK.append('}');
        return sbK.toString();
    }

    private String a(l4 l4Var) {
        for (String str : this.f19541a.c(l4Var)) {
            if (this.f19542b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
