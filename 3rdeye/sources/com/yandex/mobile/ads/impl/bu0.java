package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class bu0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f25393c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final cu0 f25394a;

    /* renamed from: b, reason: collision with root package name */
    private final au0 f25395b;

    public bu0(cs0 localStorage) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        this.f25394a = new cu0(localStorage);
        this.f25395b = new au0();
    }

    public final String a() {
        String strA;
        synchronized (f25393c) {
            strA = this.f25394a.a();
            if (strA == null) {
                this.f25395b.getClass();
                strA = au0.a();
                this.f25394a.a(strA);
            }
        }
        return strA;
    }
}
