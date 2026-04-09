package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class ao1 {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Object> f24769a;

    public ao1(Object obj) {
        this.f24769a = new WeakReference<>(obj);
    }

    public final Object getValue(Object obj, w9.i<?> property) {
        kotlin.jvm.internal.l.f(property, "property");
        return this.f24769a.get();
    }

    public final void setValue(Object obj, w9.i<?> property, Object obj2) {
        kotlin.jvm.internal.l.f(property, "property");
        this.f24769a = new WeakReference<>(obj2);
    }
}
