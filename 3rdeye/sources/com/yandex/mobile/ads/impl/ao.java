package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final String f24766a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f24767b;

    public ao(String scheme, Map<String, String> authParams) {
        String lowerCase;
        kotlin.jvm.internal.l.f(scheme, "scheme");
        kotlin.jvm.internal.l.f(authParams, "authParams");
        this.f24766a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                kotlin.jvm.internal.l.e(US, "US");
                lowerCase = key.toLowerCase(US);
                kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.l.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f24767b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = this.f24767b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                kotlin.jvm.internal.l.e(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.l.e(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return this.f24767b.get("realm");
    }

    public final String c() {
        return this.f24766a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return kotlin.jvm.internal.l.b(aoVar.f24766a, this.f24766a) && kotlin.jvm.internal.l.b(aoVar.f24767b, this.f24767b);
    }

    public final int hashCode() {
        return this.f24767b.hashCode() + C4121h3.a(this.f24766a, 899, 31);
    }

    public final String toString() {
        return this.f24766a + " authParams=" + this.f24767b;
    }
}
