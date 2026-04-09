package com.yandex.mobile.ads.impl;

import z9.C5870a;
import z9.EnumC5872c;

/* loaded from: classes3.dex */
public final class lh0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f29997a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f29998b;

    static {
        int i = C5870a.f48496e;
        EnumC5872c enumC5872c = EnumC5872c.SECONDS;
        long jW = k8.F.w(10, enumC5872c);
        EnumC5872c enumC5872c2 = EnumC5872c.MILLISECONDS;
        f29997a = C5870a.f(jW, enumC5872c2);
        f29998b = C5870a.f(k8.F.w(30, enumC5872c), enumC5872c2);
        C5870a.f(k8.F.w(3, enumC5872c), enumC5872c2);
    }

    public static int a() {
        return f29997a;
    }
}
