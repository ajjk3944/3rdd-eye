package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class hf0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f28192a = C5819a.f48360c;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28193b = 0;

    public interface a<T> {
        T a(String str);
    }

    public static final boolean a(Map<String, String> responseHeaders, gh0 httpHeader, boolean z10) {
        kotlin.jvm.internal.l.f(responseHeaders, "responseHeaders");
        kotlin.jvm.internal.l.f(httpHeader, "httpHeader");
        String strA = a(responseHeaders, httpHeader);
        return strA == null ? z10 : Boolean.parseBoolean(strA);
    }

    public static int b(Map map, gh0 httpHeader) {
        kotlin.jvm.internal.l.f(httpHeader, "httpHeader");
        String strA = a(map, httpHeader);
        int i = aa.f24578b;
        if (strA == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strA);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static final ArrayList c(Map responseHeaders, gh0 header) {
        kotlin.jvm.internal.l.f(responseHeaders, "responseHeaders");
        kotlin.jvm.internal.l.f(header, "header");
        return a(responseHeaders, header, new if0());
    }

    public static final String a(Map<String, String> map, gh0 httpHeader) {
        kotlin.jvm.internal.l.f(httpHeader, "httpHeader");
        if (map != null) {
            return map.get(httpHeader.a());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList a(java.util.Map r10, com.yandex.mobile.ads.impl.gh0 r11, com.yandex.mobile.ads.impl.hf0.a r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hf0.a(java.util.Map, com.yandex.mobile.ads.impl.gh0, com.yandex.mobile.ads.impl.hf0$a):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.nio.charset.Charset a(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hf0.a(java.util.Map):java.nio.charset.Charset");
    }
}
