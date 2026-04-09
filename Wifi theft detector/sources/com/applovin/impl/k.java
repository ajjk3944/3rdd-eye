package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6301a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6302b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a, reason: collision with root package name */
        private final String f6307a;

        a(String str) {
            this.f6307a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f6307a;
        }
    }

    public k(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f6302b = str;
        this.f6301a = kVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f6302b.substring(d().length()), 0), C.UTF8_NAME));
                this.f6301a.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return jSONObject;
                }
                this.f6301a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e10) {
                this.f6301a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6301a.O().a("AdToken", "Unable to decode token '" + this.f6302b + "' into JSON", e10);
                }
                this.f6301a.D().a("AdToken", "decodeFullAdResponseStr", e10);
                return null;
            }
        } catch (UnsupportedEncodingException e11) {
            this.f6301a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6301a.O().a("AdToken", "Unable to process ad response from token '" + this.f6302b + "'", e11);
            }
            this.f6301a.D().a("AdToken", "decodeFullAdResponse", e11);
            return null;
        }
    }

    public String b() {
        return this.f6302b;
    }

    public a c() {
        return a(x4.f8611x0) != null ? a.REGULAR : a(x4.f8619y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(x4.f8611x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(x4.f8619y0);
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
        String str = this.f6302b;
        String str2 = ((k) obj).f6302b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f6302b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.f6302b) + ", type=" + c() + '}';
    }

    private String a(x4 x4Var) {
        for (String str : this.f6301a.c(x4Var)) {
            if (this.f6302b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
