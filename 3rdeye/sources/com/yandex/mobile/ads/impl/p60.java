package com.yandex.mobile.ads.impl;

import java.util.HashSet;

/* loaded from: classes3.dex */
public final class p60 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f31605a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f31606b = "goog.exo.core";

    public static synchronized String a() {
        return f31606b;
    }

    public static synchronized void a(String str) {
        if (f31605a.add(str)) {
            f31606b += ", " + str;
        }
    }
}
