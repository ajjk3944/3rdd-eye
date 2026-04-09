package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class me0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f30359b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final cs0 f30360a;

    public me0(cs0 localStorage) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        this.f30360a = localStorage;
    }

    public final boolean a(ec ecVar) {
        String strA;
        boolean z10 = false;
        if (ecVar == null || (strA = ecVar.a()) == null) {
            return false;
        }
        synchronized (f30359b) {
            String strD = this.f30360a.d("google_advertising_id_key");
            if (strD != null) {
                if (!strA.equals(strD)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void b(ec ecVar) {
        String strD = this.f30360a.d("google_advertising_id_key");
        String strA = ecVar != null ? ecVar.a() : null;
        if (strD != null || strA == null) {
            return;
        }
        this.f30360a.a("google_advertising_id_key", strA);
    }
}
