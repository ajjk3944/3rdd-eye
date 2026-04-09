package com.yandex.mobile.ads.impl;

import N7.C1154e9;

/* loaded from: classes3.dex */
public final class se {

    /* renamed from: a, reason: collision with root package name */
    private final te f32949a = new te();

    private static String a(String str) {
        return C1154e9.i("Internal state wasn't completely configured. ", str, ".");
    }

    public static String b() {
        return a("Incorrect integration");
    }

    public final String a(df reason) {
        kotlin.jvm.internal.l.f(reason, "reason");
        this.f32949a.getClass();
        return a(te.a(reason));
    }

    public static String a() {
        return a("Connection timeout");
    }
}
