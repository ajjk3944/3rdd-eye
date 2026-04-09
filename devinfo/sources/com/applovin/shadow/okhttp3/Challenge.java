package com.applovin.shadow.okhttp3;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import je.u;
import nk.k;
import yj.a;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        String lowerCase;
        k.e(str, "scheme");
        k.e(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                k.d(locale, "US");
                lowerCase = key.toLowerCase(locale);
                k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        k.d(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    @a
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m22deprecated_authParams() {
        return this.authParams;
    }

    @a
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m23deprecated_charset() {
        return charset();
    }

    @a
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m24deprecated_realm() {
        return realm();
    }

    @a
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m25deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                k.d(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        k.d(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return k.a(challenge.scheme, this.scheme) && k.a(challenge.authParams, this.authParams);
    }

    public int hashCode() {
        return this.authParams.hashCode() + u.m(899, 31, this.scheme);
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        k.e(charset, "charset");
        LinkedHashMap linkedHashMapM = w.M(this.authParams);
        String strName = charset.name();
        k.d(strName, "charset.name()");
        linkedHashMapM.put("charset", strName);
        return new Challenge(this.scheme, linkedHashMapM);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String str, String str2) {
        k.e(str, "scheme");
        k.e(str2, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        k.d(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(str, (Map<String, String>) mapSingletonMap);
    }
}
