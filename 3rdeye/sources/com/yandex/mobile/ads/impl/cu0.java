package com.yandex.mobile.ads.impl;

import b9.C1992A;

/* loaded from: classes3.dex */
public final class cu0 {

    /* renamed from: a, reason: collision with root package name */
    private final cs0 f25769a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25770b;

    /* renamed from: c, reason: collision with root package name */
    private String f25771c;

    public cu0(cs0 localStorage) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        this.f25769a = localStorage;
        this.f25770b = new Object();
    }

    public final String a() {
        String str;
        synchronized (this.f25770b) {
            try {
                if (this.f25771c == null) {
                    this.f25771c = this.f25769a.d("YmadMauid");
                }
                str = this.f25771c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void a(String mauid) {
        kotlin.jvm.internal.l.f(mauid, "mauid");
        synchronized (this.f25770b) {
            this.f25771c = mauid;
            this.f25769a.a("YmadMauid", mauid);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
