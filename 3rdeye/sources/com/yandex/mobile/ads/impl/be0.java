package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.do1;

/* loaded from: classes3.dex */
public final class be0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25249a;

    public be0(Object fusedLocationProviderObject) {
        kotlin.jvm.internal.l.f(fusedLocationProviderObject, "fusedLocationProviderObject");
        this.f25249a = fusedLocationProviderObject;
    }

    public final ps0 a() {
        Object objA = do1.a.a(this.f25249a, "getLastLocation", new Object[0]);
        if (objA != null) {
            return new ps0(objA);
        }
        return null;
    }
}
