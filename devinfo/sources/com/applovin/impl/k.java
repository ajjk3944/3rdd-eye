package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4350a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4351b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a, reason: collision with root package name */
        private final String f4356a;

        a(String str) {
            this.f4356a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f4356a;
        }
    }

    public k(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f4351b = str;
        this.f4350a = kVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f4351b.substring(d().length()), 0), "UTF-8"));
                this.f4350a.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return jSONObject;
                }
                this.f4350a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e2) {
                this.f4350a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4350a.O().a("AdToken", "Unable to decode token '" + this.f4351b + "' into JSON", e2);
                }
                this.f4350a.D().a("AdToken", "decodeFullAdResponseStr", e2);
                return null;
            }
        } catch (UnsupportedEncodingException e10) {
            this.f4350a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4350a.O().a("AdToken", d.h.w(new StringBuilder("Unable to process ad response from token '"), this.f4351b, "'"), e10);
            }
            this.f4350a.D().a("AdToken", "decodeFullAdResponse", e10);
            return null;
        }
    }

    public String b() {
        return this.f4351b;
    }

    public a c() {
        return a(x4.f6170x0) != null ? a.REGULAR : a(x4.f6178y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(x4.f6170x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(x4.f6178y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.f4351b;
        String str2 = ((k) obj).f4351b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f4351b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbA = d.h.A("AdToken{id=", StringUtils.prefixToIndex(32, this.f4351b), ", type=");
        sbA.append(c());
        sbA.append('}');
        return sbA.toString();
    }

    private String a(x4 x4Var) {
        for (String str : this.f4350a.c(x4Var)) {
            if (this.f4351b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
