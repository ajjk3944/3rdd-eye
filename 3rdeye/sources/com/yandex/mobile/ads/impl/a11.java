package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class a11 {

    /* renamed from: a, reason: collision with root package name */
    public static final a11 f24364a = new a11();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f24365b;

    private a11() {
    }

    public final synchronized boolean a() {
        return f24365b;
    }

    public final synchronized void b() {
        f24365b = true;
    }
}
