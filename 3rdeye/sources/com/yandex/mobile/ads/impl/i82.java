package com.yandex.mobile.ads.impl;

import b9.m;
import java.net.URI;

/* loaded from: classes3.dex */
public final class i82 {

    /* renamed from: a, reason: collision with root package name */
    public static final i82 f28590a = new i82();

    private i82() {
    }

    public static String a(String url) {
        Object objA;
        String str;
        kotlin.jvm.internal.l.f(url, "url");
        try {
            boolean zB0 = y9.q.b0(url, "://", false);
            if (!zB0) {
                url = b(url);
            }
            URI uri = new URI(url);
            if (zB0) {
                str = uri.getScheme() + "://";
            } else {
                str = "";
            }
            objA = str + uri.getHost();
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = "bad_url";
        }
        return (String) objA;
    }

    private static String b(String str) {
        return androidx.work.s.d("stub://", str);
    }
}
